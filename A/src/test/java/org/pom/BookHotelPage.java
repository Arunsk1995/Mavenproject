package org.pom;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import src.test.java.BaseClass;

public class BookHotelPage extends BaseClass {
	public BookHotelPage() {
		 PageFactory.initElements(driver, this);
	}
           @FindBy(id="first_name")
           private WebElement txtFirstName;
           
           @FindBy(id="last_name")
           private WebElement txtLastName;
           
           @FindBy(id="address")
           private WebElement txtAddress;
           
           @FindBy(id="cc_num")
           private WebElement txtCreditNum;
           
           @FindBy(id="cc_type")
           private WebElement dDnCreditType;
           
           @FindBy(id="cc_exp_month")
           private WebElement dDnExpMon;
           
           @FindBy(id="cc_exp_year")
           private WebElement dDnExpyear;
           
           @FindBy(id="cc_cvv")
           private WebElement txtCcvNum;
           
           @FindBy(id="book_now")
           private WebElement btnBookNow;

		public WebElement getTxtFirstName() {
			return txtFirstName;
		}

		public WebElement getTxtLastName() {
			return txtLastName;
		}

		public WebElement getTxtAddress() {
			return txtAddress;
		}

		public WebElement getTxtCreditNum() {
			return txtCreditNum;
		}

		public WebElement getdDnCreditType() {
			return dDnCreditType;
		}

		public WebElement getdDnExpMon() {
			return dDnExpMon;
		}

		public WebElement getdDnExpyear() {
			return dDnExpyear;
		}

		public WebElement getTxtCcvNum() {
			return txtCcvNum;
		}

		public WebElement getBtnBookNow() {
			return btnBookNow;
		}
           
           public void bookHotel(String firstName,String LastName,String address,String creditNum,String creditType,String expMonth,String expyear,String ccvNum) {
        	   Assert.assertTrue("verify url", getCurrentUrl().contains("BookHotel"));
         SendKeys(getTxtFirstName(), firstName);
         SendKeys(getTxtLastName(), LastName);
         SendKeys(getTxtAddress(),address);
         SendKeys(getTxtCreditNum(), creditNum);
         selectOptionsbyVissibleText(getdDnCreditType(), creditType);
         selectOptionsbyVissibleText(getdDnExpMon(), expMonth);
         type(getdDnExpyear(), expyear);
         SendKeys(getTxtCcvNum(), ccvNum);
         click(getBtnBookNow());
         
		}
}
