package com.selenium.programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UIOperations {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Vipul_Imp\\Softwares\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://gmail.com");
		
		// How to navigate to particular url when you are on some page
		driver.navigate().to("http://yahoo.com");
		
		// How to navigate back
		driver.navigate().back();
		
		// How to navigate forward
		driver.navigate().forward();
		
		// How to refresh page
		driver.navigate().refresh();
		
		
		
	}

}
