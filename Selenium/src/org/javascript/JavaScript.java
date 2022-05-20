package org.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;

		// for (int i = 0; i <= 1; i++) {
		// System.out.println(args[i]);
		// }
		executor.executeScript("arguments[0].setAttribute('value' , 'Greenstech')", email);
		Object g = executor.executeScript("return arguments[0].getAttribute('value')", email);
		executor.executeScript("arguments[0].setAttribute('value' , 'Hello@123456')", pass);
		Object h = executor.executeScript("return arguments[0].getAttribute('value')", pass);
		executor.executeScript("arguments[0].click()", login);
		System.out.println(g);

		System.out.println(h);
		// for (int i = 0; i < 2; i++) {
		// System.out.println();
		// }
	}
}