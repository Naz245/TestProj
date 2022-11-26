package org.selenium.na;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class isenabled {

	public static void main(String[] args) throws InterruptedException 
	
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		boolean logo = driver.findElement(By.xpath("//*[@id=email]")).isEnabled();
		Thread.sleep(4000);
		
		if (logo == true)
			
		{
			System.out.println("Text box is Enabled");
			
		}
		
		else
			
		{
			System.out.println("Text box is not Enabled");
		}
			
	}

}
