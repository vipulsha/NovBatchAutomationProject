package com.selenium.programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecution {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Vipul_Imp\\Softwares\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://google.co.in");

		// Step#1: Get reference variable of JavaScriptExecutor
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		
		// Step#2: Execute Jascript code
//		executor.executeScript("alert('Hi')");
		
		// How to highlight element using java script
		WebElement element = driver.findElement(By.name("q"));
		
		for (int i = 1; i <= 3; i++) {
			executor.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "border: solid; border-color: #2BD12B;");
			Thread.sleep(500);
			executor.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");
			Thread.sleep(500);
		}
		
		
		
		
	}
}
