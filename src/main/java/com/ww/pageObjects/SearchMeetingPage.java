/*Title: SearchMeetings Page class  contains following methods,
 * 		 1. Get Search studio Page title
 * 		 2. Verify Search studio Page title
 * 		 3. Perform studio Search action
 * 		 4. Get First studio listed in the returned search list (Name & distance)
 * 		 5. Go to first studio location present in the list
 * 		 6. Get name of Selected first studio from the list
 *       7. 7. Verify Selected first location name and First name listed in the all studios list
 * @author: Pranav
 * 
 */
package com.ww.pageObjects;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SearchMeetingPage {
	  
	private WebDriver driver;
	String ACTUAL_STUDIOS_PAGE_TITLE;
	private static String SEARCHSTUDIOS_BOX;
	private static String SEARCH_BTN;
	private static String FIRST_STUDIO_NAME;
	private static String LIST_ALL_STUDIOS;
	private static String CLICK_FIRST_STUDIO;
	private static String NAME_SELECTED_FIRST_LOCATION;
	private static String SELECTED_FIRST_LOCATION_PAGE;
	
	
	private static final String id_SEARCHSTUDIOS_BOX="meetingSearch";
	private static final String css_SEARCH_BTN="button.btn.spice-translated";
	private static final String css_FIRST_LOCATION="location__top";
	private static final String css_CLICK_FIRST_STUDIO="location__name";
	private static final String css_NAME_SELECTED_FIRST_LOCATION="location__name";
	
    String EXPECTED_STUDIOS_PAGE_TITLE="Find WW Studios & Meetings Near You | WW USA";
	private static final String INPUT_SEARCH_STUDIOS_BOX="10011";
	
	
	public SearchMeetingPage(WebDriver driver){
        this.driver = driver;
	}
	
	//1. Get Search studio Page title
	public String get_SearchStudiosPageTitle() {
		ACTUAL_STUDIOS_PAGE_TITLE=driver.getTitle();
		System.out.println("Actual Page Title for Search Studios Page:...."+ACTUAL_STUDIOS_PAGE_TITLE);
		return ACTUAL_STUDIOS_PAGE_TITLE;	
	}
	
	//2. Verify Search studio Page title
	public boolean verify_SearchStudiosPageTitle() {
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Actual Page Title for Search Studios Page:...."+ACTUAL_STUDIOS_PAGE_TITLE);
		System.out.println("Expected Page Title for Search Studios Page:...."+EXPECTED_STUDIOS_PAGE_TITLE);
		System.out.println("------------------------------------------------------------------------");
		System.out.println(ACTUAL_STUDIOS_PAGE_TITLE.equals(EXPECTED_STUDIOS_PAGE_TITLE));
		
		//Assert.assertEquals("Find WW Studios & Meetings Near You | WW USA","Find WW Studios & Meetings Near You | WW USA");
		return EXPECTED_STUDIOS_PAGE_TITLE.equals(ACTUAL_STUDIOS_PAGE_TITLE);
		//(EXPECTED_STUDIOS_PAGE_TITLE.equals(ACTUAL_STUDIOS_PAGE_TITLE));
	}
	
	 //3. Perform studio Search action
	public void Searchbox() {
		WebElement SEARCHSTUDIOS_BOX = driver.findElement(By.id(id_SEARCHSTUDIOS_BOX));
		SEARCHSTUDIOS_BOX.sendKeys(INPUT_SEARCH_STUDIOS_BOX);
		System.out.println("Search Studio by zip -"+INPUT_SEARCH_STUDIOS_BOX);
	}
	
	public void  click_SearchBtn() {
		WebElement SEARCH_BTN = driver.findElement(By.cssSelector(css_SEARCH_BTN));
		SEARCH_BTN.click();		
	}
	
	 //4. Get First studio listed in the returned search list (Name & distance)	
	public String get_FirstStudioListed() {
		 	List<WebElement> LIST_ALL_STUDIOS = driver.findElements(By.className(css_FIRST_LOCATION));
		 		String FIRST_STUDIO_NAME_string = LIST_ALL_STUDIOS .get(0).getText().trim();
		 		FIRST_STUDIO_NAME = FIRST_STUDIO_NAME_string.split("\n")[0];
		 		System.out.println("------------------------------------------------------------------------");
		 		System.out.println("\n"+"First Studio in the search result is: "+"\n"+FIRST_STUDIO_NAME+"\n");
		 		System.out.println("------------------------------------------------------------------------");
		 		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		 	return  FIRST_STUDIO_NAME;
	}
	
	 //5. Go to first studio location present in the list
	public void gotoFirstStudio_Location() {
		 WebElement CLICK_FIRST_STUDIO = driver.findElement(By.className(css_CLICK_FIRST_STUDIO));
		 CLICK_FIRST_STUDIO.click();	
	}
	
	//6. Get name of Selected first studio from the list
	public String get_SelectedFirstStudioPage() {
		WebElement SELECTED_FIRST_LOCATION_PAGE= driver.findElement(By.className(css_NAME_SELECTED_FIRST_LOCATION));
	    NAME_SELECTED_FIRST_LOCATION = SELECTED_FIRST_LOCATION_PAGE.getText().toString();
		return NAME_SELECTED_FIRST_LOCATION;		
	}

	//7. Verify Selected first location name and First name listed in the all studios list
	public boolean verify_SelectedFirstStudio() {
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Studio Name of first listed studio:...."+FIRST_STUDIO_NAME);
		System.out.println("Selected First Studio name from the search list:...."+NAME_SELECTED_FIRST_LOCATION);
		System.out.println("------------------------------------------------------------------------");
		return NAME_SELECTED_FIRST_LOCATION.equals(FIRST_STUDIO_NAME);		
	}
}
