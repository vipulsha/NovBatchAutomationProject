package com.gmail.framework.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gmail.framework.pages.InboxPage;
import com.gmail.framework.pages.LoginPage;
import com.gmail.framework.utilities.PageUtils;

public class DeleteMailTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Vipul_Imp\\Softwares\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://gmail.com");
		LoginPage loginPage = new LoginPage(driver);
		InboxPage inboxPage = loginPage.login("my.selenium.user@gmail.com", "Automation@123");

		if (PageUtils.isUserLoggedIn("my.selenium.user@gmail.com")) {
			System.out.println("LoginTest: PASS");
		} else {
			System.out.println("LoginTest: FAIL");
		}		
		
		for(int i=1; i<=4; i++) {
			inboxPage.composeAndSendEmail("my.selenium.user@gmail.com", "my.selenium.user@gmail.com", null, "Test Email "+i, "Test Email");
			if (inboxPage.isMessageDisplayed("Message sent.")) {
				System.out.println("Message sent successfully");
			} else {
				System.out.println("Message NOT sent successfully");
			}	
		}
		
		// Verify deleting single email
		inboxPage.selectEmail("Test Email 2");
		inboxPage.clickDeleteButton();
		if (inboxPage.isMessageDisplayed("Conversation moved to Trash.")) {
			System.out.println("Single email deletion PASS");
		} else {
			System.out.println("Single email deletion FAIL");
		}
		
		// Verify deleting multiple emails
		inboxPage.selectEmail("Test Email 3");
		inboxPage.selectEmail("Test Email 4");
		inboxPage.clickDeleteButton();
		if (inboxPage.isMessageDisplayed("2 conversations moved to Trash.")) {
			System.out.println("Multiple email deletion PASS");
		} else {
			System.out.println("Multiple email deletion FAIL");
		}
	}
}
