package com.qa.propertypal.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.propertypal.utilis.Constants;
import com.qa.propertypal.utilis.ElementUtilis;

public class UsersSearchSO14Page {

	private ElementUtilis elementUtilis;
	WebElement ele;

	// page locators : BY locators :
	private By Searchbar = By.cssSelector("form[id='searchForm']>div>div:nth-child(1)>section>input");
	private By PopLink = By.cssSelector("button[type='button']:nth-child(2)");

	// Users should also check for a scenario where resultset has no properties.

	// page constructor:
	public UsersSearchSO14Page(WebDriver driver) {
		elementUtilis = new ElementUtilis(driver);

	}

	// page actions:
	public String UsersSearchSO14PageTitle() {
		return elementUtilis.waitForTitleToBe(Constants.SO14_SEARCH_MY_LOCATION_PAGE, 30);
	}

	public void clickPopUpWindowWhenReady() {
		elementUtilis.clickWhenReady(PopLink, 30);
	}

	public void doClickSearchBox() {
		elementUtilis.doSendKeys(Searchbar, "SO14");
	}

	public void doClickLocation() {
		elementUtilis.doActionsSendKeys(Searchbar, Keys.ENTER);
	}
}
