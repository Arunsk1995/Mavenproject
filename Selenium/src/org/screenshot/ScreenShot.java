package org.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.moneycontrol.com/markets/fno-market-snapshot");
		driver.manage().window().maximize();
//		WebElement scrnshot = driver.findElement(By.xpath("//div[@class='twoCol MT20 clearfix no_brd']"));
		WebElement scrnshot1 = driver.findElement(By.xpath("//div[@class='leftD'][1]"));
		
		File s = scrnshot1.getScreenshotAs(OutputType.FILE);
		File d = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Screenshot\\login2.png");
		
		FileUtils.copyFile(s, d);
		
	
		
		
}
}