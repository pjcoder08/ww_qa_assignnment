/*@Author: Pranav
 * 		This test cases verifies the following scenarios,
 * 		8. From this location page, print TODAY’s hours of operation (located towards the bottom of the page)
 * 
 */

package com.ww.testCases;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import com.ww.pageObjects.SearchMeetingPage;
import com.ww.pageObjects.StudioPage;
import com.ww.pageObjects.WWHomePage_US;

public class TC_0005_Get_Studio_Hours_Of_Operations extends BasePage{

	BasePage basePage;
	WWHomePage_US homePage;
	SearchMeetingPage searchMeetingPage;
	StudioPage studioPage;
	
	
	
	@Test(priority=5)
	public void getHoursOfOperations() throws IOException {
		logger.info("****************** Starting TC_0005_Get_Studio_Hours_Of_Operations ******************");
		basePage.driver.get(BASE_URL);
		WWHomePage_US homePage = new WWHomePage_US(driver);
		SearchMeetingPage searchMeetingPage = new SearchMeetingPage(driver);
		StudioPage studioPage = new StudioPage(driver);
		homePage.goto_SearchMeetingsPage();
		searchMeetingPage.get_SearchStudiosPageTitle();
		searchMeetingPage.Searchbox();
		searchMeetingPage.click_SearchBtn();
		searchMeetingPage.get_FirstStudioListed();
		searchMeetingPage.gotoFirstStudio_Location();
		searchMeetingPage.get_SelectedFirstStudioPage();
		searchMeetingPage.verify_SelectedFirstStudio();
		studioPage.get_TodaysHoursOfOperations();
		//studioPage.getAllMeetingsList();
		studioPage.logic(studioPage.getAllMeetingsList());
		
		logger.info("****************** Finished TC_0005_Get_Studio_Hours_Of_Operations ******************");
	}
	
}
