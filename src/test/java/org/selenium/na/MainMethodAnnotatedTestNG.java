package org.selenium.na;

import org.testng.annotations.Test;

public class MainMethodAnnotatedTestNG 

{
	public static void main(String[] args)
	{
		System.out.println("Hi, I am Main Method");
	}
	
	@Test
	public void metod()
	{
		System.out.println("Hi, I am Annotated Method");
	}

}
