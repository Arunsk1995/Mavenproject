package org.pom;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;

import io.github.bonigarcia.wdm.WebDriverManager;
import src.test.java.BaseClass;

public class CacheLookUp extends BaseClass {

	
	        @BeforeClass
                 public static void BeforeClass() {
           WebDriverManager.chromedriver().setup();
           WebDriver driver = new ChromeDriver();
           driver.get("https://www.facebook.com/");
           driver.manage().window().maximize();
           

				}@Before
                 public void before() {
                 
				}
				
				@Test
                 public void test() {
					
					PomLogin login = new PomLogin();
					
                login.text();
//                long startwithoutcache = System.currentTimeMillis();
//                for (int i = 1; i < 1000; i++) {
//                	String attribute = getAttribute(login.getTxtusername());
//					
//				}
//                long endwithoutcache = System.currentTimeMillis();
//                System.out.println((endwithoutcache-startwithoutcache)/1000);
//                type(login.getTxtusername1(), "Ramesh");
//                long startwithcache = System.currentTimeMillis();
//                for (int i = 0; i <1000; i++) {
//                	String attribute1 = getAttribute(login.getTxtusername1());
//					
//				}
//                long endwithcache = System.currentTimeMillis();
//                 System.out.println((endwithcache-startwithcache)/1000);
//             
				}@After
                 public void after() {
                
				}@AfterClass
                 public static void afterClass() {

				}
   
}
