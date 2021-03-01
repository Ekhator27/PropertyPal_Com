package com.qa.propertypal.utilis;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtilis {
	
 private WebDriver driver;	
 
 
 public ElementUtilis(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public void doClick(By locator) {
		getElement(locator).click();
		
	}
	
	public void doActionsSendKeys(By locator, Keys enter) {
		Actions action = new Actions(driver);
		action.moveToElement(getElement(locator)).sendKeys(enter).build().perform();
	}
	
	public void doSendKeys(By locator, String value) {
		WebElement element = getElement(locator);
		element.clear();
		element.sendKeys(value);
	}
	
	public String doGetText(By locator) {
		return getElement(locator).getText();
	}
	
	public WebElement waitForElementPresent(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public WebElement waitForElementVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.visibilityOf(getElement(locator)));
	}
	
	public boolean waitForUrlToBe(String urlValue, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.urlContains(urlValue));
	}
	
	public void clickWhenReady(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		element.click();	
	}
	
	public String waitForTitleToBe(String title, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
	}
 
	public void doLoopAndCount(String propertiesList, String nextButton, String text)
	{
		int count = 0;

        for(int i=0; i<6; i++)
        {
            WebDriverWait wait3 = new WebDriverWait(driver, 20);
            wait3.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(propertiesList)));
            List<WebElement> properties = driver.findElements(By.cssSelector(propertiesList));
            int propertiesCount = properties.size();
            count = count+propertiesCount;
            driver.findElement(By.cssSelector(nextButton)).click();
        }

        System.out.println(text+count);
		
	}
 

}

