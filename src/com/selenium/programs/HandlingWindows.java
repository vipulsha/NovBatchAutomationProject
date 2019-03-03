package com.selenium.programs;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Vipul_Imp\\Softwares\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/saibaba/Desktop/MultiWindowsApp.html");

		driver.findElement(By.linkText("Google")).click();
		driver.findElement(By.linkText("Gmail")).click();
		
		// Handle windows
		// Step#1: Get handle of parent window
		String parentWindowHandle = driver.getWindowHandle();
		
		// Step#2: Get all window handles
		Set<String> windowHandles = driver.getWindowHandles();
		
		// Step#3: Iterate through set to get child window
		// When there are only 2 windows
		/*for (String handle : windowHandles) {
			if (!handle.equals(parentWindowHandle)) {
				// Step#4: Switch to the child window
				driver.switchTo().window(handle);
				driver.findElement(By.name("q")).sendKeys("India");
				break;
			}
		}*/
		
		// When there are more than 2 windows
		for (String handle : windowHandles) {
			// Step#5: First switch to window and then check for the condition
			if (!handle.equals(parentWindowHandle)) {
				driver.switchTo().window(handle);
				try {
					driver.findElement(By.name("q")).sendKeys("India");
					break;
				} catch (Exception e) {
					System.out.println("In catch");
				}
			}
		}
		
		// Step#6: Switch back to the parent window
		driver.switchTo().window(parentWindowHandle);
		driver.findElement(By.linkText("Gmail")).click();
		
		
	}

}
