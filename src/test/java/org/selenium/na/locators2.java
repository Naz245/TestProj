package org.selenium.na;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators2 

{

	public static void main(String[] args) throws Throwable 
	
	{
	  
	  WebDriverManager.chromedriver().setup();
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("https://adactinhotelapp.com/");
	  driver.findElement(By.id("username")).sendKeys("ashi1234@gmail.com");
	  Thread.sleep(2000);
	  driver.findElement(By.name("password")).sendKeys("qwdr34rf");
	  Thread.sleep(4000);
	  driver.findElement(By.name("login")).click();
	  Thread.sleep(2000);
	  //driver.findElement(By.partialLinkText("Forgot")).click();
	  driver.findElement(By.linkText("Forgot Password?")).click();
	  
	  }

}