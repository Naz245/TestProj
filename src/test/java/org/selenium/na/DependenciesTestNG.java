package org.selenium.na;

import java.lang.reflect.Method;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DependenciesTestNG 
{
	@DataProvider(name="mydata")
	public Object[] [] method1(Method m)
	{
		if(m.getName().equalsIgnoreCase("Method1"))
		{
			Object [][] x = new Object[] []	
					
					{
				          {12,34,45},
				          {21,43,65},
				          {24,23,-65}
					};
					return(x);
		}
		else if(m.getName().equalsIgnoreCase("Method2"))
		{
			Object[] [] x = new Object[] []
					
		         {
				{"abdul","kalam","APJ"},
				{"dhoni", "MS", "India"},
				{"kholi","Anushka","Baby"},
				{"Rahul","Gandhi","India"}
					
		         };
		         return(x);
		}
		else
		{
			return(null);
		}
	}
	
	
	@Test(priority=1, dataProvider="mydata")
	public void method1(int x, int y , int z) 
	{
		int w = x+y+z;
		System.out.println(w);
	}
	
	@Test(priority=2, dataProvider="mydata")
	public void method2(String x, String y,String z)
	{
		String w = x +"-"+y+"-"+z;
		System.out.println(w);
	}
}