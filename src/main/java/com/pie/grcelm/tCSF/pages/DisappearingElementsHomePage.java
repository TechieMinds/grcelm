package com.pie.grcelm.tCSF.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pie.grcelm.tCSF.core.BasePage;

public class DisappearingElementsHomePage extends BasePage {

//	private By headerLocator  = By.xpath("//h3[text()='Disappearing Elements']");
//	private By homeButtonLocator = By.xpath("//a[text()='Home']");
//	private By aboutButtonLocator = By.xpath("//a[text()='About']");

	public DisappearingElementsHomePage(WebDriver driver) {
		super(driver);
	}

	private By prepareHeaderLocator(String text) {
		return By.xpath("//h3[text()='" + text + "']");
	}

	private By prepareLocatorWithAttributeA(String text) {
		return By.xpath("//a[text()='" + text + "']");
	}

	public Boolean isLinkTextDisplayed(String text) {
		super.waitForVisibility(prepareHeaderLocator(text));
		return super.isDisplayed(prepareHeaderLocator(text));
	}

	public void clickOnTheElement(String text) {
		super.waitForVisibility(prepareLocatorWithAttributeA(text));
		super.click(prepareLocatorWithAttributeA(text));
	}

}
