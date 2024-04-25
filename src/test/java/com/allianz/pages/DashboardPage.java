package com.allianz.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
	
WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public String getDashboard() {
	    return	driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
	}

}
