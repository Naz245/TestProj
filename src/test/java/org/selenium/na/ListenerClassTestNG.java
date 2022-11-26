package org.selenium.na;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerDontRenameTestNG.class)
public class ListenerClassTestNG 
{
	@Test(priority=1)
	public void method1()
	{
	   Assert.assertTrue(true);
	}
    @Test(priority=2)
    public void method2()
    {
    	Assert.assertTrue(false);
    }
    @Test(dependsOnMethods= {"method2"}, priority=3)
    public void method3()
    {
    	
    }
}
