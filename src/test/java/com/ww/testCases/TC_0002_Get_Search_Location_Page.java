/* Test cases covers following scenarios,
 *  3. On the right corner of the page, click on “Find a Studio”
 *  4. Verify loaded page title contains “Find WW Studios & Meetings Near You | WW USA”
 *  author: @pranav
 */
package com.ww.testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ww.pageObjects.SearchMeetingPage;
import com.ww.pageObjects.WWHomePage_US;

public class TC_0002_Get_Search_Location_Page extends BasePage {
	
	BasePage basePage;
	WWHomePage_US homePage;
	SearchMeetingPage searchMeetingPage;
	
	
	@Test(priority=2)
	public void getSearchStudiosPage() {
		logger.info("****************** Starting TC_0002_Get_Search_Location_Page ******************");
		basePage.driver.get(BASE_URL);
		WWHomePage_US homePage = new WWHomePage_US(driver);
	    SearchMeetingPage searchMeetingPage = new SearchMeetingPage(driver);
		homePage.goto_SearchMeetingsPage();
		searchMeetingPage.get_SearchStudiosPageTitle();
		searchMeetingPage.verify_SearchStudiosPageTitle();
		if(searchMeetingPage.verify_SearchStudiosPageTitle()) {
			AssertJUnit.assertTrue(true);
			System.out.println("IT's A MATCH:.....Search Studio page Title matches expected title ");
		}
		else {
			AssertJUnit.assertTrue(false);
			System.out.println("Search Studio page Title does not match the expected page title");
		}
		logger.info("****************** Finished TC_0002_Get_Search_Location_Page ******************");
	}

}
