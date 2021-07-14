package com.selenium.demo;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementcommands {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://opensource-demo.orangehrmlive.com/");

		driver.manage().window().maximize();
		
		//enter username and password
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
	    
		
		
		//clear the username  and password
		
		/*Thread.sleep(5000);
		driver.findElement(By.id("txtUsername")).clear();
		Thread.sleep(5000);
		driver.findElement(By.name("txtPassword")).clear();
		driver.close();*/
		
		//submit
		/*driver.findElement(By.xpath("//input[@id='btnlogin']")).submit();
		
		//gettext()
		String gettext = driver.findElement(By.linkText("forget your password")).getText();
		System.out.println("the text is "+gettext);
		
		//getlocation()
		
		WebElement element=driver.findElement(By.id("txtUsername"));
		org.openqa.selenium.Point point=element.getLocation();
		System.out.println("X cordinates "+point.x);
		System.out.println("Y cordinates "+point.y);
		
		//getsize()
		
		WebElement element1=driver.findElement(By.id("txtUsername"));
		Dimension dim=element1.getSize();
		System.out.println("height is "+dim.height);
		System.out.println("width is "+dim.width);*/
		}
	}
