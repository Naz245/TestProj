package org.selenium.na;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getcurrenturl {

	public static class facebooklaunch {

		public static void main(String[] args) throws InterruptedException 
		
		{
		
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.ebay.co.uk");
			Thread.sleep(4000);
			driver.get("https://www.amazon.co.uk");
			Thread.sleep(4000);
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			//System.out.println(driver.getPageSource());
			//driver.close();
			driver.quit();

		}

	}
	
}
