package org.selenium.na;

import org.testng.annotations.Test;

public class InvocationcountTestNG 

{
	public int i=0;
	
	@Test(invocationCount=5, invocationTimeOut=25000)
	
	public void method() throws Exception
	
	{
		System.out.println(i);
		i++;
		Thread.sleep(4000);
		
	}
	
	
	
	

}
