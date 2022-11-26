package org.selenium.na;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void main(String[] args) throws IOException //25oct-3
	
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://flipkart.com");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int size = links.size();
		System.out.println(size);
		//driver.close();
		
		
		for(int i=0;i<size; i++)
		{
			WebElement element = links.get(i);
			String url = element.getAttribute("href");
			URL link = new URL(url);
			HttpURLConnection ttpcon = (HttpURLConnection) link.openConnection();
			ttpcon.connect();
			int rescode = ttpcon.getResponseCode();
			
			if(rescode>400)
			{
				System.out.println(url +"-------is broken link");
			}
			else
			{
				System.out.println(url +"------is valid link");
			}
			
		}
			
			
	}

}
