package com.allianz.test;

import java.io.File;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.allianz.base.AutomationWrapper;

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
}
