package com.qa.propertypal.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.qa.propertypal.utilis.Constants;
import com.qa.propertypal.utilis.ElementUtilis;

public class SearchBT6Page {
	
	private static final String nextButton = null;
	private ElementUtilis elementUtilis;
	WebElement ele;
	// Search using "BT6" in the search bar and assert that results are accurate for that location.
	
	private WebDriver driver;

	// page locators : BY locators :
		private By Searchbar = By.cssSelector("form[id='searchForm']>div>div:nth-child(1)>section>input");
		private By Mylocation = By.cssSelector("form[id='searchForm']>div>div>div>div>div>a>strong");
		private By SearchButton = By.cssSelector("[class='search-btns ']");
		private By PopLink = By.cssSelector("button[type='button']:nth-child(2)");
		private By PropertyList = By.cssSelector("div[class='sr-widecol']>ul>li[data-space]");
		private By Next = By.cssSelector("ul[class='paging']>li");

		// page constructor:
		public SearchBT6Page(WebDriver driver) {
			elementUtilis = new ElementUtilis(driver);
	
		}

		// page actions:
		public String SearchMyLocationPageTitle() {
			return elementUtilis.waitForTitleToBe(Constants.BT6_SEARCH_MY_LOCATION_PAGE, 30);
		}
		
		public void clickPopUpWindowWhenReady() {
			elementUtilis.clickWhenReady(PopLink, 30);
		}
		
		public void doClickSearchBox() {
			elementUtilis.doSendKeys(Searchbar, "BT6");
		}
		
		public void doClickLocation() {
			elementUtilis.doActionsSendKeys(Searchbar, Keys.ENTER);
		}
		
		public void waitForElementVisible() {
			elementUtilis.waitForElementVisible(PropertyList, 50);
		
	}
		
		public void doLoopAndCount() {
		String propertiesList = null;
		String Next;
		String text = null;
		elementUtilis.doLoopAndCount(propertiesList, nextButton, text);
		}

		
			
		}

