package com.edureka.project.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class allCoursesClass {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id='allc_pgp_banner']/div[2]/div[2]/a[2]/div/h3/span[1]")
	private WebElement seleniumWishlist;
	
	@FindBy(linkText="Nidhi")
	private WebElement profileLink;
	
	@FindBy(linkText="My Wishlist")
	private WebElement myWishlist;
	
		
	public allCoursesClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void wishList() throws InterruptedException {
		Thread.sleep(2000);
		seleniumWishlist.click();
	}
	
	public void checkWishlist() {
		profileLink.click();
		myWishlist.click();
		
	}
	

}
