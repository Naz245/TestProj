package org.selenium.na;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchFrames {

	public static void main(String[] args) throws Exception
	
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		driver.switchTo().frame(1);
		WebElement e = driver.findElement(By.id("animals"));
		Select s = new Select(e);
		Thread.sleep(3000);
		s.selectByIndex(3);
		System.out.println("Avatar Selected");
		driver.switchTo().defaultContent();
		WebElement e1 = driver.findElement(By.xpath("//*[text()='Not a Friendly Topic']"));
		//String x = e1.getText();
		//System.out.println(x);
		//driver.close();
		System.out.println(e1.getText());
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		driver.findElement(By.id("a")).click();
		System.out.println("Checbox Selected");
		Thread.sleep(2000);
		driver.close();
		

	}

}
