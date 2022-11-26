package org.selenium.na;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExceptionHandling 
{

	public static void main(String[] args) throws Exception 
	
	{
	    WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("https://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx");
	    Thread.sleep(3000);
	    
	    try 
	    {
	    	WebElement e = driver.findElement(By.xpath("//button[text()='Accept and Close']"));
	    	Actions actions = new Actions(driver);
	    	actions.moveToElement(e).click().build().perform();
	    	Thread.sleep(2000);
	    }
	    
	    catch (Exception ex)
	    
	    {
	       System.out.println(ex.getMessage());

	    }
	    
	    System.out.println("Exception Successfully Handled");
	    driver.close();

}
	
}
