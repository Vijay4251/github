package com.selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Se_launchbrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\drivers1\\chromedriver.exe");


	WebDriver driver = new ChromeDriver();
	
	//driver.get("http://frontend.nopcommerce.com/");
	
	driver.get("http://frontend.flipcart.com/");
		
		/*System.setProperty("webdriver.gecko.driver", "F:\\drivers1\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(5000);
		
		driver.get("http://frontend.nopcommerce.com/");*/
	Thread.sleep(5000);
	
	driver.close();
	}
	

}
