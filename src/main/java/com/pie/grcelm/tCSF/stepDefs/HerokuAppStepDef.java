package com.pie.grcelm.tCSF.stepDefs;

import org.testng.Assert;

import com.pie.grcelm.tCSF.core.DriverFactory;
import com.pie.grcelm.tCSF.pages.HerokuAppPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HerokuAppStepDef {

	private DriverFactory driverFactory;

	public HerokuAppStepDef() {
		driverFactory = DriverFactory.getInstance();
	}
	
	@Then("^I should see the \"(.*)\" heading on the page$")
	public void isHeaderDisplayed(String linkText) {
		HerokuAppPage hAP = new HerokuAppPage(driverFactory.getDriver());
		Assert.assertTrue(hAP.isHeaderDisplayed(linkText));
	}

	@When("^I click on the \"(.*)\" link$")
	public void clickOnTheLink(String linkText) {
		HerokuAppPage hAP = new HerokuAppPage(driverFactory.getDriver());
		hAP.clickOnTheLink(linkText);
	}

}
