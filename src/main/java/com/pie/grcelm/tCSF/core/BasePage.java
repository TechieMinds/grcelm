package com.pie.grcelm.tCSF.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	protected WebDriver driver;
	protected WebDriverWait wait;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 30);
	}

	public void click(By locator) {
		driver.findElement(locator).click();
	}

	public Boolean isDisplayed(By locator) {
		return driver.findElement(locator).isDisplayed();
	}

	public void waitForVisibility(By locator) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public void waitForClickability(By locator) {
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	public void waitForPresence(By locator) {
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public void sendKeys(By locator, String text) {
		driver.findElement(locator).sendKeys(text);
	}

	public String getAttribute(By locator) {
		return driver.findElement(locator).getAttribute("value");
	}
	
}
