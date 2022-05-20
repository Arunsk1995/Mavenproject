package org.frame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
                       public static void main(String[] args) throws InterruptedException {
                    	   System.setProperty("webdriver.chrome.driver",
                   				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
                   		WebDriver driver = new ChromeDriver();
                   		driver.get(" https://demo.guru99.com/test/guru99home/");
                   		driver.manage().window().maximize();
                     	driver.switchTo().frame("a077aa5e");
                  		
                   		WebElement frame = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
                   		
                   		frame.click();
                   		driver.switchTo().defaultContent();
                   		WebElement email = driver.findElement(By.xpath("//input[@id='philadelphia-field-email']"));
                   		email.sendKeys("arunsk199514@gmail.com");
                   		List<WebElement> count = driver.findElements(By.tagName("iframe"));
                   		int size = count.size();
                   		System.out.println(size);
                   		WebDriver frame2 = driver.switchTo().frame(2);
                   		System.out.println(frame2);
                   		
					}
}
