package org.selenium.na;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupsMethodsTestNG 
{
	@Test(priority=1, groups= {"smoketest","realtest"})
	public void openbrowser()
	{
		System.out.println("launch browser");
		Assert.assertTrue(false);
	}
	@Test(priority=2, dependsOnMethods= {"openbrowser"}, groups= {"smoketest","abcrealtest"})
	public void login()
	{
		System.out.println("do login");
	}
	@Test(groups={"sri"},dependsOnGroups= {"realtest"})
	public void sendmail()
	{
		System.out.println("send a mail");
	}
	
}
