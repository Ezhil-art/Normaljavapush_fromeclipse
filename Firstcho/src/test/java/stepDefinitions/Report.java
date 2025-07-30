package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature/backg.feature",glue = {"stepDefinitions"},
dryRun=false,plugin= {"pretty","html:target/cucumber.html"})
public class Report {

}
