package com.allianz.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.allianz.base.WebDriverKeywords;

public class PIMPage extends WebDriverKeywords{
	
	WebDriver wd;
	
	By addEmployeeLocatore = By.linkText("Add Employee");
	By firstNameLocatore = By.name("firstName");
	By middleNameLocatore = By.name("middleName");
	By lastNameLocatore = By.name("lastName");
	By saveButtonLocator = By.xpath("//button[text()=' Save ']");
	
	By getTextLocator = By.xpath("//h6[text()='darshh patil']");
	
	public PIMPage(WebDriver wd) {
		super(wd);
		this.wd=wd;
	}
	
	
	public void clickOnEmployee() {
		clickElement(addEmployeeLocatore);
	}
	
	public void enterFirstName() {
		setInputText(firstNameLocatore, "darshh");
	}
	
	public void enterMiddletName() {
		setInputText(middleNameLocatore, "dasrh");
	}
	
	public void enterLastName() {
		setInputText(lastNameLocatore, "patil");
	}
	
	public void clickOnSave() {
		clickElement(saveButtonLocator);
		
	}
	
	public void getText() {
		getText(getTextLocator);
	}
	
	
	

}
