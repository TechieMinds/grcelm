package com.pie.grcelm.tCSF.stepDefs;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.pie.grcelm.tCSF.core.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ContextStep {
	
	// Hooks

	@Before
	public void before() {

	}

	@After
	public void after(Scenario scenario) {
		
		if(scenario.isFailed()) {
			if(DriverFactory.getInstance().getDriver() != null) {
				final byte[] screenshot = ((TakesScreenshot) DriverFactory.getInstance().getDriver()).getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshot, "image/png", "image");
			}
		}
		
		DriverFactory.getInstance().quit();
		
	}

}