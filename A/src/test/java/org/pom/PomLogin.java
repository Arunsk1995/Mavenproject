package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import src.test.java.BaseClass;

public class PomLogin extends BaseClass{
	public PomLogin() {
		PageFactory.initElements(driver, this);
  	}
       @FindBy(id="email")
       private WebElement txtusername;
       @CacheLookup
       @FindBy(id="email")
       private WebElement txtusername1;
	public WebElement getTxtusername() {
		return txtusername;
	}
	public WebElement getTxtusername1() {
		return txtusername1;
	}

	public void text() {
      SendKeys(getTxtusername(), "Arun");
	}
	
    
     }
	
	

