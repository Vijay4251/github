package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SE_Testcase001 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();
		
		Thread.sleep(5000);
		
		driver.get("http://opensource-demo.orangehrmlive.com");
		
		driver.manage().window().maximize();
		
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");  //enter valid username
		
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");// enter valid password
		
		driver.findElement(By.name("submit")).click();//click submit button
		
		//to verify the URL
		String actual_url=driver.getCurrentUrl();
		System.out.println(actual_url);
		String expected_url="http://opensource-demo.orangehrmlive.com/index.php/dashboard";
		if(actual_url.equals(expected_url))
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");
		}
		
		//7 verify title
		
		String actual_title=driver.getTitle();
		System.out.println();
		String expected_title="orangeHRM";
		
		if(actual_title.equals(expected_title))
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");
		}
		
		
		driver.close();
	}
}
