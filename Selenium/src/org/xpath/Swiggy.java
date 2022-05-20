package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();

		WebElement signuptxt = driver.findElement(By.xpath("//a[@class='r2iyh']"));
		signuptxt.click();
		WebElement phonetxt = driver.findElement(By.xpath("//input[@type='tel']"));
		phonetxt.sendKeys("7402345219");
		WebElement nametxt = driver.findElement(By.xpath("//input[@name='name']"));
		nametxt.sendKeys("Arun S K");
		WebElement emailtxt = driver.findElement(By.xpath("//input[@name='email']"));
		emailtxt.sendKeys("arunsk199514@gmail.com");
		WebElement passtxt = driver.findElement(By.xpath("//input[@name='password']"));
		passtxt.sendKeys("Goodarun");
		WebElement continuebtn = driver.findElement(By.xpath("//a[@class='a-ayg']"));
		continuebtn.click();

	}
}
