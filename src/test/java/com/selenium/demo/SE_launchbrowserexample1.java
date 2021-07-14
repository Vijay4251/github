package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SE_launchbrowserexample1 {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(5000);
		
		driver.get("https://www.flipkart.com/mobile-phones-store");//navigates to the application URL
		driver.manage().window().maximize();  //maximize the current browser window
		Thread.sleep(5000);
		
	
		driver.findElement(By.id("search_query_top")).sendKeys("Top offers");
		
		driver.findElement(By.name("submit_search")).click();
		
		driver.findElement(By.linkText("printed men round neck t shirts")).click();
		driver.close();

	}
}


