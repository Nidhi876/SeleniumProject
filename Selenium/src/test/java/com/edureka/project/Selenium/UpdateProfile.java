package com.edureka.project.Selenium;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utils.ReadExcel;

public class UpdateProfile extends BaseTest {
		
	@Test
	public void searchSelenium() throws InterruptedException, IOException {
		loginpage=new LoginPage(driver);
		
        String [][] data = ReadExcel.getData("TestData.xlsx", "Sheet1");
		
		Thread.sleep(2000);
		for(int i=1; i<2; i++) {
		
		String username = data[i][1];
		String password = data[i][2];
		loginpage.loginEdureka(username, password);
		
		
		Thread.sleep(2000);
		mycoursesNavigate=new MyCoursesNavigate(driver);
        mycoursesNavigate.clickProfile();;
        editProfile= new EditProfile(driver);
        editProfile.clickpersonalDetails();
        editPersonal=new EditPersonalDetails(driver);
        editPersonal.enterPersonaldetails("Nidhi", "97392814", "Manual Tester");
        editprofessional = new editProfessionalDetails(driver);
        Thread.sleep(2000);
        editprofessional.enterProfessionalDetails("TCS", "Mainframe Testing");
        career=new careerInterests(driver);
        Thread.sleep(5000);
        career.enterCareerInterests("Oslo");
        Thread.sleep(2000);
        
        
        
        }
	
	} 
}

    