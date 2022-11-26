package org.selenium.na;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class BeforeSuiteAfterSuiteTestNG1 
{
	@BeforeMethod
	public void beforeMetod() 
	{
		System.out.println("Before Method will execute before every @ Test method");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method will execute after every @ Test method");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class will always execute prior to @Before Method and @Test Method");
	}
	
    @AfterClass
    public void AfterClass()
	{
		System.out.println("After Class will always execute later to @After method and @Test method");
	}
    
	@BeforeTest
	public void BeforeTest()
    {
    	System.out.println("Before Test will always execute prior to Before class and Test Method");
    }
    
	@AfterTest
    public void AfterTest()
    {
    	System.out.println("After Test will always execute later to Test Method, After Method and After Class ");
    }
    
	@BeforeSuite
    public void BeforeSuite() 
    {
    	System.out.println("Before Suite will always execute prior to all annotations or tests in suite");
    }
	
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("After Suite will always ececute at last wen all the annotations or tests in te suite have run");
	}
    
	@Test(priority=1)
    public void testCase1()
    {
    	System.out.println("This is my First Test Case");
    }
    
	@Test(priority=2)
    public void testCase2() 
    {
    	System.out.println("This is my Second Test Case");
    }
    
    }
