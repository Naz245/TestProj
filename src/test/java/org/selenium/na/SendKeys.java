package org.selenium.na;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SendKeys {

	public static void main(String[] args) throws Exception 
	
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.name("identifier"));
		e.sendKeys("Aisha","Afiyah","Naz","Riz");
		Thread.sleep(3000);
		e.clear();

	}

}
