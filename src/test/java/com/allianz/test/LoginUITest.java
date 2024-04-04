package com.allianz.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginUITest {

	@Test
	public void titleTest() {
		System.out.println("darshan");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String actualTile = wd.getTitle();
		System.out.println(actualTile);
		Assert.assertEquals(actualTile, "OrangeHRM");
		// git remote add origin https://github.com/Darshan9903/selenium-framework.git

	}

	@Test
	public void getVersion() {
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String version = wd.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-copyright']")).getText();

		Assert.assertEquals(version, "OrangeHRM OS 5.6.1");
		System.out.println(version);

	}
}
