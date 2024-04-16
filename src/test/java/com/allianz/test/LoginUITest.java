package com.allianz.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.allianz.base.AutomationWrapper;

public class LoginUITest extends AutomationWrapper{

	

	@Test
	public void titleTest() {

		String actualTile = wd.getTitle();
		System.out.println(actualTile);
		Assert.assertEquals(actualTile, "OrangeHRM");

	}

	@Test
	public void getVersionTest() {

		String version = wd.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-copyright']")).getText();
		Assert.assertEquals(version, "OrangeHRM OS 5.6.1");
		System.out.println(version);

	}
}
