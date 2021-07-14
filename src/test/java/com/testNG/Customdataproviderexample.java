package com.testNG;

import org.testng.annotations.DataProvider;

public class Customdataproviderexample {
	@DataProvider(name="LoginDataProvider")
	//public Object[][] getData()
	public Object[][] getdata()
	{
		Object[][] data={ {"abc@gmail.com","abc"},{"xyz","mno"} , {"asd@gmail.com","asd"}};
		return getdata();
	}
}
