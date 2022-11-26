package org.selenium.na;

import java.util.Set;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertBox {


	public static void main(String[] args) throws InterruptedException
	
	{
	   WebDriverManager.chromedriver().setup();
	   ChromeDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().window().maximize();
	   String x = driver.getWindowHandle();
	   System.out.println(x);
	   Thread.sleep(3000);
	   
	   driver.switchTo().newWindow(WindowType.TAB);
	   Thread.sleep(4000);
	   
	   Set<String> s = driver.getWindowHandles();
	   System.out.println(s);
	   driver.switchTo().newWindow(WindowType.TAB);
	   Set<String> s1 = driver.getWindowHandles();
	   System.out.println(s1);
	   
	}

}
