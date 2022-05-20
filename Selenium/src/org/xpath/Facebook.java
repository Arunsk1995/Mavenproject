package org.xpath;

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
		WebElement txtUsername = driver.findElement(By.xpath("//input[@type='text']"));

		txtUsername.sendKeys("arunsk199514@gmail.com");
		String attribute2 = txtUsername.getAttribute("value");
		System.out.println(attribute2);
		WebElement txtpassword = driver.findElement(By.xpath("//input[@type='password']"));

		txtpassword.sendKeys("Arunsk199914");
		String attribute = txtpassword.getAttribute("value");
		System.out.println(attribute);
		WebElement txtbtn = driver.findElement(By.xpath("//button[@value='1']"));

		txtbtn.click();

	}
}
