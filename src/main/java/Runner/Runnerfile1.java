package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class Runnerfile1 
{
	@CucumberOptions(features = {"features/text.feature"},// path of feature
	        glue =     {"StepDefination"},//path of stepdefinations
	        		 plugin =    { "pretty","html:target/cucumber-reports.html","json:target/cucumber-reports.json",
	                		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
	    		     "rerun:target/failedrerun.txt"},
	        		 
//	        	 plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json"},
//	        				 "json:target/cucumber-reports/Cucumber.json",
	        				      				 
	       	tags="@smoke",
	        monochrome = true 
	)

	public class Runnerfile extends AbstractTestNGCucumberTests
	{
		
	}

}
