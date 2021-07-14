package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SE_Navigation_tc001 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.amazon.com/");
		System.out.println("opening the amazon page through driver.get");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.navigate().to("http://www.ebay.com/");
		System.out.println("navigated to ebay through driver.navigate.to()");
		
		//enter some values in the text boxes
		
		driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).sendKeys("T-shirt for man");
		driver.navigate().refresh(); //refresh the page
		driver.navigate().back(); //back the page
		driver.navigate().forward();//forward page
		
		driver.close();
		}
}
