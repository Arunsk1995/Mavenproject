package org.pom;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import src.test.java.BaseClass;

public class CancelBookingpage extends BaseClass {
	public CancelBookingpage() {
		 PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="//a[text()='Booked Itinerary']")
 private WebElement txtBookingCancel;
@FindBy(id="order_id_text")
private WebElement txtorderId;
@FindBy(id="search_hotel_id")
private WebElement searchHotel;
@FindBy(name="ids[]")
private WebElement clickId;
@FindBy(name="cancelall")
private WebElement cancelAll;

public WebElement getTxtBookingCancel() {
	return txtBookingCancel;
}

public WebElement getTxtorderId() {
	return txtorderId;
}
public WebElement getSearchHotel() {
	return searchHotel;
}
public WebElement getClickId() {
	return clickId;
}
public WebElement getCancelAll() {
	return cancelAll;
}
 public void cancelBooking(String Idtext) throws InterruptedException {
	 
	click(getTxtBookingCancel());
	Assert.assertTrue("verify url", getCurrentUrl().contains("BookedItinerary"));

  SendKeys(getTxtorderId(), Idtext);
  click(getSearchHotel());
  Threds(2000);
  click(getClickId());
  Threds(2000);
  click(getCancelAll());
  Aletrssaccept();
}
}
