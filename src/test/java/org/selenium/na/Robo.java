package org.selenium.na;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import org.openqa.selenium.chrome.ChromeDriver;
import com.sun.glass.events.KeyEvent;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Robo 
{

	public static void main(String[] args) throws InterruptedException, Exception 
	
	{
	   WebDriverManager.chromedriver().setup();
	   ChromeDriver driver=new ChromeDriver();
	   driver.get("https://the-internet.herokuapp.com/basic_auth");
	   
	   Thread.sleep(2000);
	   
	   StringSelection x = new StringSelection("admin"); //ADMIN FIELD
	   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x, null);
	   
	   Robot r=new Robot();
	   r.keyPress(KeyEvent.VK_CONTROL);
	   r.keyPress(KeyEvent.VK_V);
	   r.keyRelease(KeyEvent.VK_V);
	   r.keyRelease(KeyEvent.VK_CONTROL);
	   Thread.sleep(2000);
	   
	   r.keyPress(KeyEvent.VK_TAB);  //TAB FIELD
	   r.keyRelease(KeyEvent.VK_TAB);
	   Thread.sleep(2000);
	   
	   
	   StringSelection y = new StringSelection("admin");  //PASSWORD FIELD
	   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(y, null);
	   
	   r.keyPress(KeyEvent.VK_CONTROL);
	   r.keyPress(KeyEvent.VK_V);
	   r.keyRelease(KeyEvent.VK_V);
	   r.keyRelease(KeyEvent.VK_CONTROL);
	   Thread.sleep(2000);
	   
	   r.keyPress(KeyEvent.VK_ENTER);   //ENTER FIELD
	   r.keyRelease(KeyEvent.VK_ENTER);
	   Thread.sleep(4000);
	   
	   driver.close();
	   

	}

	}

