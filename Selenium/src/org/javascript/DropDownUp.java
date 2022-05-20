package org.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownUp {
                public static void main(String[] args) throws InterruptedException {

            		System.setProperty("webdriver.chrome.driver",
            				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

            		WebDriver driver = new ChromeDriver();
            		driver.get("http://greenstech.in/selenium-course-content.html");
            		driver.manage().window().maximize();
            		
            		WebElement scrolldown = driver.findElement(By.xpath("//h3[@id='heading8810']"));
            		WebElement scrollup = driver.findElement(By.xpath("//div[text()='Courses ']"));
            		JavascriptExecutor executor = (JavascriptExecutor)driver;
            		executor.executeScript("arguments[0].scrollIntoView(true)", scrolldown);
            		Thread.sleep(2000);
            		executor.executeScript("arguments[0].scrollIntoView(false)", scrollup);
				}
	
}
