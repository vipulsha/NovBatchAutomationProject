package com.gmail.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gmail.framework.utilities.PageUtils;

public class LoginPage extends PageUtils {

	// Data Members
	@FindBy(id="identifierId") WebElement usernameTextbox;
	@FindBy(xpath="//span[text()='Next']") WebElement nextButton;
	@FindBy(name="password") WebElement passwordTextbox;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// initialize data members
		PageFactory.initElements(driver, this);
	}
	
	// Page Functions
	public void setUsername(String uName) {
//		waitForElement(usernameTextbox, ElementCondition.VISIBLE);
//		usernameTextbox.sendKeys(uName);
		enterText(usernameTextbox, uName);
	}
	
	public void setPassword(String password) {
//		waitForElement(passwordTextbox, ElementCondition.VISIBLE);
//		passwordTextbox.sendKeys(password);
		enterText(passwordTextbox, password);
	}
	
	public void clickNextButton() {
//		waitForElement(nextButton, ElementCondition.CLICKABLE);
//		nextButton.click();
		click(nextButton);
	}	
}
