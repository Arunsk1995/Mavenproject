package org.alert;

import java.util.TreeSet;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomationDemoSite {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		WebElement clickbtn = driver.findElement(By.xpath(" //button[@class='btn btn-danger']"));
		clickbtn.click();
		Alert al = driver.switchTo().alert();
		al.accept();
		WebElement clckbtn2 = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		clckbtn2.click();
		WebElement clckbtn1 = driver
				.findElement(By.xpath("//button[text()='click the button to display a confirm box ']"));
		clckbtn1.click();
		al.accept();
		WebElement clckbtn3 = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		clckbtn3.click();
		WebElement clckbtn4 = driver
				.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		clckbtn4.click();
		Thread.sleep(3000);
		//Actions action=new Actions(driver);
		
		al.sendKeys("Java Selenium Training");
		//action.contextClick().perform();
		Thread.sleep(2000);
		String text = al.getText();
		

		System.out.println(text);
		al.accept();
		WebElement txtcopy = driver
				.findElement(By.xpath("//p[text()='Hello Java Selenium Training How are you today']"));
		String text2 = txtcopy.getText();
		System.out.println(text2);

	}
}