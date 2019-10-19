package com.edureka.project.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class careerInterests {
	
	WebDriver driver;
	
	@FindBy(name="interestedJob")
	private WebElement interestedJob;
	
	@FindBy(css="#onboarding > div > div.col-lg-12.col-md-12.col-sm-12.col-xs-12.main-body > div.col-lg-9.col-md-9.col-sm-12.col-xs-12.tab-data > div.tab-content > app-onboarding-career-interests > accordion > accordion-group > div > div.panel-collapse.collapse.in.show > div > form > div.form-group.form-div.col-md-6.job-interested > select > option:nth-child(7)")
	private WebElement softwareTestingJob;
	
	@FindBy(name="elementType")
	private WebElement jobType;
	
	@FindBy(css="#onboarding > div > div.col-lg-12.col-md-12.col-sm-12.col-xs-12.main-body > div.col-lg-9.col-md-9.col-sm-12.col-xs-12.tab-data > div.tab-content > app-onboarding-career-interests > accordion > accordion-group > div > div.panel-collapse.collapse.in.show > div > form > div.form-group.form-div.col-md-6.employment-type > select > option:nth-child(2)")
	private WebElement permanent;
	
	@FindBy(name="currentCity")
	private WebElement currentcity;
	
	
	@FindBy(name="lastDrawnSalaryUS")
	private WebElement salary;
	
	@FindBy(css="#onboarding > div > div.col-lg-12.col-md-12.col-sm-12.col-xs-12.main-body > div.col-lg-9.col-md-9.col-sm-12.col-xs-12.tab-data > div.tab-content > app-onboarding-career-interests > accordion > accordion-group > div > div.panel-collapse.collapse.in.show > div > form > div.form-group.form-div.col-md-6.ctc-range > select > option:nth-child(2)")
	private  WebElement salaryRange;
	
	@FindBy(css="#onboarding > div > div.col-lg-12.col-md-12.col-sm-12.col-xs-12.main-body > div.col-lg-9.col-md-9.col-sm-12.col-xs-12.tab-data > div.tab-content > app-onboarding-career-interests > accordion > accordion-group > div > div.panel-collapse.collapse.in.show > div > form > div.form-group.form-div.col-md-6.relocate > div > label:nth-child(2) > span")
	private WebElement rellocate;
	
	@FindBy(css="#onboarding > div > div.col-lg-12.col-md-12.col-sm-12.col-xs-12.main-body > div.col-lg-9.col-md-9.col-sm-12.col-xs-12.tab-data > div.tab-content > app-onboarding-career-interests > accordion > accordion-group > div > div.panel-collapse.collapse.in.show > div > form > button.btn.onboarding-primary-button.pull-right")
	WebElement nextButton2;
	
	@FindBy(css="#onboarding > div > div.col-lg-12.col-md-12.col-sm-12.col-xs-12.main-body > div.col-lg-9.col-md-9.col-sm-12.col-xs-12.tab-data > div.tab-content > app-onboarding-other-details > accordion > accordion-group > div > div.panel-collapse.collapse.in.show > div > form > div > button:nth-child(1)")
	WebElement saveButton;
	
	public careerInterests(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterCareerInterests(String city) throws InterruptedException {
		interestedJob.click();
		softwareTestingJob.click();
		jobType.click();
		permanent.click();
		currentcity.clear();
		currentcity.sendKeys(city);
		salary.click();
		salaryRange.click();
		rellocate.click();
		Thread.sleep(6000);
		nextButton2.click();
		Thread.sleep(6000);
		saveButton.click();
		
	}
	
}
