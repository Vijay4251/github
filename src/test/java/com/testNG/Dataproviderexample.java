package com.testNG;

//import org.testng.annotations.Guice;
import org.testng.annotations.Test;
//@Guice
public class Dataproviderexample {
	
	@Test(dataProvider = "LoginDataProvider",dataProviderClass = Customdataproviderexample.class)
	//@Test(dataProvider = "LoginDataProvider")
	public void loginTest(String email, String pwd)
	{
		System.out.println(email+"   "+pwd);
	}
}
