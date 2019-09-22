/*Title: BasePage class for before and after test task execution.
 * @author: Pranav
 * 
 */
package com.ww.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class BasePage {
	
	public static WebDriver driver;
	public Logger logger;
	public static final String BASE_URL="https://www.weightwatchers.com/us/";
	public static final String EXPECTED_TITLE="WW (Weight Watchers): Weight Loss & Wellness Help";
	static String driverPath = System.getProperty("user.dir");
	private String CURRENT_URL;
	String title_WW_Page_US="";
	
	
	
	@BeforeClass
	public void setUp() {
		  System.out.println("Launching google chrome with new profile..");
	      System.setProperty("webdriver.chrome.driver", driverPath+ "/Drivers/chromedriver");	
	      driver =new ChromeDriver();
	      driver.manage().window().maximize();
	      //driver.get(BASE_URL);
	}
	
	@BeforeClass
	public void setup() {
		logger=Logger.getLogger("WW_UI_AUTOMATION"); //added Logger
		PropertyConfigurator.configure("log4j.properties");
		logger.setLevel(Level.DEBUG);
	}
	
	@AfterMethod
	@AfterClass()
	public void tearDown() {
		driver.quit();
	}
}
