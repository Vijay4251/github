package testselenium.testselenium;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;

public class SE_launchbrowser_using_drivemanager {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(5000);
		
		driver.get("http://automationpractice.com/index.php");//navigates to the application URL
		driver.manage().window().maximize();  //maximize the current browser window
		Thread.sleep(5000);
		
	
		driver.findElement(By.id("search_query_top")).sendKeys("T-shirts");
		
		driver.findElement(By.name("submit_search")).click();
		
		driver.findElement(By.linkText("printed chiffon dress")).click();
		driver.close();

	}

}
