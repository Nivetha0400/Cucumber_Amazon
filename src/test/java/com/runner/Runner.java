package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\java\\com\\features\\Feature.feature",
		glue="com.stepdef",
		plugin= { "html:HTMLReports/FB.html", 
				"pretty",
				"json:JsonReports/FBJs.json"
				
		}
		
)

public class Runner {
	
}
