package org.selenium.na;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTestNG 

{
	@Test(priority=3)
	public void method()
	{
		System.out.println("send a mail");
		//Assert.fail();
		Assert.assertTrue(true);
	}
	
	@Test(priority=2)
	public void login()
	{
		System.out.println("do login");
	}
	@Test(priority=1)
	public void launch()
	{
		System.out.println("launch browser");
	}
	
	

}
