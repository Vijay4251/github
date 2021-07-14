package com.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TC2 {
	@Test
	void test3()
	{
	System.out.println("This is test3...");
	}
	@Test
	void test4()
	{
	System.out.println("This is test4...");
	}
	@BeforeMethod
	void beforeMethod()
	{
	System.out.println("This will execute before every Method");
	}
	@AfterMethod
	void afterMethod()
	{
	System.out.println("This will execute after every Method");
	}
	@BeforeClass
	public void beforeClass()
	{
	System.out.println("This will execute before the Class");
	}
	@AfterClass
	void afterClass()
	{
	System.out.println("This will execute after the Class");
	}
	@BeforeSuite
	void beforeSuite()
	{
	System.out.println("This will execute before Suite");
	}
	@AfterSuite
	void afterSuite()
	{
	System.out.println("This will execute after Suite");
	}

}
