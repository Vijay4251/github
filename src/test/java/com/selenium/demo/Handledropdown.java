package com.selenium.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handledropdown {

	public static void main(String[] args) throws InterruptedException {
	 
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		WebElement dropcountryele=driver.findElement(By.id("country"));
		Select dropcountry=new Select(dropcountryele);
		
		//dropcountry.selectByVisibleText("Armenia");
		//dropcountry.selectByValue("12");
		
		//selecting option from dropdown without using select class method
		
		List <WebElement>alloptions=(List) dropcountry.getOptions();
		
		for (WebElement option:alloptions)
		{
			if (option.getText().equals("Belgium"));
			{
				option.click();
				break;
			}
		}
	 Thread.sleep(5000);
	 driver.close();
		

	}

}
