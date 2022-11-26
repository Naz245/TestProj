package org.selenium.na;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchbrowserTestNG 

{  
	public RemoteWebDriver driver;
	
	@Test(priority=2)
	public void method2()
	
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://google.co.uk");
	}

	@Test(priority=1)
	public void method1()
	{
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://gmail.com");
	}
	
}
