package com.gmail.framework.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gmail.framework.pages.LoginPage;

public class LoginTest {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Vipul_Imp\\Softwares\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://gmail.com");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setUsername("my.selenium.user@gmail.com");
		loginPage.clickNextButton();
		loginPage.setPassword("Automation@123");
		loginPage.clickNextButton();
	}

}
