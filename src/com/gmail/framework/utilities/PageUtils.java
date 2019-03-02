package com.gmail.framework.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageUtils {
	public enum ElementCondition {VISIBLE,CLICKABLE};
	protected static WebDriverWait wait = null;
	protected @FindBy(xpath="//span[@class='bAq']") WebElement notificationMessage;
	protected @FindBy(linkText="Trash") WebElement trashLink;
	protected @FindBy(linkText="Inbox") WebElement inboxLink;
	protected static final String EMAIL_SUBJECT_XPATH = "//span[@class='bog']/span[text()='textToReplace']";
	protected static final String EMAIL_CHECKBOX_RAW_XPATH = EMAIL_SUBJECT_XPATH+"/ancestor::tr/td/div[@role='checkbox']";
	protected static Actions actions = null;
	protected static JavascriptExecutor javascriptExecutor = null;
	
	public PageUtils(WebDriver driver) {
		wait = new WebDriverWait(driver, 30);
		actions = new Actions(driver);
		javascriptExecutor = (JavascriptExecutor) driver;
	}
	
	public void waitForElement(WebElement element, ElementCondition condition) {
		scrollToView(element);
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
	
	public void scrollToView(WebElement element) {
		try {
			javascriptExecutor.executeScript("arguments[0].scrollIntoView();", element);
		} catch (Exception e) {}
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
	
	protected void dragAndDropElement(WebElement dragableElement, WebElement dropableElement) {
		waitForElement(dragableElement, ElementCondition.CLICKABLE);
		waitForElement(dropableElement, ElementCondition.VISIBLE);
		actions.dragAndDrop(dragableElement, dropableElement).perform();
	}
	
	public void clickOnInboxLink() {
		click(inboxLink);
	}
	
	public void clickOnTrashLink() {
		click(trashLink);
	}
	
	public void selectEmail(String subject) {
		WebElement emailCheckbox = getDynamicWebElement(EMAIL_CHECKBOX_RAW_XPATH, "textToReplace", subject, ElementCondition.CLICKABLE);
		click(emailCheckbox);
	}
	
	public void openEmail(String subject) {
		WebElement email = getEmailElement(subject);
		click(email);
	}
	
	public WebElement getEmailElement(String subject) {
		return getDynamicWebElement(EMAIL_SUBJECT_XPATH, "textToReplace", subject, ElementCondition.CLICKABLE);
	}
	
	public void dragEmailToTrash(String subject) {
		dragAndDropElement(getEmailElement(subject), trashLink);
	}
	
	public void dragEmailToInbox(String subject) {
		dragAndDropElement(getEmailElement(subject), inboxLink);
	}
	
	public boolean isEmailWithSubjectPresent(String subject) {
		try {
			if (getEmailElement(subject) != null) 
				return true;
		} catch (Exception e) {}
		return false;
	}
	
	public void deleteEmailThroughDragAndDrop(String subject) {
		dragAndDropElement(getEmailElement(subject), trashLink);
	}
	
	public void hoverOnElement(WebElement element) {
		actions.moveToElement(element).perform();
	}
 }
