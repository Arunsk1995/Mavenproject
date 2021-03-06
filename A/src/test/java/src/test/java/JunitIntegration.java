package src.test.java;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.pom.BookHotelPage;
import org.pom.BookingConfirmPage;
import org.pom.CancelBookingpage;
import org.pom.LoginPage;
import org.pom.SearchHotelpage;
import org.pom.SelectHotelPage;

public class JunitIntegration extends BaseClass{
	           @BeforeClass    
                  public static void beforeClass() {
                	 getDriver();
                	 enterUrl("https://adactinhotelapp.com/");
                	 Maximum();
                
				}  @AfterClass
                  public static void afterClass() {
				}

				@Test
                  public void test() throws IOException, InterruptedException {
                	 LoginPage loginPage = new LoginPage();
                	 String userName = getvalueFromExcel("Sheet1",1, 0);
                	 String password = getvalueFromExcel("Sheet1",1, 1);
                	 loginPage.logins(userName, password);
                	 SearchHotelpage searchHotelpage = new SearchHotelpage();
                	 String location = getvalueFromExcel("Sheet1",1, 2);
                	 String Hotels = getvalueFromExcel("Sheet1",1, 3);
                	 String roomType = getvalueFromExcel("Sheet1",1, 4);
                	 String room_nos = getvalueFromExcel("Sheet1",1, 5);
                	 String checkInDate = getvalueFromExcel("Sheet1",1, 9);
                	 String checkOutDate = getvalueFromExcel("Sheet1",1, 10);
                	 String adultRoom = getvalueFromExcel("Sheet1",1, 6);
                	 String childRoom = getvalueFromExcel("Sheet1",1, 7);
                	 String firstName = getvalueFromExcel("Sheet1",1, 11);
                	 String LastName = getvalueFromExcel("Sheet1",1, 12);
                	 String address = getvalueFromExcel("Sheet1",1, 13);
                	 String creditNum = getvalueFromExcel("Sheet1",1, 14);
                	 String creditType = getvalueFromExcel("Sheet1",1, 15);
                	 String expMonth = getvalueFromExcel("Sheet1",1, 16);
                	 String expyear = getvalueFromExcel("Sheet1",1, 17);
                	 String ccvNum = getvalueFromExcel("Sheet1",1, 18);
                	
                	 
                	 searchHotelpage.Submit(location, Hotels, roomType, room_nos, checkInDate, checkOutDate, adultRoom, childRoom);
                	 SelectHotelPage selectHotelPage = new SelectHotelPage();
                	 selectHotelPage.selectHotel();
                	 BookHotelPage bookHotelPage=new BookHotelPage();
                	 bookHotelPage.bookHotel(firstName, LastName, address, creditNum, creditType, expMonth, expyear, ccvNum);
                	 Thread.sleep(5000);
                	 BookingConfirmPage bookingConfirmPage=new BookingConfirmPage();
                	 bookingConfirmPage.bookingconfirm();
                	
               	 CancelBookingpage cancelBookingpage=new CancelBookingpage();
               	 String Idtext = getvalueFromExcel("Sheet1",1, 19);
              	 cancelBookingpage.cancelBooking(Idtext);
				}
				
				@Before
                  public void before() {
                 long currentTimeMillis = System.currentTimeMillis();
                 System.out.println(currentTimeMillis);
				}
				@After
                  public void after() {
                 long currentTimeMillis = System.currentTimeMillis();
                 System.out.println(currentTimeMillis);
				}
				
}
