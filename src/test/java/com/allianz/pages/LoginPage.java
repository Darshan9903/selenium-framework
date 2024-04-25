package com.allianz.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.allianz.base.WebDriverKeywords;

public class LoginPage extends WebDriverKeywords {

	private By userNameLocator = By.name("username");
	private By passwordLocator = By.name("password");
	private By loginLocator = By.xpath("//button[normalize-space()='Login']");
	private By eroorLocator = By.xpath("//p[text()='Invalid credentials']");

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void enterUsername(String username) {
		setInputText(userNameLocator, username);
	}

	public void enterPassword(String password) {
		setInputText(passwordLocator, password);
	}

	public void clickOnLogin() {
		clickElement(loginLocator);
	}

	public String getInvalidErrorMessage() {
		String text = driver.findElement(eroorLocator).getText();

		return text;

	}

	public String getUsernamePlaceholder() {
		return driver.findElement(userNameLocator).getAttribute("placeholder");
	}

	public String getPasswordPlaceholder() {
		return driver.findElement(passwordLocator).getAttribute("placeholder");
	}

}
