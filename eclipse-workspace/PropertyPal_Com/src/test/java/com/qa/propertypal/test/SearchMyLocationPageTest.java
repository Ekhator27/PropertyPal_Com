package com.qa.propertypal.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.propertypal.base.BaseTest;
import com.qa.propertypal.utilis.Constants;
import com.qa.propertypal.pages.SearchMyLocationPage;
public class SearchMyLocationPageTest extends BaseTest {
	
	@Test
	public void verifySearchMyLocationPageTest() {
		SearchMyLocationPage obj = new SearchMyLocationPage(driver);
		obj.clickPopUpWindowWhenReady();
		obj.doClickSearchBox();
		obj.doClickMyLocation();
		String title = SearchMyLocationPage.SearchMyLocationPageTitle();
		System.out.println("print correct page title is : " + title);
		Assert.assertEquals(title, Constants.SEARCH_MY_LOCATION_PAGE);
	
		
	}
	
	}


