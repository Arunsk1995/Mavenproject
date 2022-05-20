package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement closebtn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		closebtn.click();
		WebElement txtlogin = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		txtlogin.click();
		WebElement emailtxt = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		emailtxt.sendKeys("arunsk199514@gmail.com");
		WebElement passtxt = driver.findElement(By.xpath("//input[@type='password']"));
		passtxt.sendKeys("arunsk");

	}
}