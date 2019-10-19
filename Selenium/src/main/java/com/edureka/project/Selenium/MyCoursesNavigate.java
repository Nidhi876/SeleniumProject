package com.edureka.project.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyCoursesNavigate {
	
	WebDriver driver;
	
	@FindBy(css="#footauto > app-root > app-mycourse-main > section > app-header > header > nav > div > div.pull-right.url_list > ul > li.dropdown.lms_link.hidden-xs > div > button")
	private WebElement Courses;
	
	@FindBy(linkText="My Classroom")
	private WebElement myClassroom ;
	
	@FindBy(css="#footauto > app-root > app-mycourse-main > section > section.container-fluid.my_course_main > div > div > div > div:nth-child(3) > div.col-lg-12.col-md-12.col-sm-12.col-xs-12.course-cour-box.coursemybox1 > div.coursetitle_cour > h2 > span.name")
	private WebElement Course1;
	
	@FindBy(css="#footauto > app-root > app-mycourse-main > section > app-header > header > nav > div > div.pull-right.url_list > ul > li.dropdown.forum_blog.hidden-xs > div > button")
	private WebElement community;
	
	@FindBy(linkText="Blog")
	private WebElement blogLink;
	

	@FindBy(linkText="All Courses")
	private WebElement allCourses;
	
	@FindBy(css="#footauto > app-root > app-mycourse-main > section > app-header > header > nav > div > div.pull-right.url_list > ul > li.dropdown.user_drop > div > button")
	private WebElement NidhiLink;
	
	@FindBy(linkText="My Profile")
	private WebElement myProfile;
	
	
	public MyCoursesNavigate(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement myCourses() {
		Courses.click();
		myClassroom.click();
		return Course1;
		
		}
	
	public void navigateBlog() {
		community.click();
		blogLink.click();
	}
	
	public void clickCourse() {
		Courses.click();
		allCourses.click();
		
	}
	
	public void clickProfile() {
		NidhiLink.click();
		myProfile.click();
	}
	

}
