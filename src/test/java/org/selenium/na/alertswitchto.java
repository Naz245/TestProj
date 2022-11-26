package org.selenium.na;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertswitchto {

	public static void main(String[] args) throws InterruptedException 
	
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(4000);
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		
		System.out.println("Successfully clicked OK button");

	}

}
