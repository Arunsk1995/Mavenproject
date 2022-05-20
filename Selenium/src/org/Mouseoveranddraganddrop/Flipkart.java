package org.Mouseoveranddraganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		WebElement btnclose = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		btnclose.click();
		WebElement mouovrelec = driver.findElement(By.xpath("//div[text()='Electronics']"));
		action.moveToElement(mouovrelec).perform();
		WebElement mouovrelap = driver.findElement(By.xpath("//a[text()='Laptop and Desktop']"));
		action.moveToElement(mouovrelap).perform();
		WebElement clktops = driver.findElement(By.xpath("//a[text()='Laptops']"));
		clktops.click();
		Thread.sleep(3000);
		WebElement textprint = driver.findElement(By.xpath("//h1[text()='Laptop Store 2022']"));
		String text = textprint.getText();
		System.out.println(text);
		
	}
}