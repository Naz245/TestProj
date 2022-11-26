package org.BDDoctnovtesting;

import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Shared 
{
	public RemoteWebDriver driver;
	public Googlepage_pageclass obj;
	public Scenario s;
	
	@Before
	public void method(Scenario x)
	{
		s=x;
	}

}
