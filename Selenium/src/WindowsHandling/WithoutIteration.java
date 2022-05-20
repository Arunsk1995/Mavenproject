package WindowsHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutIteration {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement txtsearch = driver.findElement(By.xpath("//input[@type='text']"));

		txtsearch.sendKeys("iphone");
		WebElement txtseabtn = driver.findElement(By.xpath("//input[@type='submit']"));

		txtseabtn.click();
		Thread.sleep(3000);
		WebElement amapro = driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - (Product) RED']"));
		amapro.click();
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);

		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		List<String> Allwindows = new ArrayList<String>();
		Allwindows.addAll(windowHandles);
		String string = Allwindows.get(1);
		driver.switchTo().window(string);
		WebElement findElement = driver.findElement(By.xpath("//input[@name='submit.add-to-cart']"));
		findElement.click();
		driver.close();
		
	}
}
