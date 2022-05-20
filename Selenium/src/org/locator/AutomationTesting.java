package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTesting {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();

		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		System.out.println(email);
		email.sendKeys("arunsk1995@gmail.com");

		WebElement txtlang = driver.findElement(By.xpath("//input[@value='Male']"));
		System.out.println(txtlang);
		txtlang.click();
		WebElement txtphone = driver.findElement(By.xpath("//input[@type='tel']"));
		System.out.println(txtphone);
		txtphone.sendKeys("7402345219");

		WebElement txtaddress = driver.findElement(By.xpath("//textarea[@rows='3']"));
		System.out.println(txtaddress);
		txtaddress.sendKeys("23 B/ 2 Alwar second street kovilpatti");

		WebElement txtfullname = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		System.out.println(txtfullname);
		txtfullname.sendKeys("ARUN");
		WebElement txtlastname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		System.out.println(txtlastname);
		txtlastname.sendKeys("S K");
		WebElement txtcheck1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		System.out.println(txtcheck1);
		txtcheck1.click();
		WebElement txtcheck2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		System.out.println(txtcheck2);
		txtcheck2.click();
		WebElement txtcheck3 = driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
		System.out.println(txtcheck3);
		txtcheck3.click();
		WebElement txtlan = driver.findElement(By.xpath("(//div[@style='min-height:30px;max-width:200px'])"));
		System.out.println(txtlan);
		txtlan.click();
		WebElement txtlang1 = driver.findElement(By.xpath("(/a[@style='text-decoration:none'])[8]"));
		System.out.println(txtlang1);

		txtlang.click();
	}
}
