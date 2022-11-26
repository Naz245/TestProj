package org.selenium.na;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonSelect {

	public static void main(String[] args) throws Exception 
	
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		WebElement e = driver.findElement(By.name("url"));
		Select s = new Select(e);
		s.selectByIndex(4);
		Thread.sleep(3000);
		s.selectByVisibleText("Beauty");
		Thread.sleep(3000);
		s.selectByValue("search-alias=gift-cards");
		driver.close();

	}

}
