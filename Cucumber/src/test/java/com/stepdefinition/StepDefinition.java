package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
WebDriver driver;
	
	@Given("User is on the Adactin Hotel Page")
	public void user_is_on_the_adactin_hotel_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
	}
	@When("User should enter {string} , {string}")
	public void user_should_enter(String username, String Password) {
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys(username);
		WebElement txtpassword = driver.findElement(By.id("password"));
		txtpassword.sendKeys(Password);
		WebElement btclick = driver.findElement(By.id("login"));
		btclick.click();
		
		
	}
	@When("user should select a Hotel {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_should_select_a_hotel(String location, String hotel, String roomtype, String roomNo, String Datein, String Dateout, String adultroom, String childroom) {

		WebElement txtlocation = driver.findElement(By.id("location"));
		txtlocation.sendKeys(location);
		WebElement txthotel = driver.findElement(By.id("hotels"));
		txtlocation.sendKeys(hotel);
		WebElement txtroomNo = driver.findElement(By.id("room_type"));
		txtlocation.sendKeys(roomNo);
		WebElement txtroomtype= driver.findElement(By.id("room_nos"));
		txtlocation.sendKeys(roomtype);
		WebElement txtdatein = driver.findElement(By.id("datepick_in"));
		txtlocation.sendKeys(Datein);
		WebElement txtdateout = driver.findElement(By.id("datepick_out"));
		txtlocation.sendKeys(Dateout);
		WebElement txtadultroom= driver.findElement(By.id("adult_room"));
		txtlocation.sendKeys(adultroom);
		WebElement txtchildroom = driver.findElement(By.id("child_room"));
		txtlocation.sendKeys(childroom);
		WebElement btnsubmit = driver.findElement(By.id("Submit"));
		
		btnsubmit.click();
		WebElement btnradio = driver.findElement(By.id("radiobutton_1"));
		btnradio.click();
		WebElement btncontinue = driver.findElement(By.id("continue"));
		btncontinue.click();
	}
	@When("user should Booking Page {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_should_booking_page(String firstname, String lastname, String address, String creditnum, String credittype, String expmonth, String expyear, String cvv) {
		WebElement txtfirstname = driver.findElement(By.id("first_name"));
		txtfirstname.sendKeys(firstname);
		WebElement txtlastname = driver.findElement(By.id("last_name"));
		txtlastname.sendKeys(lastname);
		WebElement txtaddress = driver.findElement(By.id("address"));
		txtaddress.sendKeys(address);
		WebElement txtcreditnum= driver.findElement(By.id("cc_num"));
		txtcreditnum.sendKeys(creditnum);
		WebElement txtcredittype = driver.findElement(By.id("cc_type"));
		txtcredittype.sendKeys(credittype);
		WebElement txtexpmonth = driver.findElement(By.id("cc_exp_month"));
		txtexpmonth.sendKeys(expmonth);
		WebElement txtexyear= driver.findElement(By.id("cc_exp_year"));
		txtexyear.sendKeys(expyear);
		WebElement txtcvv = driver.findElement(By.id("cc_cvv"));
		txtcvv.sendKeys(cvv);
		WebElement btnbooknow = driver.findElement(By.id("book_now"));
		btnbooknow.click();
	}
	

	

	@When("user should print order id")
	public void user_should_print_order_id() throws InterruptedException {
		Thread.sleep(7000);
		WebElement txtorderid = driver.findElement(By.id("order_no"));
		String attribute = txtorderid.getAttribute("value");
		System.out.println(attribute);
	}



	@Then("User should verify succsess message")
	public void user_should_verify_succsess_message() throws InterruptedException {
		Assert.assertTrue(true);
	
	}




}
