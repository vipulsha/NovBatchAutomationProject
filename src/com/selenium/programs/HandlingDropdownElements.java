package com.selenium.programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownElements {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Vipul_Imp\\Softwares\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/saibaba/Desktop/Test.html");
		
		// Way#1:
//		driver.findElement(By.id("country")).sendKeys("pakistan");
		
		// Way#2:
		WebElement countryElement = driver.findElement(By.id("country"));
		Select dropdown = new Select(countryElement);
		
		// How to select by index
//		dropdown.selectByIndex(3);
		
		// How to select by visible text
//		dropdown.selectByVisibleText("pakistan");
		
		// How to select by value attribute
		dropdown.selectByValue("PK");
		
	}
}
