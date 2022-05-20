package org.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TutorialMultipleSelect {
                               public static void main(String[] args) {
                            		System.setProperty("webdriver.chrome.driver",
                            				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
                            		WebDriver driver = new ChromeDriver();
                            		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
                            		driver.manage().window().maximize();
                            		WebElement command = driver.findElement(By.xpath("//select[@name='selenium_commands']"));
                            		Select select = new Select(command);
                            		boolean multiple = select.isMultiple();
                            		System.out.println(multiple);
                            		System.out.println();
                            		for (int i = 0; i<5 ; i++) {
										
									
                            		select.selectByIndex(i);
                            		}
                            		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
                            	for (WebElement webElement : allSelectedOptions) {
									String text = webElement.getText();
									System.out.println(text);
								}
                            	WebElement firstSelectedOption = select.getFirstSelectedOption();
                            	String text = firstSelectedOption.getText();
                            	System.out.println();
                            	System.out.println(text);
                            	select.deselectByIndex(3);
                            	select.deselectAll();
                            	
                            	
							}
}
