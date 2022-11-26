package org.selenium.na;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazonlaunchwithedge {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
			WebDriverManager.edgedriver().setup();
			EdgeDriver driver = new EdgeDriver();
			driver.get("https://www.amazon.com");
			Thread.sleep(8000);
			//driver.close();
			//driver.quit();
			driver.manage().window().maximize();
			Thread.sleep(4000);
			driver.close();
			
			System.out.println("Amazon is launched and closed successfully");

	}

}
