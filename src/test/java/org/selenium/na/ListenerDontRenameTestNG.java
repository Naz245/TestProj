package org.selenium.na;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.Reporter;

public class ListenerDontRenameTestNG implements ITestListener
{
	SimpleDateFormat sf;
	Date dt;
	
	public void onFinish(ITestContext Result)
	{
		Reporter.log("Thank You, Bye for now");
	}
	public void onStart(ITestContext Result)
	{
		System.out.println("Welcome, please go to reports");
	}
	public void onTestFailedButWithinSuccessPercentage(ITestContext Result)
	{
		System.out.println("Test passed witin expected success percentage");
	}
	public void onTestFailure(ITestContext Result)
	{
		sf=new SimpleDateFormat("dd-MMM-yyyy-hh-mm-ss");
		dt=new Date();
		Reporter.log(Result.getName()+" Test Failed on "+sf.format(dt));
	}
	public void onTestSkipped(ITestContext Result)
	{
		sf=new SimpleDateFormat("dd-MMM-yyyy-hh-mm-ss");
		dt=new Date();
		Reporter.log("The name of the testcase Skipped is :"+Result.getName()+" at "+sf.format(dt));
	}
     public void onTestStart(ITestContext Result)
     {
        sf=new SimpleDateFormat("dd-MMM-yyyy-hh-mm-ss");
 		dt=new Date(); 
 		Reporter.log(Result.getName()+" Test Started on "+sf.format(dt));
     }
     public void onTestSuccess(ITestContext Result)
     {
    	sf=new SimpleDateFormat("dd-MMM-yyyy-hh-mm-ss");
  		dt=new Date(); 
  		Reporter.log("The name of the testcase Skipped is :"+Result.getName()); 
     }
}
