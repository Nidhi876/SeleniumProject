package com.edureka.project.Selenium;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utils.ReadExcel;

public class validateCourse extends BaseTest {
	

	@Test
	public void validatecourse() throws InterruptedException, IOException {
		
		String [][] data = ReadExcel.getData("TestData.xlsx", "Sheet1");
		
		Thread.sleep(2000);
		for(int i=1; i<2; i++) {
		
		String username = data[i][1];
		String password = data[i][2];
		loginpage.loginEdureka(username, password);
		
		Thread.sleep(2000);
		String expectedMessage ="Selenium Certification Training";
		String actualMessage = mycoursesNavigate.myCourses().getText();
		Assert.assertEquals(actualMessage, expectedMessage);
		System.out.println("The user is enrolled for the Selenium Course");
		
		logout.logoutEdureka();
		
	}
	}	
		
}		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	



