package org.text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();

		WebElement clickover = driver.findElement(By.xpath("//span[text()='Overview']"));

		clickover.click();

		Thread.sleep(2000);

		WebElement textelement = driver.findElement(By.xpath("//p[contains(text(),'Greens Technologies ')]"));
		String text = textelement.getText();
		System.out.println(text);
	}
}