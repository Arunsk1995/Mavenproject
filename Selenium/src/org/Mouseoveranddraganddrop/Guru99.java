package org.Mouseoveranddraganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Guru99 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();

		WebElement dragbank = driver.findElement(By.xpath("//li[@class='block14 ui-draggable']"));
		WebElement destbank = driver.findElement(By.xpath("//ol[@id='bank']"));
		WebElement srceamount = driver.findElement(By.xpath("//li[@id='fourth'][1]"));
		WebElement destamount = driver.findElement(By.xpath("//ol[@id='amt7']"));
		WebElement srcesale = driver.findElement(By.xpath("//li[@id='credit1']"));
		WebElement destsale = driver.findElement(By.xpath("//ol[@id='loan']"));
		WebElement srceamt = driver.findElement(By.xpath("//li[@id='fourth'][1]"));
		WebElement destamt = driver.findElement(By.xpath("//ol[@id='amt8']"));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(dragbank, destbank).perform();
		actions.dragAndDrop(srceamount, destamount).perform();
		actions.dragAndDrop(srcesale, destsale).perform();
		actions.dragAndDrop(srceamt, destamt).perform();
		WebElement perfextwrd = driver.findElement(By.xpath("//a[text()='Perfect!']"));
		String text = perfextwrd.getText();
		System.out.println(text);
	}
}