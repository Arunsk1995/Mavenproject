package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfc {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		driver.switchTo().frame("login_page");
		WebElement txtUsername = driver.findElement(By.xpath("//input[@type='text']"));
		txtUsername.sendKeys("Arunsk");
		WebElement findElement = driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']"));
		findElement.click();

	}
}
