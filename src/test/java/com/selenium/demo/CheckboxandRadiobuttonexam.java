package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxandRadiobuttonexam {

	public static void main(String[] args) throws InterruptedException {
		//1. Start Browser & Open UEL
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();

		//2. Identify Radio button with CSS | XPath
		// cssSelector syntax : tag[attributeName='value']
		//WebElement gender=driver.findElement(By.cssSelector("input[value='f']"));

		// Relative XPath Syntax //tag[@attributeName='value']
		//WebElement gender=driver.findElement(By.xpath("//input[@value='f']"));

		//3. Click on Radio Button
		//gender.click();
		//Thread.sleep(2000);
		//4. Check Radio button is Clicked or Not
		//System.out.println("Radio button selection is : "+gender.isSelected());
		

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		WebElement rem=driver.findElement(By.cssSelector("input[id='remember']"));

		System.out.println("Remember me is Selected before Click "+rem.isSelected());

		rem.click();

		System.out.println("Remember me is Selected after Click "+rem.isSelected());

		Thread.sleep(3000);

		////input[@id='remember']

		//driver.quit();

	}

}
