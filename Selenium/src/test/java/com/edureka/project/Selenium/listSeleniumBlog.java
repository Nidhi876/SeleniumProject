package com.edureka.project.Selenium;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utils.ReadExcel;

public class listSeleniumBlog extends BaseTest {
	
	    
	@Test
	 public void listSeleniumBlog() throws InterruptedException, IOException {
		
    String [][] data = ReadExcel.getData("TestData.xlsx", "Sheet1");
		
		Thread.sleep(2000);
		for(int i=1; i<2; i++) {
		
		String username = data[i][1];
		String password = data[i][2];
		loginpage.loginEdureka(username, password);
		
		Thread.sleep(2000);
        mycoursesNavigate.navigateBlog();
        
        Thread.sleep(2000);
        blogPage.navigateSelenium();
        
        Thread.sleep(2000);
        seleniumblog.seleniumInterviewBlog();
        
    }
	
	}	 

}

