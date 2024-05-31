package com.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StedDef {
	static WebDriver driver;
	
	@Given("User landed on the Facebook page")
	public void user_landed_on_the_facebook_page() {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
	    
	}
	@When("User enter the Username into the Username Field {string}")
	public void user_enter_the_username_into_the_username_field(String userName) { 
	    driver.findElement(By.id("email")).sendKeys(userName);
	}
	@When("User enter the Password into the Password Field {string}")
	public void user_enter_the_password_into_the_password_field(String passWord) {
	    driver.findElement(By.name("pass")).sendKeys(passWord);
	}
	@And("User Click the Login button")
	public void user_click_the_login_button() {
	   driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	@Then("User landed on the Facebook Home Page")
	public void user_landed_on_the_facebook_home_page() {
	    System.out.println("User landed on the Facebook Home Page");
	}




}
