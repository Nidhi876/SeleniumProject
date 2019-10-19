package com.edureka.project.Selenium;



import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	static WebDriver driver;
	private static ITestContext context;
	LoginPage loginpage;
	MyCoursesNavigate mycoursesNavigate;
	EditProfile editProfile;
	editProfessionalDetails editprofessional;
	EditPersonalDetails editPersonal;
	careerInterests career;
	logOut logout;
	allCoursesClass allcourses;
	BlogPage blogPage;
	seleniumBlog seleniumblog;
	
	
	
	public static ITestContext setContext(ITestContext iTestContext, WebDriver driver) {
		iTestContext.setAttribute("driver", driver);
		return iTestContext;
	}
	
	@BeforeClass
	    public void openBrowser(ITestContext iTestContext) {

			// 1) Open the browser
			System.setProperty("Webdriver.chrome.driver","/Users/anandvineet/Desktop/Selenium/Selenium/Selenium/chromedriver");
	         driver = new ChromeDriver();
	        context = setContext(iTestContext, driver);
	         
	         // 2) MAximize the browser
	         driver.manage().window().maximize();

	        // 3) Navigate to the application
	         driver.get("https://www.edureka.co/");
	         
	         loginpage = new LoginPage(driver);
	         mycoursesNavigate = new MyCoursesNavigate(driver);
	         logout = new logOut(driver);
	         blogPage = new BlogPage(driver);
	         seleniumblog = new seleniumBlog(driver);
	         allcourses=new allCoursesClass(driver);
	         

		}
	
	
	@AfterClass
	 public void closeBrowser() {
		 driver.close();
		 
	 	 
	 }
	
	@AfterSuite()

	public void tearDown() {

		sendReportByGMail("choudhary.nidhi876@gmail.com","","Nidhi.nidi1992@gmail.com","Test Report", "");

	}
	
	private static void sendReportByGMail(String from, String pass, String to, String subject, String body) {

		Properties props = System.getProperties();

		String host = "smtp.gmail.com";

		props.put("mail.smtp.starttls.enable", "true");

		props.put("mail.smtp.host", host);

		props.put("mail.smtp.user", from);

		props.put("mail.smtp.password", pass);

		props.put("mail.smtp.port", "587");

		props.put("mail.smtp.auth", "true");

		props.put("mail.smtp.ssl.trust", "smtp.gmail.com");


		Session session = Session.getDefaultInstance(props);

		MimeMessage message = new MimeMessage(session);


		try {

			// Set from address

			message.setFrom(new InternetAddress(from));

			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

			// Set subject

			message.setSubject(subject);

			message.setText(body);


			BodyPart objMessageBodyPart = new MimeBodyPart();


			objMessageBodyPart.setText("Please Find The Attached Report File!");


			Multipart multipart = new MimeMultipart();


			multipart.addBodyPart(objMessageBodyPart);


			objMessageBodyPart = new MimeBodyPart();


			// Set path to the pdf report file

			String filename = System.getProperty("user.dir") + "\\TestReport\\Test-Automation-Report.html";

			// Create data source to attach the file in mail

			DataSource source = new FileDataSource(filename);


			objMessageBodyPart.setDataHandler(new DataHandler(source));


			objMessageBodyPart.setFileName(filename);


			multipart.addBodyPart(objMessageBodyPart);


			message.setContent(multipart);

			Transport transport = session.getTransport("smtp");

			transport.connect(host, from, pass);

			transport.sendMessage(message, message.getAllRecipients());

			transport.close();

		} catch (AddressException ae) {

			ae.printStackTrace();

		} catch (MessagingException me) {

			me.printStackTrace();

		}

		catch(Exception e) {

			e.printStackTrace();

		}


	}


}


	
	


