package org.selenium.na;

import org.testng.annotations.Test;

public class TwotestsAnnotationsTestNG 

{
	@Test
	
	public void test1()
	
	{
		System.out.println("Test1 using testng");
	}

	@Test(description= "Hi test2",timeOut=2000)
	
	public void test2()
	
	{
		System.out.println("Test2 using testng");
	}
}
