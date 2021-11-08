package com.pie.grcelm.tCSF.stepDefs;

import org.testng.Assert;

import com.pie.grcelm.tCSF.core.DriverFactory;
import com.pie.grcelm.tCSF.pages.FormAuthenticationHomePage;
import com.pie.grcelm.tCSF.pages.FormAuthenticationSecurePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FormAuthenticationStepDef {

private DriverFactory driverFactory;
	
	public FormAuthenticationStepDef() {
		driverFactory = DriverFactory.getInstance();
	}
	
	@When ("^I click on \"(.*)\" button$")
	public void clickOnTheButton(String linkText) {
		FormAuthenticationHomePage fAHP = new FormAuthenticationHomePage(driverFactory.getDriver());
		fAHP.clickOnLoginButton(linkText);
	}
	
	@Then ("^I have to see the \"(.*)\" text displayed on the page$")
	public void isLinkTextDislayed(String linkText) {
		FormAuthenticationHomePage fAHP = new FormAuthenticationHomePage(driverFactory.getDriver());
		Assert.assertTrue(fAHP.isLinkTextDisplayed(linkText));
	} 
	
	@When ("^I enter the \"(.*)\" which is \"(.*)\" in the textfield provided$")
	public void enterUserName(String linkText, String linkText1) {
		FormAuthenticationHomePage fAHP = new FormAuthenticationHomePage(driverFactory.getDriver());
		fAHP.enterText(linkText, linkText1);
	}
	
	@Then ("^I have to print the \"(.*)\" that is entered in the text field$")
	public void getTextEntered(String linkText) {
		FormAuthenticationHomePage fAHP = new FormAuthenticationHomePage(driverFactory.getDriver());
		System.out.println("The userName entered is: " + fAHP.getTextEntered(linkText));
	} 
	
	@Then ("^I have to see \"(.*)\" text displayed on the page$")
	public void isSecureAreaTextDislayed(String linkText) {
		FormAuthenticationSecurePage fASP = new FormAuthenticationSecurePage(driverFactory.getDriver());
		Assert.assertTrue(fASP.isHeaderDisplayed(linkText));
	}
	
	@When ("^I click on \"(.*)\" button link$")
	public void clickOnLogoutButton(String linkText) {
		FormAuthenticationSecurePage fASP = new FormAuthenticationSecurePage(driverFactory.getDriver());
		fASP.clickOnLogoutButton(linkText);
	}
	
	@Then ("^I have to see \"(.*)\" text loggedout successful displayed$")
	public void isLoggedOutTextDislayed(String linkText) {
		FormAuthenticationHomePage fAHP = new FormAuthenticationHomePage(driverFactory.getDriver());
		Assert.assertTrue(fAHP.isLogoutSuccessMessageLocatorDisplayed(linkText));
	}
	
}
