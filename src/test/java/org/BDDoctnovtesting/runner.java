package org.BDDoctnovtesting;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features=".\\Features\\googlesearch.feature",
                  glue="org.BDDoctnovtesting",
                  plugin= {"pretty","html:target/myresults"},
                		  monochrome=true)
public class runner extends AbstractTestNGCucumberTests
{
	

}
