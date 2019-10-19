package com.edureka.project.Selenium;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utils.ReadExcel;

public class searchSeleniumCourse extends BaseTest {
	
	
	@Test
	public void searchSelenium() throws InterruptedException, IOException {
		
       String [][] data = ReadExcel.getData("TestData.xlsx", "Sheet1");
		
		Thread.sleep(2000);
		for(int i=1; i<2; i++) {
		
		String username = data[i][1];
		String password = data[i][2];
		loginpage.loginEdureka(username, password);
		Thread.sleep(2000);
		
		mycoursesNavigate.clickCourse();
		Thread.sleep(5000);
		allcourses.wishList();
		allcourses.checkWishlist();
		
        }
	
   
	}	
	


}
