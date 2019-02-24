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
	@FindBy(xpath="//div[@class='T-I J-J5-Ji nX T-I-ax7 T-I-Js-Gs mA']")
	WebElement deleteButton;
	private static final String EMAIL_SUBJECT_XPATH = "//span[@class='bog']/span[text()='textToReplace']";
	private static final String EMAIL_CHECKBOX_RAW_XPATH = EMAIL_SUBJECT_XPATH+"/ancestor::tr/td/div[@role='checkbox']";
	
	public InboxPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	/**
	 * Method to compose & send email
	 * 
	 * @param toEmailIds
	 *            - comma separated list of email ids
	 * @param ccEmailIds
	 *            - comma separated list of email ids, specify null if don't want to
	 *            use CC
	 * @param bCCEmailIds
	 *            - comma separated list of email ids, specify null if don't want to
	 *            use BCC
	 * @param subject
	 *            - subject of email
	 * @param messageBody
	 *            - text to be sent in mail body
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

	public void selectEmail(String subject) {
		WebElement emailCheckbox = getDynamicWebElement(EMAIL_CHECKBOX_RAW_XPATH, "textToReplace", subject, ElementCondition.CLICKABLE);
		click(emailCheckbox);
	}
	
	public void openEmail(String subject) {
		WebElement email = getDynamicWebElement(EMAIL_SUBJECT_XPATH, "textToReplace", subject, ElementCondition.CLICKABLE);
		click(email);
	}
	
	public void clickDeleteButton() {
		click(deleteButton);
	}
}
