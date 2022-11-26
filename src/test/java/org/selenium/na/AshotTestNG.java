package org.selenium.na;

import java.awt.Image;
import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class AshotTestNG 
{
	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("www.amazon.co.uk");
		Thread.sleep(5000);
		File f1=driver.getScreenshotAs(OutputType.FILE);
		File dest1=new File("pagescreenshot.png");
		FileHandler.copy(f1,dest1);
		Thread.sleep(5000);
		AShot as= new AShot();
		ShootingStrategy shs=ShootingStrategies.viewportPasting(1000);
		Screenshot ss=as.shootingStrategy(shs).takeScreenshot(driver);
		File dest=new File("fullpagescreenshotjune"+""+".png");
		Image.IO.write(ss.getImage(),"PNG",dest);
		Thread.sleep(5000);
		
	}
}
