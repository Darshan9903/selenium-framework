package com.allianz.test;

import java.io.File;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.allianz.base.AutomationWrapper;
import com.allianz.pages.DashboardPage;
import com.allianz.pages.LoginPage;
import com.allianz.pages.PIMPage;
import com.allianz.utils.Data_Provider;

public class AddEmployeeTest extends AutomationWrapper {

	@Test
	public void uploadInvalidPictureTest() {
		
	   File file = new File("src/test/resources/files/notes.txt");
	   String absolutePath = file.getAbsolutePath();
		
	   
		wd.findElement(By.name("username")).sendKeys("Admin");
		//enter password admin123
		wd.findElement(By.name("password")).sendKeys("admin123");
		//click on login
		wd.findElement(By.xpath(" //button[text()=' Login ']")).click();
		wd.findElement(By.xpath("//span[text()='PIM']")).click();
		wd.findElement(By.linkText("Add Employee")).click();
		wd.findElement(By.xpath("//input[@type='file']")).sendKeys(absolutePath);
		String text = wd.findElement(By.xpath("//span[text()='File type not allowed']")).getText();
		Assert.assertEquals(text, "File type not allowed");
	
	}
	
	@Test(dataProvider = "commonDataProvider",dataProviderClass = Data_Provider.class)
	public void addEmployeeTest(String username,String password) {
		
		LoginPage loginPage = new LoginPage(wd);
		loginPage.enterUsername( username);
		loginPage.enterPassword( password);
		loginPage.clickOnLogin();
		DashboardPage dash = new DashboardPage(wd);
		dash.clickElement();
		PIMPage page = new PIMPage(wd);
		page.clickOnEmployee();
		page.enterFirstName();
		page.enterMiddletName();
		page.enterLastName();
		page.clickOnSave();
		page.getText();
		
		
	}
}
