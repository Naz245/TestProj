package org.selenium.na;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cssLocator {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input.inputtext")).sendKeys("test123@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input.inputtext[id=pass]")).sendKeys("sdkfgh");
		//driver.findElement(By.cssSelector("input.inputtext[name=----]");

	}

}
