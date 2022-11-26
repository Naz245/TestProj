package org.selenium.na;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript {

	public static void main(String[] args) throws InterruptedException 
	
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		Thread.sleep(3000);
		//driver.executeScript("document.body.style.zoom='300%';");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 400)");
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,-400)");
		

	}

}
