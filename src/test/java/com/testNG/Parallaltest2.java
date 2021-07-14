package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallaltest2 {
	WebDriver driver;	
	
	@Test
	void LoginTest() throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(5000);	
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		Thread.sleep(2000);
	}
	@Test(dataProvider = "LoginDataProvider",dataProviderClass=Customdataproviderexample.class)
	void LoginTestDataProviderDemo(String email, String pwd) throws InterruptedException
	{
		/*WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();*/
		System.setProperty("webdriver.edge.driver", "F:\\Automation\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(5000);	
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		Thread.sleep(2000);
	}

	@Test(dataProvider = "LoginDataProvider",dataProviderClass = Customdataproviderexample.class)
	//@Test(dataProvider = "LoginDataProvider")
	public void loginTest(String email, String pwd)
	{
		System.out.println(email+"   "+pwd);
	}
	
	@AfterMethod
	void tearDown()
	{
		driver.quit();
	}

}
