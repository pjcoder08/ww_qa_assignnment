/*Author: @Pranav
 * This test cases verifies the following scenario,
 * 7. Click on the first search result and then, 
 *    verify displayed location name/title matches with the name of the first searched result that was clicked.
 */
package com.ww.testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ww.pageObjects.SearchMeetingPage;
import com.ww.pageObjects.WWHomePage_US;

public class TC_0004_Select_First_Studio_Location extends BasePage{
	
	BasePage basePage;
	WWHomePage_US homePage;
	SearchMeetingPage searchMeetingPage;
	
	
	@Test(priority=4)
	public void select_First_Studio_Location() {
		logger.info("****************** Starting TC_0004_Select_First_Studio_Location ******************");
		basePage.driver.get(BASE_URL);
		WWHomePage_US homePage = new WWHomePage_US(driver);
		SearchMeetingPage searchMeetingPage = new SearchMeetingPage(driver);
		homePage.goto_SearchMeetingsPage();
		searchMeetingPage.get_SearchStudiosPageTitle();
		searchMeetingPage.Searchbox();
		searchMeetingPage.click_SearchBtn();
		searchMeetingPage.get_FirstStudioListed();
		searchMeetingPage.gotoFirstStudio_Location();
		searchMeetingPage.get_SelectedFirstStudioPage();
		//searchMeetingPage.verify_SelectedFirstStudio();
		if(searchMeetingPage.verify_SelectedFirstStudio()) {
			AssertJUnit.assertTrue(true);
			System.out.println("IT's A MATCH:.....First Studio name listed and selected studio are the same. ");
		}
		else {
			AssertJUnit.assertTrue(false);
			System.out.println("It's not a Match!....selected studio and fist name listed in list does not match");
		}
		logger.info("****************** Finished TC_0004_Select_First_Studio_Location ******************");
	}

}
