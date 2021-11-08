package com.pie.grcelm.tCSF.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pie.grcelm.tCSF.core.BasePage;

public class HerokuAppPage extends BasePage {

//	private By headerLocator = By.xpath("//h1[text()='Welcome to the-internet']");
//	private By formAuthenticationLinkLocator = By.xpath("//a[text()='Form Authentication']");
//	private By disappearingElementsLinkLocator = By.xpath("//a[text()='Disappearing Elements']");

	public HerokuAppPage(WebDriver driver) {
		super(driver);
	}

	private By prepareHeaderLocatorWithHeaderText(String text) {
		return By.xpath("//h1[text()='" + text + "']");
	}

	private By prepareHeaderLocatorWithTextInAttributeA(String text) {
		return By.xpath("//a[text()='" + text + "']");
	}
	
	public Boolean isHeaderDisplayed(String text) {
		super.waitForVisibility(prepareHeaderLocatorWithHeaderText(text));
		return super.isDisplayed(prepareHeaderLocatorWithHeaderText(text));
	}

	public void clickOnTheLink(String text) {
		super.waitForVisibility(prepareHeaderLocatorWithTextInAttributeA(text));
		super.click(prepareHeaderLocatorWithTextInAttributeA(text));
	}

}
