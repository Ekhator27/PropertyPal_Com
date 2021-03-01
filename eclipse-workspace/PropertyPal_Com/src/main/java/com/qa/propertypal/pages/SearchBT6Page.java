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
			return elementUtilis.waitForTitleToBe(Constants.SO14_SEARCH_MY_LOCATION_PAGE, 30);
		}
		
//		public void LoopAndCountProperties()
//		{
//		
//		}
//	
//		public void doSearchBT6(String location)
//		{
//			 WebDriverWait wait2 = new WebDriverWait(driver, 30);
//			    wait2.until(ExpectedConditions.elementToBeClickable(PopLink));
//			    
//			    driver.findElement(PopLink).click();
//			    
//				WebDriverWait wait = new WebDriverWait(driver, 30);
//				wait.until(ExpectedConditions.visibilityOfElementLocated(Searchbar));
//				
//				driver.findElement(Searchbar).click();
//				
//				driver.findElement(Searchbar).sendKeys(location);
//				driver.findElement(Searchbar).sendKeys(Keys.ENTER);
//				
//				WebDriverWait wait1 = new WebDriverWait(driver, 30);
//				wait1.until(ExpectedConditions.visibilityOfElementLocated(PropertyList));
//					
//				
//		}
//	
//
}
