package com.selenium.programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingIframes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Vipul_Imp\\Softwares\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/slider/#hotelrooms");

		// Switch to iframe
//		driver.switchTo().frame(0);
//		driver.switchTo().frame("demo-frame");
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iframe);
		
		driver.findElement(By.xpath("//div[@id='slider']/span")).click();

		// How to switch back to the parent content
		driver.switchTo().defaultContent();
		String text = driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
		System.out.println(text);
	}
}
