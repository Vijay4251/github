package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testngifrmaeex {
	@Test
	public void frames() throws InterruptedException
	{
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();

	driver.get("http://uitestpractice.com/Students/Switchto");

	driver.switchTo().frame("iframe_a");
	 

	driver.findElement(By.id("name")).sendKeys("SeleniumTestNG");
	Thread.sleep(5000);
	driver.switchTo().defaultContent();
    
    
	driver.findElement(By.linkText("uitestpractice.com")).click();
	Thread.sleep(2000);
	//driver.quit();
	}

}
