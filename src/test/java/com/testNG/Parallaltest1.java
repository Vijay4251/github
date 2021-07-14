package com.testNG;


import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallaltest1 {
	
WebDriver driver;
	
	
	@Test(priority=1)
	void loginTest() throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();		
		driver=new FirefoxDriver();		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement logo=driver.findElement(By.xpath("//div[@id='divLogo']//img"));
		//WebElement logo=driver.findElement(By.xpath("//span[normalize-space()='( Username : Admin | Password : admin123 )']"));
		Assert.assertTrue(logo.isDisplayed());
		Thread.sleep(2000);
	}
	
	@Test(priority=2)
	void homePageTitle() throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();		
		driver=new FirefoxDriver();		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		Thread.sleep(2000);
	}
	
	@AfterMethod
	void tearDown()
	{
		//driver.quit();
	}

}
