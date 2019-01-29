package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:/Mac Backup/Aadithya/Aaditya/workspace/CRMTestBDD/src/main/java/features", //path of feature file
		glue={"stepdefinition"}, // where exactly the step definition file is available -- should give the package name
		format= {"pretty","html:test-output","json:json_output/cucumber.json"}, // to generate different reports in console, as html, as json, as xml
		//dryRun = true ------ It wont run your tests. Instead it will check if all stepdefinitions are present
		monochrome = true,//display the console output in a proper readable format
		strict = true //it will fail the execution if any undefined or pending step definition are there
		//tags=
		
		
		)
public class TestRunner {

}
