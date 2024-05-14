package com.allianz.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.allianz.base.WebDriverKeywords;

public class DashboardPage  extends WebDriverKeywords{
	
	By clickOnLocator= By.xpath("//span[text()='PIM']");

	
    WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	
	public String getDashboard() {
	    return	driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
	}
	
	
	public void clickElement() {
		clickElement(clickOnLocator);
	}

}
