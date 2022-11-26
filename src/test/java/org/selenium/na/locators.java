package org.selenium.na;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException 
	
	{
	  
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver(); 
		
		driver.get("https://github.com/login");
		Thread.sleep(4000);
		
		WebElement e=driver.findElement(By.id("login_field"));
		e.sendKeys("itzmee245@gmail.com");
		
		WebElement e1= driver.findElement(By.name("password"));
		e1.sendKeys("123456");
		Thread.sleep(4000);
		
		WebElement e2 = driver.findElement(By.partialLinkText("Create an"));
		e2.click();

	}

}
