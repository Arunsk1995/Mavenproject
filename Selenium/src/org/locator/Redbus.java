package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		WebElement txtusername = driver.findElement(By.id("src"));
		System.out.println(txtusername);
		txtusername.sendKeys("chennai");
		WebElement txtpassword = driver.findElement(By.id("dest"));
		System.out.println(txtpassword);
		txtpassword.sendKeys("kovilpatti");
		WebElement txtdate = driver.findElement(By.id("onward_cal"));
		System.out.println(txtdate);
		txtdate.sendKeys("21-04-2020");

	}
}
