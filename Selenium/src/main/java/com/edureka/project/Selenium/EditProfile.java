package com.edureka.project.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditProfile {
	
	WebDriver driver;
	
	@FindBy(id="personal_details")
	private WebElement personalDetailsLink;
	
	public EditProfile(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickpersonalDetails() {
		personalDetailsLink.click();
	}
	
	

}
