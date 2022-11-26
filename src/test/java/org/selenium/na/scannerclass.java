package org.selenium.na;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scannerclass 

   {

	public static void main(String[] args)
	
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter browser name");
		String bn=sc.nextLine();
		sc.close();
		
		RemoteWebDriver driver = null;
		
		if (bn.equals("chrome"))
			
		{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		}
		
		else if (bn.equals("edge"))
			
		{	
		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();		
		
		}
		
		driver.get("http://www.gmail.com");
		

	}

}
