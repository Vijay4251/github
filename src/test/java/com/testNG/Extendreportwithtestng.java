package com.testNG;

import java.io.IOException;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Extendreportwithtestng {
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;
	
	FirefoxDriver driver;
	
	@BeforeSuite
	public void setUp()
	{
		// initialize the HtmlReporter
		htmlReporter = new ExtentHtmlReporter("extent.html");
	
		
		// initialize ExtentReports and attach the HtmlReporter
		extent = new ExtentReports();
	
		// attach only HtmlReporter
		extent.attachReporter(htmlReporter);
	}
	
	@BeforeTest
	public void setUpTest()
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	
	@Test
	public void test1() throws IOException
	{
		test = extent.createTest("Test");
		
		driver.get("https://www.google.com");
		
		test.pass("Navigated to google.com");
		
		
		// log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
         test.info("This step shows usage of info(details)");
        
        // log with snapshot
        //test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("failed.png").build());
        
       // log with snapshot
      // test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("passed.png").build());
		test.pass("details" , MediaEntityBuilder.createScreenCaptureFromPath("passed.png").build());
		
		test.addScreenCaptureFromPath("screenshot.png");		
		
	}
	
	@Test
	public void test2() throws IOException
	{
		test = extent.createTest("Test");
		
		driver.get("https://www.google.com");
		
		test.pass("Navigated to google.com");
		
		
		// log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
         
       // log with snapshot
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("passed.png").build());
		
	   	//test.addScreenCaptureFromPath("screenshot.png");		
		
	}
	
	@AfterTest
	public void tearDownTest()
	{
	
		//driver.quit();
		System.out.println("Test Completed Successfully");
	}
	
	@AfterSuite
	public void tearDown()
	{
		 // calling flush writes everything to the log file
        extent.flush();
	}

}
