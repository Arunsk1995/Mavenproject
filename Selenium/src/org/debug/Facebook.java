package org.debug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
	   	  
		
		   
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.facebook.com/");
		   driver.manage().window().maximize();
		   WebElement btnCreateNew = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		   btnCreateNew.click();
		   
		   Thread.sleep(3000);
		   WebElement txtFirstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		   txtFirstName.sendKeys("Raguvaran");
	 }
}
