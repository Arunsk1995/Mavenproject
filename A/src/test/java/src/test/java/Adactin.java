package src.test.java;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;

public class Adactin {
	public static void main(String[] args) throws IOException, InterruptedException {

		BaseClass baseClass = new BaseClass();
		baseClass.getDriver();
		baseClass.enterUrl("https://adactinhotelapp.com/SearchHotel.php");
		baseClass.Maximum();
		WebElement findelementId2 = baseClass.FindelementId("username");
		String getvalueFromExcel = baseClass.getvalueFromExcel("Sheet1", 1, 0);
		baseClass.SendKeys(findelementId2, getvalueFromExcel);
		WebElement findelementId3 = baseClass.FindelementId("password");
		String getvalueFromExcel2 = baseClass.getvalueFromExcel("Sheet1", 1, 1);
		baseClass.SendKeys(findelementId3, getvalueFromExcel2);
		WebElement findelementId = baseClass.FindelementId("login");
		baseClass.click(findelementId);
		WebElement findelementId4 = baseClass.FindelementId("location");
		String getvalueFromExcel3 = baseClass.getvalueFromExcel("Sheet1", 1, 2);
		baseClass.selectOptionsbyVissibleText(findelementId4, getvalueFromExcel3);
		WebElement findelementId5 = baseClass.FindelementId("hotels");
		String getvalueFromExcel4 = baseClass.getvalueFromExcel("Sheet1", 1, 3);
		baseClass.selectOptionsbyVissibleText(findelementId5, getvalueFromExcel4);
		WebElement findelementId6 = baseClass.FindelementId("room_type");
		String getvalueFromExcel5 = baseClass.getvalueFromExcel("Sheet1", 1, 4);
		baseClass.selectOptionsbyVissibleText(findelementId6, getvalueFromExcel5);
		WebElement findelementId7 = baseClass.FindelementId("room_nos");
		String getvalueFromExcel6 = baseClass.getvalueFromExcel("Sheet1", 1, 5);
		baseClass.selectOptionsbyVissibleText(findelementId7, getvalueFromExcel6);
		WebElement findelementId23 = baseClass.FindelementId("datepick_in");
		String getvalueFromExcel15 = baseClass.getvalueFromExcel("Sheet1", 1, 9);
		baseClass.SendKeys(findelementId23, getvalueFromExcel15);
		WebElement findelementId24 = baseClass.FindelementId("datepick_out");
		String getvalueFromExcel16 = baseClass.getvalueFromExcel("Sheet1", 1, 10);
		baseClass.SendKeys(findelementId24, getvalueFromExcel16);
		WebElement findelementId9 = baseClass.FindelementId("adult_room");
		String getvalueFromExcel8 = baseClass.getvalueFromExcel("Sheet1", 1, 6);
		baseClass.selectOptionsbyVissibleText(findelementId9, getvalueFromExcel8);
		WebElement findelementId10 = baseClass.FindelementId("child_room");
		String getvalueFromExcel9 = baseClass.getvalueFromExcel("Sheet1", 1, 7);
		baseClass.selectOptionsbyVissibleText(findelementId10, getvalueFromExcel9);
		WebElement findelementId8 = baseClass.FindelementId("Submit");
		baseClass.click(findelementId8);
		WebElement findelementId11 = baseClass.FindelementId("radiobutton_0");
		baseClass.click(findelementId11);
		WebElement findelementId12 = baseClass.FindelementId("continue");
		baseClass.click(findelementId12);
		WebElement findelementId13 = baseClass.FindelementId("first_name");
		String getvalueFromExcel7 = baseClass.getvalueFromExcel("Sheet1", 1, 11);
		baseClass.SendKeys(findelementId13, getvalueFromExcel7);
		WebElement findelementId14 = baseClass.FindelementId("last_name");
		String getvalueFromExcel10 = baseClass.getvalueFromExcel("Sheet1", 1, 12);
		baseClass.SendKeys(findelementId14, getvalueFromExcel10);
		WebElement findelementId15 = baseClass.FindelementId("address");
		String getvalueFromExcel11 = baseClass.getvalueFromExcel("Sheet1", 1, 13);
		baseClass.SendKeys(findelementId15, getvalueFromExcel11);
		WebElement findelementId16 = baseClass.FindelementId("cc_num");
		String getvalueFromExcel12 = baseClass.getvalueFromExcel("Sheet1", 1, 14);
		baseClass.SendKeys(findelementId16, getvalueFromExcel12);
		WebElement findelementId17 = baseClass.FindelementId("cc_type");
		String getvalueFromExcel13 = baseClass.getvalueFromExcel("Sheet1", 1, 15);
		baseClass.selectOptionsbyVissibleText(findelementId17, getvalueFromExcel13);
		WebElement findelementId18 = baseClass.FindelementId("cc_exp_month");
		String getvalueFromExcel14 = baseClass.getvalueFromExcel("Sheet1", 1, 16);
		baseClass.selectOptionsbyVissibleText(findelementId18, getvalueFromExcel14);
		WebElement findelementId19 = baseClass.FindelementId("cc_exp_year");
		baseClass.Implicit(30);
		baseClass.selectoptionsbyIndex(findelementId19, 12);
		WebElement findelementId22 = baseClass.FindelementId("cc_cvv");
		String getvalueFromExcel17 = baseClass.getvalueFromExcel("Sheet1", 1, 18);
		baseClass.SendKeys(findelementId22, getvalueFromExcel17);
		WebElement findelementId21 = baseClass.FindelementId("book_now");
		baseClass.click(findelementId21);
		WebElement findelementId20 = baseClass.FindelementId("order_no");
		String attribute = baseClass.getAttribute(findelementId20);
		System.out.println(attribute);
		baseClass.writeData("Sheet1", 1, 19, attribute);
		WebElement Cancelbooking = baseClass.finfElementbypath("//a[text()='Booked Itinerary']");
		baseClass.click(Cancelbooking);
		WebElement findelementId25 = baseClass.FindelementId("order_id_text");
	    String getvalueFromExcel18 = baseClass.getvalueFromExcel("Sheet1", 1, 19);
		baseClass.SendKeys(findelementId25, getvalueFromExcel18);
		WebElement findelementId26 = baseClass.FindelementId("search_hotel_id");
		baseClass.click(findelementId26);
		WebElement findElementName = baseClass.FindElementName("ids[]");
		baseClass.click(findElementName);
		
		WebElement findElementName2 = baseClass.FindElementName("cancelall");
		baseClass.click(findElementName2);
		baseClass.Aletrssaccept();
		

	}
}
