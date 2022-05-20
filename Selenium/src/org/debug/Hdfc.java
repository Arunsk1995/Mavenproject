package org.debug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfc {
	 public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://netbanking.hdfcbank.com/netbanking/");
			driver.manage().window().maximize();
			Thread.sleep(6000);
			WebElement txtUsername = driver.findElement(By.xpath("//input[@type='text']"));
			
			
			txtUsername.sendKeys("Arunsk");
			
			
			
		}
}

