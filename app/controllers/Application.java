package controllers;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.parse4j.Parse;
import org.parse4j.ParseException;
import org.parse4j.ParseObject;
import org.parse4j.ParseQuery;

import play.core.Router.JavascriptReverseRoute;
import play.*;
import play.mvc.*;
import views.html.*;
import play.data.*;

import com.google.gson.Gson;



public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public static Result dashboard() {
        return ok(dashboard.render());
    }
    
    public static Result viewCowDetails() {
        return ok(IndividualCow.render());
        
    }
    
    public static Result viewIndividualCow(String cowIdentifier) throws ParseException {
        System.out.println("cowIdentifier:" + cowIdentifier);
    	Parse.initialize("XIboxpRHULEdPtgn6eL7IlScEW3l0tgRVkeTLyKs", "OofZ3FPeAMsgtdr1xFcT7Fn5iQQylB8EHukX406O");
        int cowId = Integer.valueOf(cowIdentifier);
        Date date = new Date();
        
        List<ParseObject> cowDetails = new ArrayList<ParseObject>();
        List<Map<String, String>> tempByCow = new ArrayList<Map<String, String>>();
        List<Map<String, String>> recentTemp = new ArrayList<Map<String, String>>();
        
        
        ParseQuery<ParseObject> query = ParseQuery.getQuery("MyTestObject");

        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        date = truncateTime( cal );

  
        query.whereEqualTo("CowID",cowId);
        query.orderByDescending("createdAt").limit(4);
        cowDetails = query.find();
       
        for(ParseObject cow: cowDetails){
        	
        	HashMap<String,String> recentFourTemperatures = new HashMap<String,String>();
            recentFourTemperatures.put(cow.getCreatedAt().toString(), cow.getInt("BodyTemp")+"");
            recentTemp.add(recentFourTemperatures);
            System.out.println("recent temp:" +recentTemp);
            
            Date d3 = cow.getCreatedAt();
                d3  =  truncateTime( cal );
            if(0 == d3.compareTo(date)){
            	Map<String, String> temperatureForToday = new HashMap<String, String>();
            	temperatureForToday.put("time", cow.getCreatedAt().toString());
            	temperatureForToday.put("Temperature", cow.getInt("BodyTemp")+"");
                tempByCow.add(temperatureForToday);
               
            }
        }
        
        Gson gson = new Gson();
        String jsonObject = gson.toJson(tempByCow);
        return ok(jsonObject);
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
                controllers.routes.javascript.Application.viewIndividualCow()));
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
        Gson gson = new Gson();
        String jsonResponse = gson.toJson(myArray);
        System.out.println(jsonResponse);
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
