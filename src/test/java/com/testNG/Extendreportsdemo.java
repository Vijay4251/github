package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Extendreportsdemo {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
		
		// create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		// creates a toggle for the given test, adds all log events under it   
		ExtentTest test1=extent.createTest("Google Search Test One", "this is a test to validate google search functionality");
		
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		
		test1.log(Status.INFO, "Starting Test Case");
		
		test1.pass("Navigated to google.com");
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Automation");
		test1.pass("Entered text in Searchbox");
		
		driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).click();
		
		test1.pass("Pressed keyboard enter key");
		

		driver.quit();
		
		test1.pass("Closed the browser");
		
		test1.info("Test Completed");
		
		// calling flush writes everything to the log file
		extent.flush();
		

	}

	
	

	}


