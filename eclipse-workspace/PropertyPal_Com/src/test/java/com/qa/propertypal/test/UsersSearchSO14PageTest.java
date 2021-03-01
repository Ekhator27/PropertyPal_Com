package com.qa.propertypal.test;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.propertypal.base.BaseTest;
import com.qa.propertypal.pages.UsersSearchSO14Page;
import com.qa.propertypal.utilis.Constants;

public class UsersSearchSO14PageTest extends BaseTest {
	

	@Test
	public void UsersSearchSO14PageTest() {
		UsersSearchSO14Page obj = new UsersSearchSO14Page(driver);
		obj.clickPopUpWindowWhenReady();
		obj.doClickSearchBox();
		obj.doClickLocation();
		String title = SearchMyLocationPage.SearchMyLocationPageTitle();
		System.out.println("print correct page title is : " + title);
		Assert.assertEquals(Constants.SEARCH_MY_LOCATION_PAGE, 30);
		
		

	}
	
}