package com.selenium.demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertexample {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		/*driver.get("http://uitestpractice.com/Students/Switchto");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='alert' or @xpath='1']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);*/

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//Alert window with OK button
		/*driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);*/
		

		
		//Alert window with OK & Cancel button
		/*driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept(); // Close alert by using OK button
		//driver.switchTo().alert().dismiss(); // Close alert by using Cancel button
		Thread.sleep(2000);
		driver.quit();*/

		//Alert window with input box, capture text from alert

		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Alert alertwindow=driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println("The message displayed on alert: "+alertwindow.getText());

		Thread.sleep(1000);
		alertwindow.sendKeys("Welcome");
		Thread.sleep(2000);

		alertwindow.accept();
		Thread.sleep(2000);

		driver.quit();

	}

}

