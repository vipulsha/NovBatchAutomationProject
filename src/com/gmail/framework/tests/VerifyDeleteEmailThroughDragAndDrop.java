package com.gmail.framework.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gmail.framework.pages.InboxPage;
import com.gmail.framework.pages.LoginPage;
import com.gmail.framework.pages.TrashPage;
import com.gmail.framework.utilities.PageUtils;

public class VerifyDeleteEmailThroughDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Vipul_Imp\\Softwares\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://gmail.com");
		LoginPage loginPage = new LoginPage(driver);
		InboxPage inboxPage = loginPage.login("my.selenium.user@gmail.com", "Automation@123");

		if (PageUtils.isUserLoggedIn("my.selenium.user@gmail.com")) {
			System.out.println("PASS: LoginTest");
		} else {
			System.out.println("FAIL: LoginTest");
		}		

		//		InboxPage inboxPage = new InboxPage(driver);
		String subject = "Test Email9";
		inboxPage.composeAndSendEmail("my.selenium.user@gmail.com", "my.selenium.user@gmail.com", null, subject, "Test Email");

		if (inboxPage.isMessageDisplayed("Message sent.")) {
			System.out.println("PASS: Message sent successfully");
		} else {
			System.out.println("FAIL: Message NOT sent successfully");
		}

		// Drag and drop email
		inboxPage.dragEmailToTrash(subject);

		// Verify email is deleted
		if (inboxPage.isEmailWithSubjectPresent(subject) != false) {
			System.out.println("FAIL: Message deletion failed");
		} else {
			System.out.println("PASS: Message deletion PASSED");
		}

		inboxPage.clickOnTrashLink();

		TrashPage trashPage = new TrashPage(driver);

		// Verify email is present on Trash
		if (trashPage.isEmailWithSubjectPresent(subject)) {
			System.out.println("PASS: Message present in trash");
		} else {
			System.out.println("FAIL: Message not present in trash");
		}

		trashPage.dragEmailToInbox(subject);
//		Thread.sleep(3000);

		// Verify email is deleted
		if (trashPage.isEmailWithSubjectPresent(subject) != false) {
			System.out.println("FAIL: Message not removed from Trash");
		} else {
			System.out.println("PASS: Message removed from Trash");
		}
		
		trashPage.clickOnInboxLink();
		if (inboxPage.isEmailWithSubjectPresent(subject)) {
			System.out.println("PASS: Message present in Inbox page");
		} else {
			System.out.println("FAIL: Message not present in Inbox page");
		}
	}

}
