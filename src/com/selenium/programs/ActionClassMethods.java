package com.selenium.programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassMethods {
	
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "D:\\Vipul_Imp\\Softwares\\Drivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "D:\\Vipul_Imp\\Softwares\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.get("http://google.co.in");
		
//		
		
		// How to hover on element
//		driver.get("https://afourtech.com/");
//		Actions actions = new Actions(driver);
//		WebElement element = driver.findElement(By.linkText("Focus Areas"));
//		actions.moveToElement(element).perform();
		
		// How to press keyboard key
		Actions actions = new Actions(driver);
//		driver.findElement(By.name("q")).sendKeys("India");
//		actions.sendKeys(Keys.ENTER).perform();
		
		// How to press combination of keys
//		Thread.sleep(3000);
//		driver.findElement(By.linkText("Gmail")).sendKeys(Keys.chord(Keys.CONTROL,"a"));
//		actions.sendKeys(Keys.chord(Keys.CONTROL,"a"),"").perform();

		// How to drag and drop element?
		driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
		// Identify your dragable & dropable elements
		WebElement dragableElement = driver.findElement(By.id("draggable"));
		WebElement dropableArea = driver.findElement(By.id("droptarget"));
//		actions.clickAndHold(dragableElement)
//			.moveToElement(dropableArea)
//			.release(dropableArea).build().perform();
		
//		actions.dragAndDrop(dragableElement, dropableArea).perform();
		
		// How to context click?
		WebElement element = driver.findElement(By.id("someelement"));
		actions.contextClick(element).perform();
		
		
	}

}
