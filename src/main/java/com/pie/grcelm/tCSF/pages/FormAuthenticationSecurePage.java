package com.pie.grcelm.tCSF.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pie.grcelm.tCSF.core.BasePage;

public class FormAuthenticationSecurePage extends BasePage{

//	private By headerLocator = By.xpath("//h2[text()=' Secure Area']");
//	private By logoutButtonLocator = By.xpath("//a[@href='/logout']");
	
	public FormAuthenticationSecurePage(WebDriver driver) {
		super(driver);
	}

	private By prepareHeaderLocator(String text) {
		return By.xpath("//div[@id='"+text+"']");
	}
	
	private By prepareLocatorWithAttributeA(String text) {
		return By.xpath("//a[@href='"+text+"']");
	}
	
	public Boolean isHeaderDisplayed(String text) {
		super.waitForVisibility(prepareHeaderLocator(text));
		return super.isDisplayed(prepareHeaderLocator(text));
	}

	public void clickOnLogoutButton(String text) {
		super.click(prepareLocatorWithAttributeA(text));
	}
	
}
