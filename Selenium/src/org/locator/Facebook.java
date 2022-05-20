package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement txtUsername = driver.findElement(By.id("email"));
		System.out.println(txtUsername);
		txtUsername.sendKeys("arunsk199514@gmail.com");
		WebElement txtpassword = driver.findElement(By.id("pass"));
		System.out.println(txtpassword);
		txtpassword.sendKeys("Arunsk199914");
		driver.quit();

	}
}
