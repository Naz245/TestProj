package org.selenium.na;

import org.testng.annotations.Test;

public class VehicleLoanTestNG 
{
	@Test
	public void vehicleloanabove5k()
	{
		System.out.println("Hello, please pay the vehicle loan on time, interest is 10% as you have taken cash loan above 5k ");
		
	}
	
   @Test
	public void vehicleloanabove10k()
	{
		System.out.println("Hello, please pay the vehicle loan on time, interest is 5% as you have taken cash loan above 10k");
	}

}
