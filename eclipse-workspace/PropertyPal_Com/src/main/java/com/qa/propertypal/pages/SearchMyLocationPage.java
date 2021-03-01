package com.qa.propertypal.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.qa.propertypal.utilis.Constants;
import com.qa.propertypal.utilis.ElementUtilis;

public class SearchMyLocationPage {
	
	private ElementUtilis elementUtilis;
	WebElement ele;

	//private WebDriver driver;

	// Search using "My Location" and assert that results are accurate to users
	// current location.

	// page locators : BY locators :
	private By Searchbar = By.cssSelector("form[id='searchForm']>div>div:nth-child(1)>section>input");
	private By Mylocation = By.cssSelector("a[class='suggestions-location']");
	private By PopLink = By.cssSelector("button[type='button']:nth-child(2)");

	// page constructor:
	public SearchMyLocationPage(WebDriver driver) {
		elementUtilis = new ElementUtilis(driver);
	}

	// page actions:
	public String SearchMyLocationPageTitle() {
		return elementUtilis.waitForTitleToBe(Constants.SEARCH_MY_LOCATION_PAGE, 30);
	}
	

	public void clickPopUpWindowWhenReady() {
		elementUtilis.clickWhenReady(PopLink, 30);
	}
	
	public void doClickSearchBox() {
		elementUtilis.clickWhenReady(Searchbar, 30);
	}
	
	public void doClickMyLocation() {
		elementUtilis.waitForElementPresent(Mylocation, 30);
		elementUtilis.doClick(Mylocation);
		elementUtilis.doActionsSendKeys(Searchbar, Keys.ENTER);
	}
	
}
