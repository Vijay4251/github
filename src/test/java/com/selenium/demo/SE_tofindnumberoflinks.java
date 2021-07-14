package com.selenium.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SE_tofindnumberoflinks {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		//by tagname
		
		List <WebElement> link = (List) driver.findElements(By.tagName("a"));
	    System.out.println("number os links present inthe page: "+link.size());
	    for( WebElement l:link)
	    {
	    	System.out.println(l.getText());
	    }
	    
	    driver.close();
	    }
	}



