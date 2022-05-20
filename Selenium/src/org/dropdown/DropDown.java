package org.dropdown;

import org.omg.PortableServer.THREAD_POLICY_ID;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("username"));

		username.sendKeys("ARUNSK007");
		WebElement password = driver.findElement(By.id("password"));

		password.sendKeys("Goodarun007");
		WebElement btnlogin = driver.findElement(By.xpath("//input[@id='login']"));
		btnlogin.click();
		WebElement loctxt = driver.findElement(By.xpath("//select[@id='location']"));
		Select drDn = new Select(loctxt);
		drDn.selectByIndex(2);
         WebElement hottxt = driver.findElement(By.xpath("//select[@id='hotels']"));
         Select drDn1 = new Select(hottxt);
         drDn1.selectByVisibleText("Hotel Sunshine");
         WebElement Roomtyptxt = driver.findElement(By.xpath("//select[@id='room_type']"));
         Select drDn2 = new Select(Roomtyptxt);
         drDn2.selectByValue("Deluxe");
         WebElement roomtype = driver.findElement(By.xpath("//select[@id='room_nos']"));
         Select drDn3 = new Select(roomtype);
         drDn3.selectByIndex(4);
         WebElement datetxtin = driver.findElement(By.xpath("//input[@id='datepick_in']"));
         datetxtin.sendKeys("23/05/2022");
         WebElement dateouttxt = driver.findElement(By.xpath("//input[@id='datepick_out']"));
         dateouttxt.sendKeys("25/05/2022");
         WebElement adultnotxt = driver.findElement(By.xpath("//select[@id='adult_room']"));
         Select drDn4 = new Select(adultnotxt);
         drDn4.selectByIndex(4);
         WebElement childtxt = driver.findElement(By.xpath("//select[@id='child_room']"));
         Select drDn5 = new Select(childtxt);
         drDn5.selectByIndex(4);
         WebElement clcksearch = driver.findElement(By.xpath("//input[@id='Submit']"));
         clcksearch.click();
         
         WebElement radioclck = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
         radioclck.click();
         WebElement clckcontinue = driver.findElement(By.xpath("//input[@id='continue']"));
         clckcontinue.click();
         WebElement firsttxt = driver.findElement(By.xpath("//input[@id='first_name']"));
         firsttxt.sendKeys("Arun");
         WebElement lasttxt = driver.findElement(By.xpath("//input[@id='last_name']"));
         lasttxt.sendKeys("S K");
         WebElement billadtxt = driver.findElement(By.xpath("//textarea[@id='address']"));
         billadtxt.sendKeys("23 B/2 Alwar second street Thuraipakkam Chennai 620008");
         WebElement credittxt = driver.findElement(By.xpath("//input[@id='cc_num']"));
         credittxt.sendKeys("2345678945670932");
         WebElement credittype = driver.findElement(By.xpath("//select[@id='cc_type']"));
         Select drDn6 = new Select(credittype);
         drDn6.selectByIndex(3);
         WebElement exptxt = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
         Select drDn7 = new Select(exptxt);
         drDn7.selectByIndex(9);
         
         WebElement exptxt2 = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
         Select drDn8 = new Select(exptxt2);
         drDn8.selectByVisibleText("2022");
         WebElement cvvtxt = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
         cvvtxt.sendKeys("126");
         WebElement bookclck = driver.findElement(By.xpath("//input[@id='book_now']"));
         bookclck.click();
         Thread.sleep(6000);
         WebElement txt = driver.findElement(By.xpath("//input[@id='order_no']"));
         
         String attribute = txt.getAttribute("value");
         Thread.sleep(3000);
         System.out.println(attribute);
         
         
         
         
         
	}
}