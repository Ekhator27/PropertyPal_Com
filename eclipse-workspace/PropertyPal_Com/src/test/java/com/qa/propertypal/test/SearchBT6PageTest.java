package com.qa.propertypal.test;

import org.testng.annotations.Test;

import com.qa.propertypal.base.BaseTest;
import com.qa.propertypal.pages.SearchBT6Page;

public class SearchBT6PageTest extends BaseTest{

	@Test
	public void SearchBT6()
	{
		SearchBT6Page obj = new SearchBT6Page(driver);
		obj.doSearchBT6("BT6");
				
	}
	
	
	
	
	
}
