package com.ww.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class WWHomePage_US {
	
	WebDriver driver;
	String Actual_HomePage_US_Title;
	String Expected_HomePage_US_Title="WW (Weight Watchers): Weight Loss & Wellness Help";
	String CURRENT_URL=null;
	String BASE_URL="https://www.weightwatchers.com/us/";
	
	
	public WWHomePage_US(WebDriver driver){
           this.driver = driver;   
	}

	public String getHomePage_US_Title() {
	 	//driver = new ChromeDriver();
        Actual_HomePage_US_Title = driver.getTitle().toString();
        System.out.println("------------------------------------------------------------------------");
        System.out.println("US HomePage title is: "+Actual_HomePage_US_Title);
        System.out.println("------------------------------------------------------------------------");
        return Actual_HomePage_US_Title;
	}
		
	public boolean verifyWWPage_US_Title() {
	System.out.println("Navigating to US home page.........");	
	//driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	System.out.println("------------------------------------------------------------------------");
	System.out.println("US HomePage title is:.... "+Actual_HomePage_US_Title);
	System.out.println("Expected US HomePage title should be:.... "+Expected_HomePage_US_Title);
	System.out.println("------------------------------------------------------------------------");
	return Expected_HomePage_US_Title.equals(Actual_HomePage_US_Title);
	}
	
	public String getHomePage_US_URL() {
	CURRENT_URL = driver.getCurrentUrl();
	System.out.println("the current URL is : "+CURRENT_URL);	
	System.out.println("------------------------------------------------------------------------");
	return CURRENT_URL;
	}
		
	public void verifyHomePage_US_URL() {
		System.out.println("------------------------------------------------------------------------");
		System.out.println("The current URL is:.... "+CURRENT_URL);
		System.out.println("The Actual BASE URL is:.... "+BASE_URL);
		System.out.println("------------------------------------------------------------------------");
		Assert.assertEquals(BASE_URL, CURRENT_URL);		
	}

	public void goto_SearchMeetingsPage() {
		WebElement goto_Studios = driver.findElement(By.className("find-a-meeting"));
		goto_Studios.click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	}

}
