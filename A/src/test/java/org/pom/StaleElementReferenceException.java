package org.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import src.test.java.BaseClass;

public class StaleElementReferenceException  {
	public static void main(String[] args) {
		
	
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(); 
        driver.get("https://adactinhotelapp.com/");
        
        WebElement Element = driver.findElement(By.id("username"));
        Element.sendKeys("Arunsk");
        driver.navigate().refresh();
        for (int i = 1; i < 10; i++) {
        	
	try {
		 WebElement Element1 = driver.findElement(By.id("username"));
	        Element1.sendKeys("Ramesh");
	        break;
	} catch (Exception e) {
		e.printStackTrace();
	}		
		
	}
       
}
}