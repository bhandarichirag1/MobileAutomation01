package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/java/Features", // path of the feature files
		glue = { "StepDefinitions" }, // path of step definition
		//plugin = {},
		monochrome = true, // display the console output in readable format
		dryRun = false, // check all the steps have the definitions and will not execute
		tags = ("@smoke or @regression")
)

public class TestRunner extends AbstractTestNGCucumberTests {
	
}
