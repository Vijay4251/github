package com.selenium.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlebrowserWindows {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.get("https://facebook.com/");

		
		
		//getWindowHandle()

		String windowID=driver.getWindowHandle(); // return ID of the single browser window
		System.out.println(windowID); //21
		//using iterator
		//driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Create a Page']")).click();
		Set<String> windowIDs=driver.getWindowHandles(); // return ID's of multiple browser windows
		
		/*Iterator<String> it=windowIDs.iterator();

		String parentWindowID=it.next();
		String childWindowID=it.next();

		System.out.println("Parent window ID: "+parentWindowID);
		System.out.println("Child window ID: "+childWindowID);*/

		//Thread.sleep(4000);

		//driver.quit();
		//Second Method - using List/ArrayList

		/*List<String> windowIDsList=new ArrayList(windowIDs); // converting Set --> List

		String parentWindowID1=windowIDsList.get(0);
		String childWindowID1=windowIDsList.get(1);

		System.out.println("Parent window ID: "+parentWindowID1);
		System.out.println("Child window ID: "+childWindowID1);
		

        driver.switchTo().window(parentWindowID1);
        System.out.println("Parent window title: "+driver.getTitle());

        driver.switchTo().window(childWindowID1);
        System.out.println("Child window title: "+driver.getTitle());*/
		Thread.sleep(4000);
		//driver.close();
		//driver.quit();
	}
}
