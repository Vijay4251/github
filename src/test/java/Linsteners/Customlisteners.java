package Linsteners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Customlisteners implements  ITestListener {
	
	public void onTestStart(ITestResult result) {
		System.out.println("Starts Test execution....From CustomListeners"+result.getName());
		
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("Passes test....From CustomListeners"+result.getName());
		
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("Failed test...From CustomListeners"+result.getName());
		
	}
	public void onTestSkipped(ITestResult result) {

		System.out.println("Skipped test....From CustomListeners"+result.getName());
		
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
      
		System.out.println("test failure but within success percentage...."+result.getName());
		 
	}
	public void onStart(ITestContext context) 
	{
		System.out.println("Starts Test execution....From CustomListeners"+context.getName());
	
	}

	public void onFinish(ITestContext context)
	
	{
		System.out.println("Finish Test execution.......From CustomListeners"+context.getName());		
		
	}

}



