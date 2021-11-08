package com.pie.grcelm.tCSF.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		glue = { "com.pie.grcelm.tCSF.stepDefs" }, 
		features = { "classpath:feature" },
//		tags = "@Data",
				plugin = {
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "pretty"
						}

)
public class UITestRunner extends AbstractTestNGCucumberTests {

	
}
