package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensModelResume {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement resumbtn = driver.findElement(
				By.xpath("//div[@class='card-header11 d-flex align-items-center justify-content-between']"));
		resumbtn.click();
		Thread.sleep(3000);
		WebElement resclick = driver.findElement(By.xpath("//a[text()='Resume Model-1 ']"));
		resclick.click();
	}
}