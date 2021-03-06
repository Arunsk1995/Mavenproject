package org.pom;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import src.test.java.BaseClass;

public class SelectHotelPage extends BaseClass {
	public SelectHotelPage() {
		 PageFactory.initElements(driver, this);
	}
  @FindBy(id="radiobutton_0")
  private WebElement btnRadio;
  @FindBy(id="continue")
  private WebElement btnContinue;
public WebElement getBtnRadio() {
	return btnRadio;
}
public WebElement getBtnContinue() {
	return btnContinue;
}
  
  public void selectHotel() {
  	Assert.assertTrue("verify url", getCurrentUrl().contains("SelectHotel"));

  click(getBtnRadio());
  click(getBtnContinue());
}
}
