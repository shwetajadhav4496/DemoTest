package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"stepdefinition"}
		,monochrome=true, tags="@smoke",
				plugin = {"html:target/cucumber.html","json:target/cucumber.json",
		"rerun:target/failed-scenarios.text"})
public class CucumberRunner {

}
