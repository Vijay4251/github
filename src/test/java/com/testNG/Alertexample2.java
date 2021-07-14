package com.testNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertexample2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("alertbutton")).click();
		driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-1']")).click();
		
		Alert simplealert=driver.switchTo().alert();
		simplealert.accept();
	}
}
