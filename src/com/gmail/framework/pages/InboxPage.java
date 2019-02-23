package com.gmail.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.seleniumhq.jetty9.util.StringUtil;

import com.gmail.framework.utilities.PageUtils;

public class InboxPage extends PageUtils {

	@FindBy(xpath = "//div[text()='Compose']")
	WebElement composeButton;
	@FindBy(name = "to")
	WebElement toTextbox;
	@FindBy(name = "subjectbox")
	WebElement subjectTextbox;
	@FindBy(xpath = "//div[@aria-label='Message Body']")
	WebElement messageBodyTextArea;
	@FindBy(xpath = "//div[text()='Send']")
	WebElement sendButton;
	@FindBy(xpath = "//span/span[text()='Cc']")
	WebElement cCLink;
	@FindBy(xpath = "//span/span[text()='Bcc']")
	WebElement bCCLink;
	@FindBy(name = "cc")
	WebElement cCTextbox;
	@FindBy(name = "bcc")
	WebElement bCCTextbox;
	
	public InboxPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	/**
	 * Method to compose & send email
	 * @param toEmailIds - comma separated list of email ids
	 * @param ccEmailIds - comma separated list of email ids, specify null if don't want to use CC
	 * @param bCCEmailIds - comma separated list of email ids, specify null if don't want to use BCC
	 * @param subject - subject of email
	 * @param messageBody - text to be sent in mail body
	 */
	public void composeAndSendEmail(String toEmailIds, String ccEmailIds, String bCCEmailIds, String subject,
			String messageBody) {
		click(composeButton);
		enterText(toTextbox, toEmailIds);
		if (ccEmailIds != null && !ccEmailIds.equals("")) {
			click(cCLink);
			enterText(cCTextbox, ccEmailIds);
		}
		
		if (StringUtil.isNotBlank(bCCEmailIds)) {
			click(bCCLink);
			enterText(bCCTextbox, bCCEmailIds);
		}
		
		enterText(subjectTextbox, subject);
		enterText(messageBodyTextArea, messageBody);
		click(sendButton);
	}
}
