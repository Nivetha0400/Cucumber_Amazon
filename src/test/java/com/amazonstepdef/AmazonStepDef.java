package com.amazonstepdef;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.base.BaseClass;
import com.pom.AmazonPOM;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonStepDef extends BaseClass {
	
	
	AmazonPOM pom= new AmazonPOM(driver);

	@Given("User Enter into the Amazon Home Page")
	public void user_enter_into_the_amazon_home_page() {
	    browserURL(driver, "https://www.amazon.in/", 30);
	}
	@When("User Click the Sign In Button")
	public void user_click_the_sign_in_button() {
		clickElement(driver, pom.getSigninbtn(), 30);
	}
	@When("User Enter the Valid UserName {string}")
	public void user_enter_the_valid_user_name(String username) {
		valuePass(driver,username, pom.getEmailId(), 10);
	}
	@When("User Click the SignIn1 Button")
	public void user_click_the_sign_in1_button() {
		clickElement(driver, pom.getContiuebtn(), 10);
	}
	@When("User Enter the Valid Psssword {string}")
	public void user_enter_the_valid_psssword(String password) {
		valuePass(driver, password, pom.getPassword(), 10);
	}
	@When("User Click the Continue Button")
	public void user_click_the_continue_button() {
		clickElement(driver, pom.getSigninbtnl(), 10);
	}
	@Then("User Landed on the Amazon Home Page")
	public void user_landed_on_the_amazon_home_page() {
		System.out.println("User landed the homepage sucessfully");
	}

	@When("User Click the Search Bar")
	public void user_click_the_search_bar() {
		clickElement(driver, pom.getSearchBtn(), 10);
	}
	    
	
	@When("User Enter the required Product name\"earbuds\"into it")
	public void user_enter_the_required_product_name_earbuds_into_it() {
		valuePass(driver, "earbuds" ,pom.getSearchBtn(), 10);
	}
	   
	@When("User Click the Search Button")
	public void user_click_the_search_button() {
		clickElement(driver, pom.getSearchBtn1(), 10);
	    
	}
	@When("User Click the Product")
	public void user_click_the_product() {
		clickElement(driver, pom.getProduct3(), 30);
		windowhandles(driver, 1);
		 JavascriptExecutor js =(JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,600)");
		 js.executeScript("arguments[0].click();",pom.getCart3());
	    
	}
	@When("User Click the Add to Cart Button")
	public void user_click_the_add_to_cart_button() {
		clickElement(driver, pom.getCart3(), 30);
	    
	}
	@Then("Product added into the Cart")
	public void product_added_into_the_cart() {
	   System.out.println("Product Added into the sucessfully");
	}
	@Then("User Close the current page And User Clear the Searchbar")
	public void user_close_the_current_page_and_user_clear_the_searchbar() {
		driver.close();
		 windowhandles(driver, 0);
		 pom.getSearchBtn().clear();
	}
	@When("User Click the Cart")
	public void user_click_the_cart() {
		clickElement(driver, pom.getCart(), 10);
	  
	}
	@When("User Click Proceed to Pay")
	public void user_click_proceed_to_pay() {
	   clickElement(driver, pom.getProceedPay(), 10);
	}
	@When("User Click the Use The Address")
	public void user_click_the_use_the_address() {
		clickElement(driver, pom.getUseTheAddress(), 10);
	    
	}
	@When("User Click the Credit Or Debit")
	public void user_click_the_credit_or_debit() {
	    clickElement(driver, pom.getCreditOrDebit(), 10);
	}
	@When("User Click Enter the Card Details")
	public void user_click_enter_the_card_details() {
		clickElement(driver, pom.getEnterCardDetails(), 10);
	    
	}
	@When("User Enter the Card Number")
	public void user_enter_the_card_number() {
	    valuePass(driver, "1234 567", pom.getCardNumber(), 10);
	}
	@When("User Click the Enter details")
	public void user_click_the_enter_details() {
		clickElement(driver, pom.getFinalEnterDetails(), 10);


	}
	@Then("User landed on the CheckOut Page")
	public void user_landed_on_the_check_out_page() {
	  System.out.println("User Succesfully buy a product");
	}





}
