package org.BDDoctnovtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepdefinition_Runner1_for_Parabankfeature
{
	public WebDriver driver;
	@Given("user is navigated to parabank url")
	public void user_is_navigated_to_parabank_url()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		System.out.println("Parabank homepage is launched Successfully");
	}
	
	@When("username and password are valid")
	public void username_password_are_valid()
	{
		driver.findElement(By.name("username")).sendKeys("naz123");
		driver.findElement(By.name("password")).sendKeys("123456");
		System.out.println("valid username and password entered");
	}
	
	@And("click on login button")
	public void click_on_login_button()
	{
		driver.findElement(By.className("button")).click();
		System.out.println("click on log in button");
    }
	
	@Then("diplay the user homepage")
	public void display_user_homepage()
	{
	 boolean status = driver.findElement(By.partialLinkText("New Account")).isDisplayed();
	 if(status)
	 {
		 System.out.println("user homepage is displayed successfully");
	 }
	}
}
