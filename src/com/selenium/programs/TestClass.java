package com.selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
	
	public static void main(String[] args) {
		
		// How to set path of driver
		System.setProperty("webdriver.chrome.driver", "D:\\Vipul_Imp\\Softwares\\Drivers\\chromedriver.exe");
		
		// How to instantiate driver & launch the browser
		WebDriver driver = new ChromeDriver();
		
		// How to load the URL
		driver.get("http://google.co.in");
		
		// How to maximize window?
		driver.manage().window().maximize();
		
		// How to locate element?
		WebElement textBox = driver.findElement(By.name("q"));
		
		// How to enter text?
		textBox.sendKeys("India");
		
		// How to click on element
		driver.findElement(By.linkText("Images")).click();
//		driver.findElement(By.name("btnK")).click();
		
		// How to close window?
//		driver.close(); // closes current window
//		driver.quit(); // closes all the windows which are opened through driver & will kill the driver exe
	
		
	
	}

}
