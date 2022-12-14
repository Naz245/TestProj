package org.BDDoctnovtesting;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdef1Googlesearch 
{
	public Shared sh;
	public Stepdef1Googlesearch(Shared x)
	{
		sh = x;
	}
	@Given("open {string} browser")
	public void method1(String bn)
	{
		if(bn.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			sh.driver=new ChromeDriver();
		}
		else if(bn.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			sh.driver=new FirefoxDriver();
		}
		else
		{
			WebDriverManager.edgedriver().setup();
			sh.driver=new EdgeDriver();
		}
		sh.obj=new Googlepage_pageclass(sh.driver);
		}
	@When ("i launch {srting} site")
	public void method2(String url) throws Exception
	{
		sh.driver.get(url);
		Thread.sleep(5000);
	}
	@Then("title should be {string}")
	public void method3(String expected) throws Exception
	{
		if(sh.obj.verifyTitle(sh.driver, expected))
		{
			sh.s.log("Test Passed");
		}
		else
		{
			sh.s.log("Test Failed");
		}
	}
	

}
