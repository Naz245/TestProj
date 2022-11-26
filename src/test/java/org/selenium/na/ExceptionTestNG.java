package org.selenium.na;

import org.testng.annotations.Test;

public class ExceptionTestNG 
{
	@Test(expectedExceptions= {ArithmeticException.class})
	
	public void method()
	{
		int x = 10/0;
	}
	

}
