package org.selenium.na;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BeforeTestAfterTestTestNG 

{
	public String baseUrl="https://www.amazon.co.uk/";
	public WebDriver driver;
	
	@BeforeTest
	public void setBaseURL()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get(baseUrl);
	}
     @Test
     public void verifyHomepageTitle()
     {
    	 String expectedTitle="Amazon.co.uk: Low prices in Electronics, Books, Sports Equipments & more";
    	 System.out.println(driver.getTitle());
    	 String actualTitle=driver.getTitle();
    	 Assert.assertEquals(actualTitle, expectedTitle);
    	 
     }
     @AfterTest
     public void endSession()
     {
    	 driver.close();
     }
     
}
