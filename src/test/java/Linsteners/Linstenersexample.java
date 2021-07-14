package Linsteners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Linsteners.Customlisteners.class)
public class Linstenersexample {

	@Test(priority=1)
	void test1()
	{
		System.out.println("This is test1");
		Assert.assertEquals("A" ,"A");
	}
	
	@Test(priority=2)
	void test2()
	{
		System.out.println("this is test2");
		Assert.assertEquals("A", "B");
		
	}
	
	@Test(priority=3)
	void test3()
	{
		System.out.println("this is the test3");
		throw new SkipException("this is skip exception..");
	}
	
	

}



