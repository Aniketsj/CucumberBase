package test.Runners;

import cucumber.api.CucumberOptions;

/**
 * CucumberOptions -> tags statement has been commented as it can be provided
 * through Maven execution command.
 */
@CucumberOptions(features = { "src/test/resources/features/" }, glue = { "test.Runners",
		"test.stepDefinition" }, tags = {
				"RegisterUser" }, plugin = { "pretty", "json:target/cucumber.json", "html:target/cucumber-reports" }

)

public class TestRunner {

}
