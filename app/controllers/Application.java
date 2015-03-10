package controllers;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Random;

import org.parse4j.Parse;
import org.parse4j.ParseException;
import org.parse4j.ParseObject;
import org.parse4j.ParseQuery;

import com.fasterxml.jackson.databind.JsonNode;

import play.*;
import play.libs.Json;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {

	public static Result index() {
		return ok(index.render("Your new application is ready."));
	}
	public static Result login(){
		Logger.debug("------Entered into login() method in Application Controller------");

		Logger.debug("------Exit from login() method in Application Controller------");
		return ok(login.render("Dashboard Page"));
	}
	public static Result dashboard() throws ParseException {

		//play.mvc.Http.Context.current().session().put("hi", "eww");
		ArrayList<Integer> chartvalues = new ArrayList<Integer>();
		chartvalues.add(65);
		chartvalues.add(59);
		chartvalues.add(90);
		chartvalues.add(81);

		JsonNode myJsonNode = Json.toJson(chartvalues);
		String jsonResult = Json.stringify(myJsonNode);
		
		List<ParseObject> cowObjects = new ArrayList<ParseObject>();
		Set<Object> noOfCowsInCattle = new HashSet<Object>();
		ArrayList<ParseObject> noOfSickCows = new ArrayList<ParseObject>();
		List<String> notifications = new ArrayList<String>();
		
		String statusOk = "Abnormal";

		//Parse.initialize("XIboxpRHULEdPtgn6eL7IlScEW3l0tgRVkeTLyKs", "OofZ3FPeAMsgtdr1xFcT7Fn5iQQylB8EHukX406O");
		
		Parse.initialize("f5GFzmulS2Utcgxct7GSTrxAFqdfftPOx9gkf8l8", "DuuCkneE6gphtMnHWaBd2PoZnQRh7tLys9HQ3hSP");
		ParseQuery<ParseObject> query = ParseQuery.getQuery("MyTestObject");
		query.orderByDescending("createdAt");
		cowObjects = query.find();	
		
		ParseObject heatIndex =  cowObjects.get(0);
		double HI = 0.5 * (heatIndex.getInt("AmbientTemp") + 61.0 + ((heatIndex.getInt("AmbientTemp") - 68.0) * 1.2) + (heatIndex.getInt("Humidity") * 0.094));
		
		for(ParseObject cowObject : cowObjects){
			
			noOfCowsInCattle.add(cowObject.get("CowID"));
		}
		
		ArrayList<HashMap> cowTempArr = new ArrayList<HashMap>();
		HashMap<String,String> thirdGraphMap = new HashMap<String,String>();
		for (Object thirdGraph : noOfCowsInCattle) {
			ParseQuery<ParseObject> queryGraph = ParseQuery.getQuery("MyTestObject");
			queryGraph.orderByDescending("createdAt");
			queryGraph.whereEqualTo("CowID",thirdGraph);
			ParseObject dudu = queryGraph.find().get(0);
			
			if((Integer)dudu.getInt("ChanceOfSick") == 4)
				noOfSickCows.add(dudu);
			
			thirdGraphMap.put("cow", "cow" + thirdGraph.toString());
			thirdGraphMap.put("temperature",dudu.getInt("BodyTemp") +"");
			cowTempArr.add(thirdGraphMap);
			notifications.add("Cow"+thirdGraph.toString()+" experienced sudden rise in its body temperature");
			
		}
		
		if(noOfSickCows.size() == 0){
			statusOk = "OK";
		}
		
		JsonNode JsonNode = Json.toJson(cowTempArr);
		String myjsonResult = Json.stringify(JsonNode);
		
		JsonNode JsonNodeNote = Json.toJson(notifications);
		String notify = Json.stringify(JsonNodeNote);
		System.out.println("myjsonResult: "+ myjsonResult);

		return ok(dashboard.render("HelloWorld",noOfCowsInCattle.size()+"",statusOk,noOfSickCows.size()+"",jsonResult,HI+"",myjsonResult,notifications));
	}
	/*public static Result viewIndividualCow(int CowID) throws ParseException {
		//GET		/cow						controllers.Application.viewIndividualCow()

		CowID = 1;
		
		Date date = new Date();
		HashMap<Integer,HashMap<String,String>> TodayTempVsTime = new HashMap<Integer,HashMap<String,String>>();
		HashMap<Integer,HashMap<String,String>> recentTempVsTime = new HashMap<Integer,HashMap<String,String>>();
		List<ParseObject> cowDetails = new ArrayList<ParseObject>();
		HashMap<String,String> temperatureForToday = new HashMap<String,String>();
		HashMap<String,String> recentFourTemperatures = new HashMap<String,String>();
		Parse.initialize("f5GFzmulS2Utcgxct7GSTrxAFqdfftPOx9gkf8l8", "DuuCkneE6gphtMnHWaBd2PoZnQRh7tLys9HQ3hSP");
		ParseQuery<ParseObject> query = ParseQuery.getQuery("MyTestObject");

		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(date);
		date = truncateTime( cal );

		query.whereEqualTo("CowID",CowID);
		query.limit(4);
		cowDetails = query.find();
		for(ParseObject cow: cowDetails){
			recentFourTemperatures.put(cow.getCreatedAt().toString(), cow.getInt("BodyTemp")+"");
			Date d3 = cow.getCreatedAt();
				d3  =  truncateTime( cal );
			if(0 == d3.compareTo(date)){
				temperatureForToday.put(cow.getCreatedAt().toString(), cow.getInt("BodyTemp")+"");
			}
		}
		TodayTempVsTime.put(CowID, temperatureForToday);
		recentTempVsTime.put(CowID, recentFourTemperatures);

		return ok(cow.render("Your new application is ready."));
	}
	private static Date truncateTime(Calendar cal) {
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return new Date(cal.getTime().getTime());
	}*/
	public static Result viewIndividualCow(String cowIdentifier) throws ParseException {
        System.out.println("cowIdentifier:" + cowIdentifier);
    	//Parse.initialize("XIboxpRHULEdPtgn6eL7IlScEW3l0tgRVkeTLyKs", "OofZ3FPeAMsgtdr1xFcT7Fn5iQQylB8EHukX406O");
        Parse.initialize("f5GFzmulS2Utcgxct7GSTrxAFqdfftPOx9gkf8l8", "DuuCkneE6gphtMnHWaBd2PoZnQRh7tLys9HQ3hSP");
        int cowId = Integer.valueOf(cowIdentifier);
        Date date = new Date();
        
        List<ParseObject> cowDetails = new ArrayList<ParseObject>();
        List<Map<String, String>> tempByCow = new ArrayList<Map<String, String>>();
        
        ParseQuery<ParseObject> query = ParseQuery.getQuery("MyTestObject");

        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        date = truncateTime( cal );

        query.whereEqualTo("CowID",cowId);
        query.orderByDescending("createdAt").limit(4);
        cowDetails = query.find();
       
        for(ParseObject cow: cowDetails){
        	
            Date d3 = cow.getCreatedAt();
                d3  =  truncateTime( cal );
            if(0 == d3.compareTo(date)){
            	Map<String, String> temperatureForToday = new HashMap<String, String>();
            	temperatureForToday.put("time", cow.getCreatedAt().toString());
            	temperatureForToday.put("Temperature", cow.getInt("BodyTemp")+"");
                tempByCow.add(temperatureForToday);
               
            }
        }
        
        JsonNode JsonNode = Json.toJson(tempByCow);
        
		String myjsonResult = Json.stringify(JsonNode);
		
        return ok(myjsonResult);
    }
	public static Result secondGraph(String cowIdentifier) throws ParseException {
        System.out.println("cowIdentifier:" + cowIdentifier);
        
        Parse.initialize("f5GFzmulS2Utcgxct7GSTrxAFqdfftPOx9gkf8l8", "DuuCkneE6gphtMnHWaBd2PoZnQRh7tLys9HQ3hSP");
        int cowId = Integer.valueOf(cowIdentifier);
        
        List<ParseObject> cowDetails = new ArrayList<ParseObject>();
        List<Map<String, String>> recentTemp = new ArrayList<Map<String, String>>();
        
        
        ParseQuery<ParseObject> query = ParseQuery.getQuery("MyTestObject");

        query.whereEqualTo("CowID",cowId);
        query.orderByDescending("createdAt").limit(4);
        cowDetails = query.find();
       
        for(ParseObject cow: cowDetails){
        	
        	HashMap<String,String> recentFourTemperatures = new HashMap<String,String>();
        	recentFourTemperatures.put("time", cow.getCreatedAt().toString());
        	recentFourTemperatures.put("Temperature", cow.getInt("BodyTemp")+"");
            recentTemp.add(recentFourTemperatures);
        }
        
        JsonNode JsonNodeRecent = Json.toJson(recentTemp);
		String JsonNodeRecentResult = Json.stringify(JsonNodeRecent);
		
        return ok(JsonNodeRecentResult);
    }
    private static Date truncateTime(Calendar cal) {
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return new Date(cal.getTime().getTime());
    }
    
    public static Result javascriptRoutes() {
        response().setContentType("text/javascript");
		return ok(
                play.Routes.javascriptRouter("jsRoutes",
                controllers.routes.javascript.Application.viewIndividualCow(),
                controllers.routes.javascript.Application.secondGraph()));
    }
    public static Result viewCowDetails() throws ParseException {
    	
    	List<ParseObject> cowObjects = new ArrayList<ParseObject>();
		Set<String> noOfCowsInCattle = new HashSet<String>();
		List<String> noOfCows = new ArrayList<String>();
		
    	Parse.initialize("f5GFzmulS2Utcgxct7GSTrxAFqdfftPOx9gkf8l8", "DuuCkneE6gphtMnHWaBd2PoZnQRh7tLys9HQ3hSP");
    	ParseQuery<ParseObject> query = ParseQuery.getQuery("MyTestObject");
		query.orderByDescending("createdAt");
		cowObjects = query.find();	
		
		for(ParseObject cowObject : cowObjects){
			
			noOfCowsInCattle.add(cowObject.get("CowID").toString());
		}
		noOfCows.addAll(noOfCowsInCattle);
        return ok(IndividualCow.render(noOfCows));
        
        
    }

    public static Result simulationProcess() throws ParseException {
        //Parse.initialize("F9nh7vqHu38Mi3WfxaNfeqfxtyPG0P19iEJ6dbtw", "Gs5FtrAnSiEvRyFd2668vtTNq8AXV9mqdQLXDr7f");
            int count = 0;
            Double[] timings = {4.0,7.0,10.0,13.0,16.0,19.0};
            ArrayList<Double> myArray = new ArrayList<Double>();

        while(count < 6) {
            int sick=0;
            int ambtemp = randInt(79, 107);
            int humdity = randInt(39, 101);
            double heatindex= 0.5*(ambtemp+61.0+((ambtemp-68.0)*1.2)+(humdity*0.094));
            heatindex= Math.ceil(heatindex);
            double expbodytemp= (4/13)*heatindex + 25;
            int randomgen= randInt(0, 5);
             double genbodytemp=expbodytemp + randomgen;
            if(count < 6 ) {
                if((genbodytemp-expbodytemp)>2)
                {
                    sick=1;
                    System.out.println("Ambient Temperature " + ambtemp);
                    System.out.println("Humidity " + humdity);
                    System.out.println("HeatIndex " + heatindex);
                    System.out.println("Expected body temperature " + expbodytemp);
                    System.out.println("Measured body temperature " + genbodytemp);
                    System.out.println("Sick " + sick);
                    System.out.println("-------------------------------------------------");
                    myArray.add(timings[count]);
                    myArray.add(genbodytemp);
                    count = count + 1;
                }

            }
            else {
                break;
            }
        }
        System.out.println(myArray);
        return ok(simulate.render(myArray));
    }

    public static int randInt(int min, int max) {

        // NOTE: Usually this should be a field rather than a method
        // variable so that it is not re-seeded every call.
        Random rand = new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }
}
