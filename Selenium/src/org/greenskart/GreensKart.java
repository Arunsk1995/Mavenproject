package org.greenskart;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensKart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenscart.in/#/login?returnUrl=%2F");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement txtemail = driver.findElement(By.xpath("//input[@id='loginEmailId']"));
		txtemail.sendKeys("arunsk199514@gmail.com");
		Thread.sleep(3000);
		WebElement txtpass = driver.findElement(By.xpath("//input[@id='loginPassword']"));
		txtpass.sendKeys("Good@run007");
		Thread.sleep(3000);
		WebElement btnlgn = driver.findElement(By.xpath("//input[@class='btnRegister form-control']"));
		btnlgn.click();
		Thread.sleep(3000);

		WebElement iphonebtn = driver.findElement(By.xpath("//a[text()='MOBILE']"));
		Thread.sleep(3000);
		iphonebtn.click();

		WebElement serachbtn = driver.findElement(By.xpath(
				"//img[@src='https://www.reliancedigital.in/medias/Apple-iPhone12-Mini-Smartphones-491901543-i-1-1200Wx1200H?context=bWFzdGVyfGltYWdlc3wxMTQ0MjF8aW1hZ2UvanBlZ3xpbWFnZXMvaGVkL2gzNy85Njc1ODY4MzA3NDg2LmpwZ3wxMzU1NDZhZDkzNTk5OTM2OTdlZjZjYTZiODQ2ZDhmOWYzMTA0ZTNiYjg2OGM3ZWVhNDc1MjkwMDQ2ZTkwNGVm']"));
		serachbtn.click();
		WebElement txtbox = driver.findElement(By.xpath("//button[text()='Buy Now']"));
		txtbox.click();
		WebElement btnclose = driver.findElement(By.xpath("//button[text()='ADD GIFT CODE']"));
		btnclose.click();
		WebElement giftdble = driver.findElement(By.xpath("//span[text()='GRN10']"));
		Actions action = new Actions(driver);
		action.doubleClick(giftdble).perform();
		WebElement giftright = driver.findElement(By.xpath("//span[@class='px-1 close']"));
		action.contextClick(giftright).perform();
		WebElement closeclk = driver.findElement(By.xpath("//div[text()='Remove Promo Code ']"));
		closeclk.click();

	}
}