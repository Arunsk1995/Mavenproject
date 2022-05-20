package org.navigate;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
                         public static void main(String[] args) throws InterruptedException, MalformedURLException {
							System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
							
							WebDriver driver = new ChromeDriver();
							URL url = new URL("https://www.facebook.com/");
							driver.navigate().to(url);
							driver.manage().window().maximize();
							
							Thread.sleep(2000);
							
							driver.navigate().back();
							Thread.sleep(2000);
							driver.navigate().forward();
							Thread.sleep(2000);
							driver.navigate().refresh();
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
						}
}
