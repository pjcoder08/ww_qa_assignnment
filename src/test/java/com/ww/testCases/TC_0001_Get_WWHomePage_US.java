/*  @author: pranav

	 * 	This test cases verifies the following scenarios,
	 *  1. Navigate to https://www.weightwatchers.com/us/	
	 *  2. Verify loaded page title matches “WW (Weight Watchers): Weight Loss & Wellness Help”
	 */
package com.ww.testCases;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ww.pageObjects.WWHomePage_US;

public class TC_0001_Get_WWHomePage_US extends BasePage {

		BasePage basePage;
		WWHomePage_US homePage;
		String CURRENT_URL1;


		@Test(priority=1)
		public void navigate_WWPage_US() {
			logger.info("****************** Starting TC_0001_Get_WWHomePage_US  ******************");
			basePage.driver.get(BASE_URL);
			WWHomePage_US homePage = new WWHomePage_US(driver);
			homePage.getHomePage_US_URL();
			homePage.verifyHomePage_US_URL();
			homePage.getHomePage_US_Title();
			if(homePage.verifyWWPage_US_Title()==true) {
				AssertJUnit.assertTrue(true);
				System.out.println("IT's A MATCH:.....Title for US HomePage ");
			}
			else {
				AssertJUnit.assertTrue(false);
				System.out.println("HomePage Title does not match the expected page title");
			}
			//Assert.assertEquals(Actual_HomePage_US_Title, Expected_HomePage_US_Title);
			logger.info("****************** Finished TC_0001_Get_WWHomePage_US  ******************");
		}
}
