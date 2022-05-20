package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();

		WebElement profilebtn = driver.findElement(By.xpath("//span[@data-reactid='842']"));
		profilebtn.click();
		WebElement signuptxt = driver.findElement(By.xpath("//a[@data-track='login']"));
		signuptxt.click();
		WebElement mobiletxt = driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
		mobiletxt.sendKeys("7402345219");
		WebElement clickcontinue = driver.findElement(By.xpath("//div[@class='submitBottomOption']"));

		clickcontinue.click();

	}
}
