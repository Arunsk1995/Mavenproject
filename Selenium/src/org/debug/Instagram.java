package org.debug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	 public static void main(String[] args) throws InterruptedException {
	     System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe" );
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://www.instagram.com/?hl=en");
	     driver.manage().window().maximize();
     Thread.sleep(3000);
	     WebElement txtusername = driver.findElement(By.name("username"));
	     System.out.println(txtusername);
	     txtusername.sendKeys("arunsk199514@gmail.com");
     Thread.sleep(3000);
	     WebElement txtpassword = driver.findElement(By.name("password"));
	     System.out.println(txtpassword);
	     txtpassword.sendKeys("arun007");
}
}
