package com.qa.propertypal.test;
import org.testng.annotations.Test;

import com.qa.propertypal.base.BaseTest;
import com.qa.propertypal.pages.UsersSearchSO14Page;

public class UsersSearchSO14PageTest extends BaseTest {
	

	@Test
	public void UsersSearchSO14PageTest() {
		UsersSearchSO14Page obj = new UsersSearchSO14Page(driver);
		obj.clickPopUpWindowWhenReady();
		obj.doClickSearchBox();
		obj.doClickLocation();
	
//		String title = UsersSearchSO14Page.
//		System.out.println("print correct page title is : " + title);
		
		

	}
	
}