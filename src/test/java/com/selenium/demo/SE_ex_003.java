package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SE_ex_003 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.amazon.in/signin/");
		driver.manage().window().maximize();
		//driver.findElement(By.id("//input[@id='ap_email']")).sendKeys("phone number");
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("ABC@BHB.com");
		//driver.findElement(By.name("txtpassword")).sendKeys("password");
		//driver.findElement(By.name("submit")).click();
		
		

	}

}
