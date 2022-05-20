package src.test.java;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Junit {
	
		
	static WebDriver driver;
	        @org.junit.BeforeClass
                 public static void BeforeClass() {
           WebDriverManager.chromedriver().setup();
           WebDriver driver = new ChromeDriver();
           driver.get("https://www.facebook.com/");
           driver.manage().window().maximize();
           

				}@Before
                 public void before() {
                  long currentTimeMillis = System.currentTimeMillis();
                  System.out.println(currentTimeMillis);
				}@Test
                 public void test() {
              WebElement findElement = driver.findElement(By.id("email"));
              findElement.sendKeys("Ram Kumar");
              WebElement findElement2 = driver.findElement(By.id("pass"));
              findElement2.sendKeys("Password");
              WebElement findElement3 = driver.findElement(By.name("login"));
              findElement3.click();
              
				}@After
                 public void after() {
                 long currentTimeMillis = System.currentTimeMillis();
                 System.out.println(currentTimeMillis);
				}@AfterClass
                 public static void afterClass() {

				}
}
