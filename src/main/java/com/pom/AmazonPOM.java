package com.pom;

import static org.testng.Assert.assertEquals;

import java.awt.Window;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import junit.framework.Assert;

public class AmazonPOM extends com.base.BaseClass {

public WebDriver driver;

@FindBy (xpath = "//a[@id='nav-link-accountList']")
private WebElement signinbtn;

@FindBy (xpath = "//input [@id='ap_email' ]")
private WebElement emailId;

@FindBy (xpath = "//input [@id='continue'] ")
private WebElement contiuebtn;

@FindBy (xpath = "//input [@id='ap_password' ]")
private WebElement password;

@FindBy (xpath = "//input [@id='signInSubmit']")
private WebElement signinbtnl;

@FindBy (xpath = "//span[@class='a-list-item' ]")
private WebElement emailError;

@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
private WebElement searchBtn;

@FindBy(id="nav-search-submit-button")
private WebElement searchBtn1;

@FindBy(xpath = "(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
private WebElement product1;

@FindBy(xpath = "//input[@id='add-to-cart-button']")
private WebElement cart1;

@FindBy(xpath = "(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
private WebElement product2;

@FindBy(xpath = "//span[@id='attachSiNoCoverage']")
private WebElement skip;

@FindBy(xpath = "(//input[@name='submit.add-to-cart'])[2]")
private WebElement cart2;

@FindBy(xpath = "(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
private WebElement product3;

@FindBy(xpath = "(//input[@name='submit.add-to-cart'])[1]")
private WebElement cart3;

@FindBy(xpath = "//span[@class='nav-cart-icon nav-sprite']")
private WebElement cart;

@FindBy(name  = "proceedToRetailCheckout")
private WebElement proceedPay;

@FindBy(xpath = "(//input[@type='submit'])[2]")
private WebElement useTheAddress;

@FindBy(xpath = "(//input[@type='radio'])[1]")
private WebElement creditOrDebit ;

@FindBy(xpath = "(//a[@class='a-link-emphasis pmts-add-cc-default-trigger-link'])[1]")
private WebElement enterCardDetails;

@FindBy(xpath = "//input[@name='addCreditCardNumber']")
private WebElement cardNumber ;

@FindBy(name = "ppw-widgetEvent:AddCreditCardEvent")
private WebElement finalEnterDetails;



public AmazonPOM(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}


public WebElement getSigninbtnl() {
	return signinbtnl;
}
 public WebElement getCardNumber() {
	return cardNumber;
}
 public WebElement getCart1() {
	return cart1;
}
 public WebElement getCart2() {
	return cart2;
}
 public WebElement getCart3() {
	return cart3;
}
 public WebElement getContiuebtn() {
	return contiuebtn;
}
 public WebElement getCreditOrDebit() {
	return creditOrDebit;
}
 public WebElement getEmailId() {
	return emailId;
}
 public WebElement getPassword() {
	return password;
}
 public WebElement getProduct1() {
	return product1;
}
 public WebElement getSigninbtn() {
	return signinbtn;
}
public WebElement getSearchBtn() {
	return searchBtn;
}
public WebElement getEnterCardDetails() {
	return enterCardDetails;
}
public WebElement getFinalEnterDetails() {
	return finalEnterDetails;
}
public WebElement getProceedPay() {
	return proceedPay;
}
public WebElement getSearchBtn1() {
	return searchBtn1;
}
public WebElement getCart() {
	return cart;
}
public WebElement getUseTheAddress() {
	return useTheAddress;
}
   public WebElement getProduct3() {
	return product3;
}    	


public boolean validLogin(ExtentTest extentTest) {
	try {
			browserURL(driver, "https://www.amazon.in/", 30);
			click(driver, signinbtn);
			valuePass(driver, "916369547837", emailId, 10);
			
			click(driver, contiuebtn);
			valuePass(driver, "nivetha0412", password, 20); 
			click(driver, signinbtnl);
			String title = driver.getTitle ();
			org.testng.Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
			extentTest.log(Status.PASS, "Login Sucessfull");
		} catch (Exception e) {
			extentTest.log(Status.FAIL, "Login Failed :"+ e.getMessage());
			return false;
		}
		return true;
}
public void getSearchProd1() {
//	 browserURL(driver, "https://www.amazon.in/", 30);
	 clickElement(driver, searchBtn, 20);
	 valuePass(driver, "watch", searchBtn, 30);
	 clickElement(driver, searchBtn1, 10);
	 clickElement(driver, product1, 10);
	 windowhandles(driver, 1);
	 JavascriptExecutor js =(JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,400)");
	 js.executeScript("arguments[0].click();",cart1);
	 clickElement(driver, skip, 10);
	 clickElement(driver, cart1, 10);
	 driver.close();
	 windowhandles(driver, 0);
	 searchBtn.clear();
	 
	 }

public void getSearchProd2() {
	
	clickElement(driver, searchBtn, 20);
	 valuePass(driver, "samsung", searchBtn, 30);
	 clickElement(driver, searchBtn1, 10);
	 clickElement(driver, product2, 30);
	 windowhandles(driver, 1);
	 JavascriptExecutor js =(JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,600)");
	 js.executeScript("arguments[0].click();",cart2);
	 //clickElement(driver, skip, 10);
	 clickElement(driver, cart2, 10);
	 driver.close();
	 windowhandles(driver, 0);
	 searchBtn.clear();
	 }
public void getSearchProd3() {
	clickElement(driver, searchBtn, 20);
	 valuePass(driver, "earbuds", searchBtn, 30);
	 clickElement(driver, searchBtn1, 10);
	 clickElement(driver, product3, 10);
	 windowhandles(driver, 1);
	 JavascriptExecutor js =(JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,600)");
	 js.executeScript("arguments[0].click();",cart3);
	 //clickElement(driver, skip, 10);
	 clickElement(driver, cart3, 10);
	 driver.close();
	 windowhandles(driver, 0);
	 searchBtn.clear();
	 }
public void getMainCart() {
	clickElement(driver, cart, 20);
	clickElement(driver, proceedPay, 20);
	clickElement(driver, useTheAddress, 20);
	
}
public void getPayment() {
	clickElement(driver, creditOrDebit, 20);
	clickElement(driver, enterCardDetails, 10);
	valuePass(driver, "1234 5678 9009", cardNumber, 30);
	clickElement(driver, finalEnterDetails, 10);
	
	
	
}


}


	

     





//earbuds

//samsung s24





























