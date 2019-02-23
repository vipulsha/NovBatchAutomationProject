package com.gmail.framework.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gmail.framework.pages.InboxPage;
import com.gmail.framework.pages.LoginPage;
import com.gmail.framework.utilities.PageUtils;

public class ComposeEmailTest {
	
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
		
//		InboxPage inboxPage = new InboxPage(driver);
		inboxPage.composeAndSendEmail("my.selenium.user@gmail.com", "my.selenium.user@gmail.com", null, "Test Email", "Test Email");
		
		if (inboxPage.isMessageDisplayed("Message sent.")) {
			System.out.println("Message sent successfully");
		} else {
			System.out.println("Message NOT sent successfully");
		}
	}

}
