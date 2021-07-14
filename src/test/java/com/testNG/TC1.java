package com.testNG;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC1 {

@Test
void test1()
{
System.out.println("This is test1...");
}
@Test
void test2()
{
System.out.println("This is test2...");
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

}