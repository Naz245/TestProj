package org.selenium.na;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodTestNG 
{
	@Test(priority=1)
	public void openbrowser()
	{
		System.out.println("launch browser");
		Assert.assertTrue(true);
		//Assert.fail();
	}
	@Test(priority=2, dependsOnMethods= {"openbrowser"})
	public void login()
	{
		System.out.println("do login");
		Assert.fail();
		//Assert.assertTrue(true);
		Assert.fail();
	}
	
}
