package org.BDDoctnovtesting;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features=".\\Features\\parabank1.feature",glue="org.BDDoctnovtesting",
dryRun=false,
plugin = {"json:reports/jsonreport.json","html:reports/cucumber-reports.html"}
)
public class Runner1_for_Parabankfeature extends AbstractTestNGCucumberTests
{

}
