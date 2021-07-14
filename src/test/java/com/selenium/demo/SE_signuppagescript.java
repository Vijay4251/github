package com.selenium.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SE_signuppagescript {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		//login 
		driver.findElement(By.id("email")).sendKeys("Vijay Kumar");
		driver.findElement(By.name("pass")).sendKeys("vijay@1995");
		driver.findElement(By.xpath("//a[normalize-space()='Forgotten password?']")).click();
		driver.findElement(By.xpath("//input[@id='identify_email']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		//driver.findElement(By.xpath("//button[normalize-space()='Log In']")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		/*driver.quit();
		Thread.sleep(5000);
		
		if(driver!=null)
		{
			driver.quit();
		}*/
	
        
		
	}
	
	
	

}
