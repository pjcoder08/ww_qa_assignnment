/*  @author: pranav
 * 	This test cases verifies the following scenarios,
 *  5. In the search field, search for meetings for zip code: 10011
 *  6. Print the title of the first result and the distance (located on the right of location title/name)
 *  
 */
package com.ww.testCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.ww.pageObjects.SearchMeetingPage;
import com.ww.pageObjects.WWHomePage_US;

public class TC_0003_Search_Studio_Location extends BasePage {
	
	
	BasePage basePage;
	WWHomePage_US homePage;
	SearchMeetingPage searchMeetingPage;
	
	@Test(priority=3)
	public void searchStudio() {
		logger.info("****************** Starting TC_0003_Search_Studio_Location ******************");
		basePage.driver.get(BASE_URL);
		WWHomePage_US homePage = new WWHomePage_US(driver);
		SearchMeetingPage searchMeetingPage = new SearchMeetingPage(driver);
		homePage.goto_SearchMeetingsPage();
		searchMeetingPage.get_SearchStudiosPageTitle();
		searchMeetingPage.Searchbox();
		searchMeetingPage.click_SearchBtn();
		searchMeetingPage.get_FirstStudioListed();
		logger.info("****************** Finished TC_0003_Search_Studio_Location ******************");
	}

}
