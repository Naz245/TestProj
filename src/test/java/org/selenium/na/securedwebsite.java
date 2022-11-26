package org.selenium.na;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class securedwebsite 

{

	public static void main(String[] args) throws InterruptedException 
	
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://ebay.co.uk");
		
		String x=driver.getCurrentUrl();
		if(x.startsWith("https"))
		
		{
			System.out.println("Secured Site");
		}
		else
			
		{
			System.out.println("Unsecured Site");
		}
		 
		//Thread.sleep(5000);
		//driver.close();

	}

}
