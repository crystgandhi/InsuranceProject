package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { ".//Features/registration.feature",
		                      ".//Features/requestQuotation.feature"}, 
                   glue = {"stepDefinitions" }, 
                   dryRun = false, 
                   monochrome = true, 
                   plugin = { "pretty", "html:target/Cucumber", "json:target/Cucumber.json" }
                   )
                 //  tags="@regression"
public class TestRunner {

}
