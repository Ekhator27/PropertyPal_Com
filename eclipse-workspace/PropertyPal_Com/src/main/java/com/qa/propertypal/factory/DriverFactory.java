package com.qa.propertypal.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/***
 * 
 * @author DY
 *
 */


public class DriverFactory {
	public WebDriver driver;

	/**
	 * Go to www.propertypal.com
	 * 
	 * This Method is used to initialize the WebDriver on the basis of given browser
	 * name
	 * 
	 * @param browserName
	 * @return this returns WebDriver reference on the basis of given browser
	 */
	public WebDriver init_driver(Properties prop) {
		
		String browserName = prop.getProperty("browser");

		System.out.println("Broswer name is : + browserName");

		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
			options.setExperimentalOption("excludeSwitches", new String[]{"disable-popup-blocking"});
			
			driver = new ChromeDriver(options);
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("please pass the correct broswer name : + browserName");
			break;
		}

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		return driver;
	}
	/**
	 * This method will initialize the properties from config.properties file
	 * @return prop
	 */

	public Properties init_prop() {
		Properties prop = null;
		try {
			FileInputStream ip = new FileInputStream("./src/test/resources/config/config.properties");
			prop = new Properties();
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;

	}
}