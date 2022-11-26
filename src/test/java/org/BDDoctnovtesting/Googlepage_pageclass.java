package org.BDDoctnovtesting;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Googlepage_pageclass 
{
	@FindBy(name="q")
	private WebElement searchbox;
	public Googlepage_pageclass(RemoteWebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void fillSearchboxAndClickEnter(String data) throws Exception
	{
		searchbox.clear();
		Thread.sleep(3000);
		searchbox.sendKeys(data, Keys.ENTER);
		Thread.sleep(3000);
	}
	public boolean verifyTitle(RemoteWebDriver driver, String expected)
	{
		if(driver.getTitle().contains(expected))
		{
			return(true);
		}
		else
		{
			return(false);
		}
	}
}
