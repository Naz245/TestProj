package org.selenium.na;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class navigateDeletecookies {

	public static void main(String[] args) throws InterruptedException 
	
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.gmail.com/");
		Thread.sleep(3000);
        driver.navigate().to("https://facebook.com/");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        
        
	}

}
