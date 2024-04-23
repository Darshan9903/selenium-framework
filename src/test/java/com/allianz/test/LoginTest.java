package com.allianz.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.allianz.base.AutomationWrapper;
import com.allianz.utils.Data_Provider;

public class LoginTest extends AutomationWrapper {
	
	@Test(dataProvider = "commonDataProvider",dataProviderClass = Data_Provider.class)
	public void validLoginTest(String username,String password,String Dashboard)
	{
		wd.findElement(By.name("username")).sendKeys(username);
		//enter password admin123
		wd.findElement(By.name("password")).sendKeys(password);
		//click on login
		wd.findElement(By.xpath(" //button[text()=' Login ']")).click();
		//Assert the header - Dashboard
		String text = wd.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
		Assert.assertEquals(text, Dashboard);
		System.out.println(text);
		
	}

	
	
	@Test(dataProvider = "commonDataProvider",dataProviderClass = Data_Provider.class)
	public void invalidLoginTest(String username,String password,String errors)
	{
		wd.findElement(By.name("username")).sendKeys(username);
		//enter password darsh123
		wd.findElement(By.name("password")).sendKeys(password);
		//click on login
		wd.findElement(By.xpath(" //button[text()=' Login ']")).click();
		//Assert the error - Invalid credentials
		String error = wd.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();
		Assert.assertEquals(error, errors);
		System.out.println(error);
		
	}

}
