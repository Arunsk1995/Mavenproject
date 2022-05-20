package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				" https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp\r\n");
		WebElement firstxt = driver.findElement(By.xpath("//input[@name='firstName']"));
		firstxt.sendKeys("Arun");
		WebElement lsttxt = driver.findElement(By.xpath("//input[@name='lastName']"));
		lsttxt.sendKeys("S K");
		WebElement emaitxt = driver.findElement(By.xpath("//input[@type='email']"));
		emaitxt.sendKeys("arunsk199514@gmail.com");
		WebElement passtxt = driver.findElement(By.xpath("//input[@aria-label='Password']"));
		passtxt.sendKeys("Goodraja");
		WebElement conpass = driver.findElement(By.xpath("//input[@name='Passwd']"));
		conpass.sendKeys("Goodraja");
		WebElement nxtclick = driver.findElement(By.xpath("//span[text()='Next']"));
		nxtclick.click();
	}
}
