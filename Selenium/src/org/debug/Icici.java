package org.debug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Icici {
	 public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.icicibank.com/Personal-Banking/insta-banking/internet-banking/index.page");
			driver.manage().window().maximize();
			
		WebElement btnclose = driver.findElement(By.xpath("//div[@id='modal-close']"));
			btnclose.click();
			WebElement btnlogin = driver.findElement(By.xpath("//a[text()='LOGIN']"));
			btnlogin.click();
			WebElement txtusername = driver.findElement(By.xpath("//input[@name='DUMMY1']"));
			txtusername.sendKeys("Arunsk");
			
//			WebElement txtpass = driver.findElement(By.xpath("//span[@id='HDisplayDefault.Rb14.C3']]"));
//			txtpass.click();
}
}