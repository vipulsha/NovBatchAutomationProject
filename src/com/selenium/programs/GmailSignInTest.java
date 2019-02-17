package com.selenium.programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailSignInTest {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Vipul_Imp\\Softwares\\Drivers\\chromedriver.exe");
		
		// How to instantiate driver & launch the browser
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		// Implicit wait
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
		
		driver.get("http://gmail.com");
		
		//enter user name
		driver.findElement(By.id("identifierId")).sendKeys("my.selenium.user@gmail.com");
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		
		password.sendKeys("Automation@123");
//		driver.findElement(By.name("password")).sendKeys("Automation@123");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Next']")));
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		WebElement composeButton = null;
		
		try {
			composeButton = driver.findElement(By.xpath("//div[text()='Compose']"));	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		// Verification/assertions
		if ( composeButton != null &&  composeButton.isDisplayed()) {
			System.out.println("Login Test is pass");	
		} else {
			System.out.println("Login Test is failed");
		}
	}
}
