package com.qa.propertypal.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.propertypal.base.BaseTest;
import com.qa.propertypal.pages.SearchBT6Page;
import com.qa.propertypal.pages.UsersSearchSO14Page;
import com.qa.propertypal.utilis.Constants;

public class SearchBT6PageTest extends BaseTest{

	@Test
	public void SearchBT6PageTest() {
		SearchBT6Page obj = new SearchBT6Page(driver);
		obj.clickPopUpWindowWhenReady();
		obj.doClickSearchBox();
		obj.doClickLocation();
		obj.waitForElementVisible();
		String title = SearchMyLocationPage.SearchMyLocationPageTitle();
		System.out.println("print correct page title is : " + title);
		Assert.assertEquals(Constants.BT6_SEARCH_MY_LOCATION_PAGE, 30);
			
	}

	
}
