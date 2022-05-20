package org.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement drDn = driver.findElement(By.xpath("//select[@id='Skills']"));
		Select select = new Select(drDn);
		select.selectByIndex(10);
		List<WebElement> options = select.getOptions();
		for (int i = 0; i < options.size(); i++) {

			WebElement webElement = options.get(i);

			String text = webElement.getText();
			System.out.println(text);
		}

	}
}
