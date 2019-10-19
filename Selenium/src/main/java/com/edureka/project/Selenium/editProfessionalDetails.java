package com.edureka.project.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class editProfessionalDetails {
	
	WebDriver driver;
	
	@FindBy(name="companyName")
	private WebElement companyName;
	
	@FindBy(name="currentjob")
	private WebElement level;
	
	@FindBy(css="#onboarding > div > div.col-lg-12.col-md-12.col-sm-12.col-xs-12.main-body > div.col-lg-9.col-md-9.col-sm-12.col-xs-12.tab-data > div.tab-content > app-onboarding-professional-details > accordion > accordion-group > div > div.panel-collapse.collapse.in.show > div > form > div.form-group.form-div.col-md-6.current-job > select > option:nth-child(5)")
	private WebElement entryLevel;
	
	@FindBy(name="currentIndustry")
	private WebElement currentIndustry;
	
	@FindBy(css="#onboarding > div > div.col-lg-12.col-md-12.col-sm-12.col-xs-12.main-body > div.col-lg-9.col-md-9.col-sm-12.col-xs-12.tab-data > div.tab-content > app-onboarding-professional-details > accordion > accordion-group > div > div.panel-collapse.collapse.in.show > div > form > div.form-group.form-div.col-md-6.industry > select > option:nth-child(3)")
	private WebElement industryType;
	
	@FindBy(name="userSkill")
	private WebElement skills;
	
	@FindBy(css="#onboarding > div > div.col-lg-12.col-md-12.col-sm-12.col-xs-12.main-body > div.col-lg-9.col-md-9.col-sm-12.col-xs-12.tab-data > div.tab-content > app-onboarding-professional-details > accordion > accordion-group > div > div.panel-collapse.collapse.in.show > div > form > button.btn.pull-right.onboarding-primary-button")
	private WebElement nextButton;
	
	public editProfessionalDetails(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterProfessionalDetails(String company,String userskill) throws InterruptedException {
		companyName.clear();
		companyName.sendKeys(company);
		level.click();
		entryLevel.click();
		currentIndustry.click();
		industryType.click();
		skills.clear();
		skills.sendKeys(userskill);
		Thread.sleep(8000);
		nextButton.click();
	}
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


