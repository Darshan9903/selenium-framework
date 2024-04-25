package com.allianz.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.allianz.base.AutomationWrapper;
import com.allianz.pages.DashboardPage;
import com.allianz.pages.LoginPage;
import com.allianz.utils.Data_Provider;

public class LoginTest extends AutomationWrapper {
	
	@Test(dataProvider = "commonDataProvider",dataProviderClass = Data_Provider.class)
	public void validLoginTest(String username,String password,String Dashboard)
	{
		LoginPage loginPage = new LoginPage(wd);
		loginPage.enterUsername( username);
		loginPage.enterPassword( password);
		loginPage.clickOnLogin();
		
		DashboardPage dashboardPage = new DashboardPage(wd);
		String text = dashboardPage.getDashboard();
		Assert.assertEquals(text, Dashboard);
		System.out.println(text);
		
	}

	
	
	@Test(dataProvider = "commonDataProvider",dataProviderClass = Data_Provider.class)
	public void invalidLoginTest(String username,String password,String errors)
	{
		LoginPage loginPage = new LoginPage(wd);
		loginPage.enterUsername( username);
		loginPage.enterPassword( password);
		loginPage.clickOnLogin();
		loginPage.getInvalidErrorMessage();
		//Assert the error - Invalid credentials
		String error = wd.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();
		Assert.assertEquals(error, errors);
		System.out.println(error);
		
	}

}
