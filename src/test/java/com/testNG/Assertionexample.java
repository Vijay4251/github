package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertionexample {
	WebDriver driver;

	@BeforeClass  // this assertion is executes before the class is execution
	void setup()  // here setup is the method name 
	{
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@Test(priority = 1)
	void loginTest()  // here logintest is the method name
	{
	WebElement logo=driver.findElement(By.xpath("//div[@id='divLogo']//img"));
	Assert.assertTrue(logo.isDisplayed());  // here Assert is the main class and assertTrue is the method of assert class
	//Assert.assertFalse(logo.isDisplayed());
	}

	@Test(priority = 2)
	void homePageTitle()  //here homepagetitle is the method name
	{
	String title=driver.getTitle();   // here title is the actual result
	Assert.assertEquals(title, "OrangeHRM"); //here orangehrm is the exception result and title is the actual result
	}

	@AfterClass  /// this assertion is exicute after the class execution
	void tearDown()// teardown is the method name
	{
	driver.quit();
	}

}
