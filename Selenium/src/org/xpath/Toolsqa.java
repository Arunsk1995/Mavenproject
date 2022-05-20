package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toolsqa {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();

		WebElement txtfstnam = driver.findElement(By.xpath("//input[@id='firstName']"));
		txtfstnam.sendKeys("Arun");
		WebElement latnam = driver.findElement(By.xpath("//input[@id='lastName']"));
		latnam.sendKeys("S K");
		WebElement emaiktxt = driver.findElement(By.xpath("//input[@id='userEmail']"));
		emaiktxt.sendKeys("arunsk199514@gmail.com");
		WebElement gendertxt = driver.findElement(By.xpath("//label[text()='Male']"));
		gendertxt.click();
		WebElement numbetxt = driver.findElement(By.xpath("//input[@id='userNumber']"));
		numbetxt.sendKeys("7402345219");
		Thread.sleep(3000);
		// WebElement subtxt =
		// driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container
		// subjects-auto-complete__value-container--is-multi css-1hwfws3']"));
		// subtxt.sendKeys("English");
		Thread.sleep(3000);
		// WebElement hobitxt =
		// driver.findElement(By.xpath("//label[text()='Sports']"));
		// hobitxt.click();
		Thread.sleep(3000);
		WebElement addtxt = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		addtxt.sendKeys("23 b /2 Alwar Second Street Kovilpatti");
		Thread.sleep(3000);

	}
}