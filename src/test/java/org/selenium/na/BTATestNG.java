package org.selenium.na;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BTATestNG 
{
	public String baseUrl="http://amazon.com";
	public WebDriver driver;
	
	@BeforeTest
	public void setBaseURL()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.getTitle();
		driver.get(baseUrl);
	}
	
	@Test
	public void verifyHomepageTitle()
	{
		String expectedTitle="Amazon.com:Spend less.Smile more";
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
