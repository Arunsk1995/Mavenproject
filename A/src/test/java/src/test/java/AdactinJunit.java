package src.test.java;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class AdactinJunit extends BaseClass{
	           @BeforeClass    
                  public static void beforeClass() {
                	 getDriver();
                	 enterUrl("https://adactinhotelapp.com/");
                	 Maximum();
                
				}  @AfterClass
                  public static void afterClass() {
					quit();

				}@Test
                  public void test() throws IOException {
                	  WebElement findelementId = FindelementId("username");
                	  String getvalueFromExcel = getvalueFromExcel("Sheet1", 1, 0);
              		SendKeys(findelementId, getvalueFromExcel);
              		WebElement findelementId3 = FindelementId("password");
              		String getvalueFromExcel2 = getvalueFromExcel("Sheet1", 1, 1);
              		SendKeys(findelementId3, getvalueFromExcel2);
              		WebElement findelementId0 = FindelementId("login");
              		click(findelementId0);
              		
              		Assert.assertTrue("verify url", getCurrentUrl().contains("adactinhotelapp"));
              		WebElement findelementId4 = FindelementId("location");
              		String getvalueFromExcel3 = getvalueFromExcel("Sheet1", 1, 2);
              		selectOptionsbyVissibleText(findelementId4, getvalueFromExcel3);
              		WebElement findelementId5 = FindelementId("hotels");
              		String getvalueFromExcel4 = getvalueFromExcel("Sheet1", 1, 3);
              		selectOptionsbyVissibleText(findelementId5, getvalueFromExcel4);
              		WebElement findelementId6 = FindelementId("room_type");
              		String getvalueFromExcel5 = getvalueFromExcel("Sheet1", 1, 4);
              		selectOptionsbyVissibleText(findelementId6, getvalueFromExcel5);
              		WebElement findelementId7 = FindelementId("room_nos");
              		String getvalueFromExcel6 = getvalueFromExcel("Sheet1", 1, 5);
              	    selectOptionsbyVissibleText(findelementId7, getvalueFromExcel6);
              		WebElement findelementId23 = FindelementId("datepick_in");
              		String getvalueFromExcel15 = getvalueFromExcel("Sheet1", 1, 9);
              		SendKeys(findelementId23, getvalueFromExcel15);
              		WebElement findelementId24 = FindelementId("datepick_out");
              		String getvalueFromExcel16 = getvalueFromExcel("Sheet1", 1, 10);
              		SendKeys(findelementId24, getvalueFromExcel16);
              		WebElement findelementId9 = FindelementId("adult_room");
              		String getvalueFromExcel8 = getvalueFromExcel("Sheet1", 1, 6);
              		selectOptionsbyVissibleText(findelementId9, getvalueFromExcel8);
                	  Assert.assertTrue("verify url", getCurrentUrl().contains("Search"));

              		WebElement findelementId10 = FindelementId("child_room");
              		String getvalueFromExcel9 = getvalueFromExcel("Sheet1", 1, 7);
              		selectOptionsbyVissibleText(findelementId10, getvalueFromExcel9);
              		WebElement findelementId8 = FindelementId("Submit");
              	    click(findelementId8);
              	   
              		WebElement findelementId11 = FindelementId("radiobutton_0");
              		click(findelementId11);
              		 Assert.assertTrue("Verify url", getCurrentUrl().contains("SelectHotel"));
              		WebElement findelementId12 = FindelementId("continue");
              		click(findelementId12);
              		WebElement findelementId13 = FindelementId("first_name");
              		String getvalueFromExcel7 = getvalueFromExcel("Sheet1", 1, 11);
              		SendKeys(findelementId13, getvalueFromExcel7);
              		WebElement findelementId14 = FindelementId("last_name");
              		String getvalueFromExcel10 = getvalueFromExcel("Sheet1", 1, 12);
              		SendKeys(findelementId14, getvalueFromExcel10);
              		WebElement findelementId15 = FindelementId("address");
              		String getvalueFromExcel11 = getvalueFromExcel("Sheet1", 1, 13);
              		SendKeys(findelementId15, getvalueFromExcel11);
              		WebElement findelementId16 = FindelementId("cc_num");
              		String getvalueFromExcel12 = getvalueFromExcel("Sheet1", 1, 14);
              		SendKeys(findelementId16, getvalueFromExcel12);
              		WebElement findelementId17 = FindelementId("cc_type");
              		String getvalueFromExcel13 = getvalueFromExcel("Sheet1", 1, 15);
              		selectOptionsbyVissibleText(findelementId17, getvalueFromExcel13);
              		WebElement findelementId18 = FindelementId("cc_exp_month");
              		String getvalueFromExcel14 = getvalueFromExcel("Sheet1", 1, 16);
              		selectOptionsbyVissibleText(findelementId18, getvalueFromExcel14);
              		WebElement findelementId19 = FindelementId("cc_exp_year");
              		Implicit(30);
              		selectoptionsbyIndex(findelementId19, 12);
              		WebElement findelementId22 = FindelementId("cc_cvv");
              		String getvalueFromExcel17 = getvalueFromExcel("Sheet1", 1, 18);
              		SendKeys(findelementId22, getvalueFromExcel17);
              		Assert.assertTrue("verify url", getCurrentUrl().contains("BookHotel"));

              		WebElement findelementId21 = FindelementId("book_now");
              		click(findelementId21);
              		WebElement findelementId20 = FindelementId("order_no");
              		Assert.assertTrue("verify url", getCurrentUrl().contains("BookingConfirm"));
              		String attribute = getAttribute(findelementId20);
              		System.out.println(attribute);
              	    writeData("Sheet1", 1, 19, attribute);


				}@Before
                  public void before() {
                 long currentTimeMillis = System.currentTimeMillis();
                 System.out.println(currentTimeMillis);
				}@After
                  public void after() {
                 long currentTimeMillis = System.currentTimeMillis();
                 System.out.println(currentTimeMillis);
				}
}
