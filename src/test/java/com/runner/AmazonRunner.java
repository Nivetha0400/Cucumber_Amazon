package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.base.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src\\test\\java\\com\\features\\amazon.feature",
		glue ="com.amazonstepdef",
		plugin = { "html:HTMLReports/amazon.html",
		          "pretty",
		          "json:jsonReports/amazonjs.json",
		          "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)

public class AmazonRunner extends BaseClass{
 
	@BeforeClass
	public static void sessionStart() {
		browserLaunch("chrome");

	}
	@AfterClass
	public static void sessionEnd() {
		terminateBrowser(driver);

	}
}
