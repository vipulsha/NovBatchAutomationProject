package com.gmail.framework.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageUtils {
	public enum ElementCondition {VISIBLE,CLICKABLE};
	protected static WebDriverWait wait = null;
	@FindBy(xpath="//span[@class='bAq']") WebElement notificationMessage;
	
	public PageUtils(WebDriver driver) {
		wait = new WebDriverWait(driver, 30);
	}
	
	public void waitForElement(WebElement element, ElementCondition condition) {
		switch (condition) {
		case VISIBLE:
			wait.until(ExpectedConditions.visibilityOf(element));
			break;
		case CLICKABLE:
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}
	}
	
	public WebElement waitForElement(By by, ElementCondition condition) {
		switch (condition) {
		case VISIBLE:
			return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		case CLICKABLE:
			return wait.until(ExpectedConditions.elementToBeClickable(by));
		}
		return null;
	}
	
	protected void click(WebElement element) {
		waitForElement(element, ElementCondition.CLICKABLE);
		element.click();
	}

	protected void enterText(WebElement element, String text) {
		waitForElement(element, ElementCondition.VISIBLE);
		element.sendKeys(text);
	}
	
	public static boolean isUserLoggedIn(String emailId) {
		return wait.until(ExpectedConditions.titleContains(emailId));
	}
	
	public String getText(WebElement element) {
		waitForElement(element, ElementCondition.VISIBLE);
		return element.getText();
	}
	
	public boolean isMessageDisplayed(String message) {
		return wait.until(ExpectedConditions.textToBePresentInElement(notificationMessage, message));
	}
	
	public WebElement getDynamicWebElement(String rawXpath, String textToReplace, String dynamicText, ElementCondition condition) {
		String finalXpath = rawXpath.replace(textToReplace, dynamicText);
		return waitForElement(By.xpath(finalXpath), condition);
	}
 }
