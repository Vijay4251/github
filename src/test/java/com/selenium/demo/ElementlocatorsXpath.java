package com.selenium.demo;

import javax.naming.directory.SearchResult;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementlocatorsXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();// setup the chrome driver
		ChromeDriver driver=new ChromeDriver();//launch the chrome driver
		driver.get("https://www.ebay.com/");
		//driver.get("https://facebook.com/");// to open the website
		driver.manage().window().maximize(); // to maximize the window size
		
		Thread.sleep(2000);
		
		//absolute xpath
		//driver.findElement(By.xpath("/html[1]/body[1]/header[1]/table[1]/tbody[1]/tr[1]/td[3]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/input[1]")).sendKeys(arg0);
		
		// Relative xpath
		//driver.findElement(By.xpath("/html[1]/body[1]/header[1]/table[1]/tbody[1]/tr[1]/td[3]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/input[1]"))
		//driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("shirts for men");
		//driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
		
		//or operator
		driver.findElement(By.xpath("//input[@id='gh-ac' or @name= 'nkw']")).sendKeys("shirts for men");
		driver.findElement(By.xpath("//div[@id='widgets-placeholder']//div[1]")).click();
		
		//and operator
	    //driver.findElement(By.xpath("//input[@id='gh-ac' or @name= 'nkw']")).sendKeys("shirts for men");
		
		// using contains method
		//driver.findElement(By.xpath("//input[contains@name,'n']")).sendKeys("shirts for man");
		
		//starts with
		//driver.findElement(By.xpath("//input[starts-with(@id,'gh')]")).sendKeys("Tshirts for kids");
		
		//text()
		//driver.findElement((By.xpath("//h2[normalize-space()='The basics']")).click();
		
		//1 tag and id (CSS SELECTORS)
		//driver.findElement(By.cssSelector("email")).sendKeys("abcd@gmail.com");
		
		//2 tag and class (CSS SELECTORS)
		//driver.findElement(By.cssSelector(".inputtext")).sendKeys("xyz@gmail.com");
		
		//3 tag and atribute (CSS SELECTORS)
		//driver.findElement(By.cssSelector("[id=email]")).sendKeys("email@gmail.com");
		
		//4 tag ,class and atributes (CSS SELECTORS)
		//driver.findElement(By.cssSelector("input.inputtext[id=email]")).sendKeys("email145@gmail.com");
		
		Thread.sleep(5000);
		
		driver.close();
	}
}
