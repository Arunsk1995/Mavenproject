package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement txtbtn = driver.findElement(By.xpath("//div[@id='heading20']"));
		txtbtn.click();
		WebElement txtbtn1 = driver.findElement(By.xpath("//a[text()='CTS Interview Question ']"));
		txtbtn1.click();

		// WebElement txtbtn2 = driver.findElement(By.xpath("(//span[text()='CTS
		// Interview Question']"));
		// txtbtn2.click();
	}
}
