package com.qa.propertypal.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;

import com.qa.propertypal.factory.DriverFactory;

public class BaseTest {
	
	protected WebDriver driver;
	DriverFactory df;
	public Properties prop;
	public com.qa.propertypal.pages.SearchMyLocationPage SearchMyLocationPage;
	
	@BeforeTest
	public void setUp() {
		df = new DriverFactory();
		prop = df.init_prop();
		driver = df.init_driver(prop);
		driver.get(prop.getProperty("url"));
		SearchMyLocationPage = new com.qa.propertypal.pages.SearchMyLocationPage(driver);
			
		}
	
	@Ignore
	public void tearDown() {
		driver.quit();
	
		
	
	}

}
