package com.selenium.demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handlebrowserex1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");

		//getwindowhandle
	
	    String windowID=driver.getWindowHandle();
	    System.out.println(windowID);
	

	//using iterator

	driver.findElement(By.xpath("//a[normalize-space()='About']")).click();
	Set<String>windowIDs=driver.getWindowHandles();

	/*Iterator<String>it=windowids.iterator();
	String parentwindowid=it.next();
	String childwindowid=it.next();
	System.out.println("parent window id: "+parentwindowid);
	System.out.println("child window id: "+childwindowid);
	Thread.sleep(5000);*/
}
}
