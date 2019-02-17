package com.selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass2 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Vipul_Imp\\Softwares\\Drivers\\chromedriver.exe");
		
		// How to instantiate driver & launch the browser
		WebDriver driver = new ChromeDriver();

		
		driver.get("file:///C:/Users/saibaba/Desktop/Test.html");

		driver.findElement(By.xpath("/html/body/input")).sendKeys("vipul");
	
	}

}
