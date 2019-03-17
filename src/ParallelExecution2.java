import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelExecution2 {

	@Test
	public void test3() {
		System.out.println("in ParallelExecution2.test3");
		System.setProperty("webdriver.chrome.driver", "D:\\Vipul_Imp\\Softwares\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("my.selenium.user@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Automation@123");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		WebElement composeButton = null;

		try {
			composeButton = driver.findElement(By.xpath("//div[text()='Compose']"));	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		if ( composeButton != null &&  composeButton.isDisplayed()) {
			System.out.println("Login Test is pass");	
		} else {
			System.out.println("Login Test is failed");
		}

		driver.quit();
	}

	@Test
	public void test4() {
		System.out.println("in ParallelExecution2.test4");
		System.setProperty("webdriver.chrome.driver", "D:\\Vipul_Imp\\Softwares\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("my.selenium.user@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Automation@123");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		WebElement composeButton = null;

		try {
			composeButton = driver.findElement(By.xpath("//div[text()='Compose']"));	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		if ( composeButton != null &&  composeButton.isDisplayed()) {
			System.out.println("Login Test is pass");	
		} else {
			System.out.println("Login Test is failed");
		}

		driver.quit();
	}
}
