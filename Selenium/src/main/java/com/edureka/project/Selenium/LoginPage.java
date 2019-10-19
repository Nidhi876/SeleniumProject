package com.edureka.project.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	
	@FindBy(linkText="Log In")
	private WebElement logIn;
	
	@FindBy(id="si_popup_email")
	private WebElement loginId;
	
	@FindBy(id="si_popup_passwd")
	private WebElement password;
	
	@FindBy(css="#new_sign_up_mode > div > div > div.modal-body > div.login_video_frm.login-vd-box.sigin-new-division > form > button")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void loginEdureka(String Username, String Password) throws InterruptedException {
		logIn.click();
		Thread.sleep(2000);
		loginId.sendKeys(Username);
		password.sendKeys(Password);
		loginButton.click();
	}
	
	
	

}
