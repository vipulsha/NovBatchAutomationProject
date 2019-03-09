package com.selenium.programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingJavaScriptPopUps {
	
	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver", "D:\\Vipul_Imp\\Softwares\\Drivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();

		System.setProperty("webdriver.gecko.driver", "D:\\Vipul_Imp\\Softwares\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/saibaba/Desktop/JavaScriptDemo.html");

//		driver.findElement(By.xpath("//input[@value='Alert']")).click();
		
		// How to switch to alert?
//		Alert alert = driver.switchTo().alert();
		
		// How to press OK button on pop up?
//		alert.accept();
		
//		driver.findElement(By.xpath("//input[@value='Confirm']")).click();
		
		// How to press cancel on pop up?
//		Alert alert = driver.switchTo().alert();
//		alert.dismiss();

		driver.findElement(By.xpath("//input[@value='Prompt']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		// How to get alert message?
		String text = alert.getText();
		System.out.println("Alert text: "+text);
		
		// How to enter text on alert?
		alert.sendKeys("Vipul");
		alert.accept();
		
		
		System.out.println("Done");
		
		
		
	}

}
