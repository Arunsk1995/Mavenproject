package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		WebElement redbusbtn = driver.findElement(By.xpath("//a[@title='redBus']"));
		redbusbtn.click();
		WebElement genericsbtn = driver.findElement(By.xpath("//i[@class='icon icon-down D121_icon_down']"));
		genericsbtn.click();
		WebElement signbtn = driver.findElement(By.xpath("//div[@class='D121_signupDrop D121_signupDropActive']"));
		signbtn.click();
		driver.switchTo().frame(0);

		WebElement txtnumber = driver.findElement(By.xpath("//input[@type='number']"));
		txtnumber.sendKeys("7402345219");
		// WebElement captcha =
		// driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border'][1]"));
		// captcha.click();
		// WebElement generateotp =
		// driver.findElement(By.xpath("//div[@id='otp-container']"));
		// generateotp.click();
	}
}