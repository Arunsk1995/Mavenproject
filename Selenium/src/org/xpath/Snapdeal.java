package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();

		WebElement signbtn = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
		signbtn.click();
		WebElement registerbtn = driver.findElement(By.xpath("//span[@class='newUserRegister']"));
		registerbtn.click();
		// Thread.sleep(3000);
		WebElement mobiletxt = driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']"));

		mobiletxt.sendKeys("7402345219");
		// Thread.sleep(3000);
		WebElement continuebtn = driver.findElement(
				By.xpath("//button[@class='btn col-xs-24 btn-large btn-skyblue continueBtn marT20 marB30']"));
		continuebtn.click();

	}
}