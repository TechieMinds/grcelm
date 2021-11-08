package com.pie.grcelm.tCSF.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pie.grcelm.tCSF.core.BasePage;

public class DisappearingElementsAboutPage extends BasePage{


//	private By notFoundLocator = By.xpath("//h1[text()='Not Found']");

	public DisappearingElementsAboutPage(WebDriver driver) {
		super(driver);
	}

	private By prepareHeaderLocator(String text) {
		return By.xpath("//h1[text()='"+text+"']");
	}
	
	public Boolean isLinkTextDisplayed(String text) {
		super.waitForPresence(prepareHeaderLocator(text));
		return super.isDisplayed(prepareHeaderLocator(text));
	}
	
}
