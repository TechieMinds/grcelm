package com.pie.grcelm.tCSF.stepDefs;

import org.testng.Assert;

import com.pie.grcelm.tCSF.core.DriverFactory;
import com.pie.grcelm.tCSF.pages.DisappearingElementsAboutPage;
import com.pie.grcelm.tCSF.pages.DisappearingElementsHomePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DisappearingElementsStepDef {

private DriverFactory driverFactory;
	
	public DisappearingElementsStepDef() {
		driverFactory = DriverFactory.getInstance();
	}
	
	@Given ("^I have to navigate to \"(.*)\"$")
	public void navigateToTheHerokuApp(String web) {
		driverFactory.getDriver().navigate().to("https://the-internet.herokuapp.com/");
	}
	
	@Then ("^I have to see the \"(.*)\" heading on the page$")
	public void isLinkDislayed(String linkText) {
		DisappearingElementsHomePage dEHP = new DisappearingElementsHomePage(driverFactory.getDriver());
		Assert.assertTrue(dEHP.isLinkTextDisplayed(linkText));
	} 
	
	@Then ("^I have to see the \"(.*)\" text on the page$")
	public void isLinkTextDislayed(String linkText) {
		DisappearingElementsAboutPage dEAP = new DisappearingElementsAboutPage(driverFactory.getDriver());
		Assert.assertTrue(dEAP.isLinkTextDisplayed(linkText));
	} 
	
	
	@And("I am a background step")
	public void background() {
		System.out.println("background");
	}
	
}
