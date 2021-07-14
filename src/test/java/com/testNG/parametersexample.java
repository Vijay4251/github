package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parametersexample {
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser","url"})
	void setup(String browser,String app)
	{
		if(browser.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Chrome"))
		{
			
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "F:\\Automation\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		

		driver.get(app);	
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	void loginTest()
	{
		WebElement logo=driver.findElement(By.xpath("//div[@id='divLogo']//img"));
		Assert.assertTrue(logo.isDisplayed());
		//Assert.assertFalse(logo.isDisplayed());
	}
	
	@Test(priority = 2)
	void homePageTitle()
	{
		String title=driver.getTitle();
		Assert.assertEquals(title, "OrangeHRM");
	}
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}

}
