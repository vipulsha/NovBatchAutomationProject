package com.gmail.framework.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageUtils {
	public enum ElementCondition {VISIBLE,CLICKABLE};
	WebDriverWait wait = null;
	
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
			break;
		}
	}
	
	public void click(WebElement element) {
		waitForElement(element, ElementCondition.CLICKABLE);
	}

	public void enterText(WebElement element, String text) {
		waitForElement(element, ElementCondition.VISIBLE);
		element.sendKeys(text);
	}
}
