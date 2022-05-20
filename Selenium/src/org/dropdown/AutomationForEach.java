package org.dropdown;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationForEach {
	 public static void main(String[] args) throws InterruptedException {
  	   System.setProperty("webdriver.chrome.driver",
 				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		driver.get("http://demo.automationtesting.in/Register.html");
 		driver.manage().window().maximize();
// 		WebElement langtxt = driver.findElement(By.xpath("//div[@class='ui-autocomplete-multiselect ui-state-default ui-widget']"));
//	langtxt.click();
//	Thread.sleep(5000);
// 		WebElement lang = driver.findElement(By.xpath("//a[text()='Croatian']"));
// 		
// 		lang.click();
 		WebElement drDn = driver.findElement(By.xpath("//select[@id='Skills']"));
// 		drDn.sendKeys("Client Server");
		Select select = new Select(drDn);
		select.selectByIndex(10);
		List<WebElement> options = select.getOptions();
 		for (WebElement a : options) {
			
 			
 			
			String text = a.getAttribute("value");
			System.out.println(text);
	} 
		
		
 	    
 		
 		
 		}
 		
}
