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
import java.util.Collections;

import org.parse4j.Parse;
import org.parse4j.ParseException;
import org.parse4j.ParseObject;
import org.parse4j.ParseQuery;

import com.fasterxml.jackson.databind.JsonNode;
import org.apache.commons.math3.stat.regression.SimpleRegression;

import play.*;
import play.libs.Json;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {
    public static ArrayList<ParseObject> sickChance = new ArrayList<ParseObject>();
    public static ArrayList<ParseObject> sickChanceOne = new ArrayList<ParseObject>();
    public static ArrayList<ParseObject> sickChanceOne1 = new ArrayList<ParseObject>();
    public static ArrayList<ParseObject> rangeCounter = new ArrayList<ParseObject>();
    public static ArrayList<Double> heatIndex = new ArrayList<Double>(); 
    public static ArrayList<Double> bodyTemp = new ArrayList<Double>();
    public static ArrayList<Double> rangeList = new ArrayList<Double>();

	public static Result index() {
		return ok(index.render("Your new application is ready."));
	}
	public static Result login(){
		Logger.debug("------Entered into login() method in Application Controller------");

		Logger.debug("------Exit from login() method in Application Controller------");
		return ok(login.render("Dashboard Page"));
	}
	public static Result dashboard() throws ParseException {
        Date date = new Date();
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
		for (Object thirdGraph : noOfCowsInCattle) {
		    HashMap<String,String> thirdGraphMap = new HashMap<String,String>();
			ParseQuery<ParseObject> queryGraph = ParseQuery.getQuery("MyTestObject");
			queryGraph.orderByDescending("createdAt");
			queryGraph.whereEqualTo("CowID",thirdGraph);
			ParseObject dudu = queryGraph.find().get(0);
			
			if((Integer)dudu.getInt("ChanceOfSick") == 4)
				noOfSickCows.add(dudu);
			
			thirdGraphMap.put("cow", "cow" + thirdGraph.toString());
			thirdGraphMap.put("temperature",dudu.getInt("BodyTemp") +"");
			cowTempArr.add(thirdGraphMap);
		    GregorianCalendar cal = new GregorianCalendar();
            cal.setTime(date);
            date = truncateTime( cal );
            Date d3 = dudu.getCreatedAt();
                d3  =  truncateTime( cal );
            if(0 == d3.compareTo(date) && ((Integer)dudu.getInt("Sick") == 1)){
            notifications.add("Cow"+thirdGraph.toString()+" experienced sudden rise in its body temperature");
            }	
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
        Collections.sort(noOfCows);
        return ok(IndividualCow.render(noOfCows));
        
        
    }

    public static Result predictiveAnalysis() throws ParseException {
        Parse.initialize("f5GFzmulS2Utcgxct7GSTrxAFqdfftPOx9gkf8l8", "DuuCkneE6gphtMnHWaBd2PoZnQRh7tLys9HQ3hSP");
        SimpleRegression regression = new SimpleRegression();
        double range=2;
         ParseQuery<ParseObject> query = ParseQuery.getQuery("MyTestObject");
           try {
                List<ParseObject> rec = query.find();
                 sickChance.addAll(rec);
                for (ParseObject sickness : sickChance) {
                   heatIndex.add(sickness.getDouble("HeatIndex"));
                   bodyTemp.add(sickness.getDouble("BodyTemp"));     
                    }
              } catch (ParseException e) {
                e.printStackTrace();
              }
               for (int i = 0; i < heatIndex.size(); i++) {
                    System.out.println("Index: " + i + " - Item: " + heatIndex.get(i));
                    regression.addData(heatIndex.get(i),bodyTemp.get(i));
                       }
                    double intercept = regression.getIntercept();
                    double slope = regression.getSlope();
                   // double intercept=  77.32183629964312;
                   // double slope = 0.24025203529946648;
                    System.out.println(" Intercept is " + intercept);
                    System.out.println(" slope is " + slope);
                    System.out.println(" Equation of the line  Y= "+ slope + "X + "+ intercept);
                    
                    final ParseQuery<ParseObject> testdetails = ParseQuery.getQuery("MyTestObject");
                    testdetails.orderByDescending("createdAt");
                    //testdetails.whereContains("Sick","1");

               try {System.out.println("Calculating range values ");
                    List<ParseObject> rangeValues = testdetails.find();
                    rangeCounter.addAll(rangeValues);
                    for (ParseObject rangeval : rangeCounter) {
                        System.out.println("In try2 ");
                        int sickVal=rangeval.getInt("Sick");
                        if(sickVal==1)
                        {
                        rangeList.add(rangeval.getDouble("Range"));
                        }
                    }
                    Object obj = Collections.min(rangeList);
                    String r= obj.toString();
                    range = Double.parseDouble(r);
                    System.out.println("Printing Range here: "+range);
                 } catch (ParseException e) {
                      e.printStackTrace();
                   }
                
                final ParseQuery<ParseObject> equadetails = ParseQuery.getQuery("EquationDetails");
                equadetails.orderByDescending("createdAt");
                try {System.out.println("In Updating ");
                    List<ParseObject> recOne = equadetails.find();
                    sickChanceOne.addAll(recOne);
                    for (ParseObject sickness : sickChanceOne) {
                        System.out.println("In updating2 ");
                        double slope1 = sickness.getDouble("Slope");
                        String objId = sickness.getObjectId();
                        System.out.println("retrieving ObjectID " + objId);
                        ParseQuery<ParseObject> updatequery = ParseQuery.getQuery("EquationDetails");
                        updatequery.get(objId);
                        List<ParseObject> recOne1 = updatequery.find();
                        sickChanceOne1.addAll(recOne1);
                        for (ParseObject sickupdate : sickChanceOne1) {
                            System.out.println("In try3 ");
                            sickupdate.put("Slope", slope);
                            sickupdate.put("Intercept", intercept);
                            sickupdate.put("Range", range);
                            sickupdate.save();
                        }
                    }
                }catch (ParseException e1) {
                       e1.printStackTrace();
                   }
        return ok();
    }

    public static void updateChanceOfSick(int chance) throws ParseException{
        ParseObject chanceobject = new ParseObject("ChanceOfSickCounter");
        chanceobject.put("counter", chance);
        chanceobject.save();
        System.out.println("*******Updated remote files.******");
    }

    public static int chanceOfSickness() {
        int chance=0;
        ParseQuery<ParseObject> query = ParseQuery.getQuery("ChanceOfSickCounter");
        query.orderByDescending("createdAt").limit(1);
        List<ParseObject> rec = null;
        try {
            rec = query.find();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        sickChance.addAll(rec);
        for (ParseObject sickness : sickChance) {
            chance = (Integer) sickness.get("counter");
        }
        return chance;
    }

    public static double randDouble(double min, double max) {
        Random random = new Random();
        double range = max - min;
        double scaled = random.nextDouble() * range;
        double randomdouble = scaled + min;
        return randomdouble; // ==
    }

    public static Result simulationProcess() throws ParseException {
        //Parse.initialize("F9nh7vqHu38Mi3WfxaNfeqfxtyPG0P19iEJ6dbtw", "Gs5FtrAnSiEvRyFd2668vtTNq8AXV9mqdQLXDr7f");
            int count = 0;
            Double[] timings = {4.0,7.0,10.0,13.0,16.0,19.0};
            ArrayList<Double> myArray = new ArrayList<Double>();

            int chanceOfSick=0;
        while(count < 6) {
            double range=1.8;
            int sick=0;
            int cowID=1;
            //chanceOfSick=chanceOfSickness();
            int ambtemp = randInt(79, 110);
            int humdity = randInt(39, 101);
            double heatindex = -42.379 + 2.04901523*ambtemp + 10.14333127*humdity - .22475541*ambtemp*humdity - .00683783*ambtemp*ambtemp - .05481717*humdity*humdity + .00122874*ambtemp*ambtemp*humdity + .00085282*ambtemp*humdity*humdity - .00000199*ambtemp*ambtemp*humdity*humdity;
            //double heatindex= 0.5*(ambtemp+61.0+((ambtemp-68.0)*1.2)+(humdity*0.094));
            heatindex= Math.ceil(heatindex);
            double expbodytemp=  (((0.238)*heatindex) + 77);
            double randomgen= randDouble(-1.8, 3.0);
             double genbodytemp=expbodytemp + randomgen;
            if(count < 6 ) {
                if((genbodytemp-expbodytemp)>range)
                {
                    sick=1;
                     if(chanceOfSick== 0)
                    {
                        chanceOfSick=1;
                    }
                    else if(chanceOfSick == 1)
                    {
                        chanceOfSick=2;
                    }
                    else if(chanceOfSick == 2)
                    {
                        chanceOfSick=3;
                    }
                    else if(chanceOfSick == 3)
                    {
                        chanceOfSick=4;
                    }
                    else if(chanceOfSick == 4)
                    {
                        chanceOfSick=4;
                    }
                    else {
                        chanceOfSick= 0;
                    }

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
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
}
