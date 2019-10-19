package com.edureka.project.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditPersonalDetails {
	
	WebDriver drriver;
	
	@FindBy(name="fullname")
	private WebElement fullname;
	
	@FindBy(name="phone_number")
	private WebElement phonenumber;
	
	@FindBy(name="currentrole")
	private WebElement currentrole;
	
	@FindBy(id="experience")
	private WebElement experience;
	
	@FindBy(css="#experience > option:nth-child(4)")
	private WebElement experienceRange;
	
	@FindBy(css="#collapseOne > div > div > form > button")
	private WebElement continueButton;
	
	public EditPersonalDetails(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterPersonaldetails(String name,String number,String role) throws InterruptedException {
		fullname.clear();
		fullname.sendKeys(name);
		phonenumber.clear();
		phonenumber.sendKeys(number);
		currentrole.clear();
		currentrole.sendKeys(role);
		Thread.sleep(2000);
		experience.click();
		experienceRange.click();
		Thread.sleep(2000);
		continueButton.click();
		
	}

}
