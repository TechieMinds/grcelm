package com.pie.grcelm.tCSF.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

private static DriverFactory driverFactory;
	
	private WebDriver driver;

	public WebDriver createChromeDriver() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	public WebDriver createFirefoxDriver() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	public WebDriver createDriver(String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
			return createChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			return createFirefoxDriver();
		}
		return null;
	}
	
	public WebDriver getDriver() {
		if(driver == null) {
			driver = createChromeDriver();
		}
		return driver;
	}
	
	public void quit() {
		if(driver != null) {
			driver.quit();
			driver = null;
		}
	}
	
	//Singleton
	private DriverFactory() {
		
	}
	
	public static DriverFactory getInstance() {
		if(driverFactory == null) {
			driverFactory = new DriverFactory();
		}
		return driverFactory;
	}

	
}
