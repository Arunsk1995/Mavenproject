package src.test.java;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InsertValue {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();
		WebElement signup = driver.findElement(By.xpath("//a[@id='pr_register']"));
		signup.click();
		WebElement select = driver.findElement(By.xpath("//select[@name='month']"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		select.click();

		File file = new File("C:\\Users\\DELL\\eclipse-workspace\\A\\Sample\\name1.xlsx");
		Workbook workbook = new XSSFWorkbook();
		Sheet createSheet = workbook.createSheet("Test");

		Select selects = new Select(select);
		List<WebElement> options = selects.getOptions();
		for (int i = 0; i < options.size(); i++) {

			WebElement webElement = options.get(i);
			String text = webElement.getText();
			System.out.println(text);

			Row createRow = createSheet.createRow(i);
		
				Cell createCell = createRow.createCell(0);
				createCell.setCellValue(text);

		
			FileOutputStream out = new FileOutputStream(file);
			workbook.write(out);
		}
	}

}
