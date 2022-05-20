package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/login");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("userName"));
		System.out.println(username);
		username.sendKeys("arunsk199514@gmail.com");
		WebElement byncont = driver.findElement(By.xpath("//button[@id='checkUser']"));
		byncont.click();
		Thread.sleep(3000);
		WebElement txtname = driver.findElement(By.xpath("//input[@name='j_name']"));
		txtname.sendKeys("Arunsk");
		Thread.sleep(3000);
		WebElement txtphone = driver.findElement(By.xpath("//input[@name='j_number']"));
		txtphone.sendKeys("7402345219");
	}
}
