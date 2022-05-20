package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cleartrip {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();

		WebElement fromtxt = driver.findElement(By.xpath("//input[@idfield='from_station1']"));
		fromtxt.sendKeys("chennai");
		WebElement totxt = driver.findElement(By.xpath("//input[@tabindex='2']"));
		totxt.sendKeys("kovilpatti");
		WebElement classtxt = driver.findElement(By.xpath("//select[@title='Class']"));
		classtxt.click();
		WebElement classseattxt = driver.findElement(By.xpath("//option[@value='3E']"));
		classseattxt.click();
		WebElement dateclick = driver.findElement(By.xpath("//input[@name='depart_date']"));
		dateclick.click();
		WebElement searchbtn = driver.findElement(By.xpath("//button[@type='submit']"));
		searchbtn.click();

	}
}
