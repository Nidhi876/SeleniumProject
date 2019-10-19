package com.edureka.project.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class seleniumBlog {
	
	WebDriver driver;
	
	@FindBy(css="body > section.recently-added-blogs > div > div > div:nth-child(5) > div > article > h2 > a")
	private WebElement seleniumInterviewLink;
	
	public seleniumBlog(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void seleniumInterviewBlog() {
		seleniumInterviewLink.click();
	}
	
}
