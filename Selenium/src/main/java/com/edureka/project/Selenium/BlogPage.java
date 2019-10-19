package com.edureka.project.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlogPage {
	
	WebDriver driver;
	
	@FindBy(id="wzrk-cancel")
	private WebElement noThanksButton;
	
	@FindBy(linkText="Software Testing")
	private WebElement softwareTestingLink;
	
	public BlogPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void navigateSelenium() {
		noThanksButton.click();
		softwareTestingLink.click();
		
	}
	
	

}
