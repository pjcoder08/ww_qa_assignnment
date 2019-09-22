/*Page: Studio Page class  contains following methods,
 * 1. get Studios today's hours of operations
 * 2. 
 * 
 * @Author: Pranav
 */
package com.ww.pageObjects;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.*;

//import practice.NumberOfMeetings.DAYS;

public class StudioPage {
	
	private WebDriver driver;
	private static String LIST_TODAYS_HOURS_OF_OPERATIONS;
	private static String TODAYS_HOURS_OF_OPERATIONS;
	String day = "";
    public static String REGEX = "\\d*:\\d* [AP]M";
    Map<String, ArrayList<String>> map = new LinkedHashMap();

	private static final String css_TODAYS_HOURS_OF_OPERATIONS="hours-list--currentday";
	
	
	
	
	public StudioPage(WebDriver driver){
        this.driver = driver;
	}
	
	
	
	public String get_TodaysHoursOfOperations() {
		List<WebElement> LIST_TODAYS_HOURS_OF_OPERATIONS= driver.findElements(By.className(css_TODAYS_HOURS_OF_OPERATIONS));
		TODAYS_HOURS_OF_OPERATIONS = LIST_TODAYS_HOURS_OF_OPERATIONS.get(0).getText();
		System.out.println("---------------------Today's hours of operations------------------------");
		System.out.println("TODAY’s hours of operation: "+"\n"+TODAYS_HOURS_OF_OPERATIONS);
		System.out.println("-----------------------------------------------------------------------");
		return TODAYS_HOURS_OF_OPERATIONS;
	}
	
	public enum DAYS {
        SUN, MON, TUE, WED, THU, FRI, SAT
    }

    public static boolean contains(String day) {
        for (DAYS c : DAYS.values()) {
            if (c.name().equals(day)) {
                return true;
            }
        }
        return false;
    }
		 
	    
	public String getAllMeetingsList() throws IOException {
		//String day = "";
		//List<WebElement> meetingSchedule = driver.findElements(By.className("meeting-schedule__schedule"));
		
		Map<String, ArrayList<String>> map = new LinkedHashMap<String, ArrayList<String>>();
		WebElement meetingSchedule = driver.findElement(By.className("meeting-schedule__schedule"));
		String MEETINGSCHEDULE_ASSTRING=meetingSchedule.getText().toString();
		//System.out.print(MEETINGSCHEDULE_ASSTRING);
		return MEETINGSCHEDULE_ASSTRING;
	}

    public void logic(String myLongString) {
        new BufferedReader(new StringReader(myLongString)).lines().forEach(this::parseString);
        // display report
        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry dayOfTheWeek = (Map.Entry)iterator.next();
            System.out.println(dayOfTheWeek.getKey());
            countFrequencies((ArrayList)dayOfTheWeek.getValue());
        }
    }

    private void parseString(String line) {
        // compute
        if (contains(line)) {
            day = line;
            map.put(day, new ArrayList<String>());
        } else if (line.matches(REGEX)){
            // ignore
        } else {
            map.get(day).add(line);
        }
    }

    public static void countFrequencies(ArrayList<String> list){
        // hashmap to store the frequency of element
        Map<String, Integer> hm = new HashMap<String, Integer>();
        for(String consultants: list) {
    		if(hm.containsKey(consultants)) {
    			hm.put(consultants, hm.get(consultants)+1);	
    		}
    		else{
    			hm.put(consultants, 1);
    			}	
    		}
        for (Map.Entry<String, Integer> val : hm.entrySet())
            System.out.println(val.getKey() + " - " + val.getValue());
    }
    
}