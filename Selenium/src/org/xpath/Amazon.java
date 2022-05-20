package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement txtsearch = driver.findElement(By.xpath("//input[@type='text']"));
		System.out.println(txtsearch);
		txtsearch.sendKeys("iphone");
		WebElement txtseabtn = driver.findElement(By.xpath("//input[@type='submit']"));
		System.out.println(txtseabtn);
		txtseabtn.click();
	}
}
