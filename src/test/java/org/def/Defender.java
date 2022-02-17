package org.def;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Defender {
	WebDriver driver;

	@Given("user is on adactinhotelapp page")
	public void user_is_on_adactinhotelapp_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
	}

	@When("user enter {string} and {string}")
	public void user_enter_and(String string, String string2) {
		WebElement txtUser = driver.findElement(By.id("username"));
		txtUser.sendKeys(string);

		WebElement txtPass = driver.findElement(By.id("password"));
		txtPass.sendKeys(string2);
	}

	@When("user should click login button")
	public void user_should_click_login_button() {
		WebElement btnclick = driver.findElement(By.name("login"));
		btnclick.click();
	}

	@When("user should dropdown the location")
	public void user_should_dropdown_the_location() {
		WebElement dDblocation = driver.findElement(By.id("location"));
		Select select = new Select(dDblocation);
		select.selectByIndex(1);

		WebElement dDbhotel = driver.findElement(By.id("hotels"));
		Select select2 = new Select(dDbhotel);
		select2.selectByIndex(2);

		WebElement dDbRoomType = driver.findElement(By.id("room_type"));
		Select select3 = new Select(dDbRoomType);
		select3.selectByIndex(2);

		WebElement dDbRoomnos = driver.findElement(By.id("room_nos"));
		Select select4 = new Select(dDbRoomnos);
		select4.selectByIndex(2);

		WebElement dDbAdultRoom = driver.findElement(By.id("adult_room"));
		Select select5 = new Select(dDbAdultRoom);
		select5.selectByIndex(2);

		WebElement dDbChildRoom = driver.findElement(By.id("child_room"));
		Select select6 = new Select(dDbChildRoom);
		select6.selectByIndex(2);

		WebElement btnlogin = driver.findElement(By.id("Submit"));
		btnlogin.click();
	}

	@When("user should select the hotel")
	public void user_should_select_the_hotel() {
		WebElement clkChechBox = driver.findElement(By.id("radiobutton_0"));
		clkChechBox.click();
		WebElement btnContinue = driver.findElement(By.id("continue"));
		btnContinue.click();
	}

	@When("user enter {string},{string},{string},{string} and {string}")
	public void user_enter_and(String string3, String string4, String string5, String string6, String string7) throws InterruptedException {

		WebElement txtFname = driver.findElement(By.id("first_name"));
		txtFname.sendKeys(string3);

		WebElement txtLname = driver.findElement(By.id("last_name"));
		txtLname.sendKeys(string4);

		WebElement txtAddress = driver.findElement(By.id("address"));
		txtAddress.sendKeys(string5);

		WebElement txtCcnum = driver.findElement(By.id("cc_num"));
		txtCcnum.sendKeys(string6);

		WebElement dDntypeCredit = driver.findElement(By.id("cc_type"));
		Select select7 = new Select(dDntypeCredit);

		select7.selectByIndex(1);
		WebElement dDnMonth = driver.findElement(By.id("cc_exp_month"));
		Select select8 = new Select(dDnMonth);
		select8.selectByIndex(11);

		WebElement dDnYear = driver.findElement(By.id("cc_exp_year"));
		Select select9 = new Select(dDnYear);
		select9.selectByIndex(11);

		WebElement txtCccvv = driver.findElement(By.id("cc_cvv"));
		txtCccvv.sendKeys(string7);

		WebElement btnBook = driver.findElement(By.id("book_now"));
		btnBook.click();
		
		Thread.sleep(10000);
	   	 
	   	 WebElement txtOrderNo = driver.findElement(By.id("order_no"));
	   	 
	   	 String OrderNo = txtOrderNo.getAttribute("value");
	   	 System.out.println(OrderNo);

	}
	

//	@Then("user need to verify homepage is appread or not")
//	public void user_need_to_verify_homepage_is_appread_or_not() throws InterruptedException {
//		Thread.sleep(10000);
//   	 
//   	 WebElement txtOrderNo = driver.findElement(By.id("order_no"));
//   	 
//   	 String OrderNo = txtOrderNo.getAttribute("value");
//   	 System.out.println(OrderNo);
//
//	}
	@Then("user should get the order id")
	public void user_should_get_the_order_id()  {
//		Thread.sleep(10000);
//	   	 
//	   	 WebElement txtOrderNo = driver.findElement(By.id("order_no"));
//	   	 
//	   	 String OrderNo = txtOrderNo.getAttribute("value");
	   	 System.out.println("Done");
	}


}
