package com.pie.grcelm.tCSF.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pie.grcelm.tCSF.core.BasePage;

public class FormAuthenticationHomePage extends BasePage {

//	private By headerLocator = By.xpath("//h2[text()='Login Page']");
//	private By userNameLocator = By.xpath("//input[@name='username']");
//	private By passwordLocator = By.xpath("//input[@name='password']");
//	private By loginButtonLocator = By.xpath("//button[@type='submit']");
//	private By logoutSuccessMessageLocator = By.xpath("//div[contains(text(), 'logged out')]");

	public FormAuthenticationHomePage(WebDriver driver) {
		super(driver);
	}

	private By prepareHeaderLocator(String text) {
		return By.xpath("//h2[text()='" + text + "']");
	}

	private By prepareLocatorWithAttributeInput(String text) {
		return By.xpath("//input[@name='" + text + "']");
	}
	
	private By prepareLocatorWithAttributeButton(String text) {
		return By.xpath("//button[@type='" + text + "']");
	}

	private By prepareLocatorWithAttributeDiv(String text) {
		return By.xpath("//div[@id='" + text + "']");
	}

	public Boolean isLinkTextDisplayed(String text) {
		super.waitForVisibility(prepareHeaderLocator(text));
		return super.isDisplayed(prepareHeaderLocator(text));
	}

	public void enterText(String text, String text1) {
		driver.findElement(prepareLocatorWithAttributeInput(text));
		super.sendKeys(prepareLocatorWithAttributeInput(text), text1);
	}

	public String getTextEntered(String text) {
		super.waitForVisibility(prepareLocatorWithAttributeInput(text));
		return super.getAttribute(prepareLocatorWithAttributeInput(text));
	}

	public void clickOnLoginButton(String text) {
		driver.findElement(prepareLocatorWithAttributeButton(text));
		super.click(prepareLocatorWithAttributeButton(text));
	}

	public Boolean isLogoutSuccessMessageLocatorDisplayed(String text) {
		super.waitForVisibility(prepareLocatorWithAttributeDiv(text));
		return super.isDisplayed(prepareLocatorWithAttributeDiv(text));
	}

}
