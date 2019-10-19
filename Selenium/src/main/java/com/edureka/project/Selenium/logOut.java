package com.edureka.project.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logOut {
	
	WebDriver driver;
	
	@FindBy(css="#footauto > app-root > app-mycourse-main > section > app-header > header > nav > div > div.pull-right.url_list > ul > li.dropdown.user_drop > div > button > span")
	private WebElement MynameLink;
	
	@FindBy(linkText="Log Out")
	private WebElement logout;
	
	public logOut(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void logoutEdureka() {
		MynameLink.click();
		logout.click();
	}

}
