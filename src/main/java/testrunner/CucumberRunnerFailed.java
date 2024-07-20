package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@target/failed-scenarios.text",glue= {"stepdefinition"}
		,monochrome=true,plugin = {"html:target/cucumber.html","json:target/cucumber.json"})
public class CucumberRunnerFailed {

}
