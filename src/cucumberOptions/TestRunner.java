package cucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/VivekVShetty/IdeaProjects/ApiAutomation/src/features"
        ,glue = "stepDefinations")
public class TestRunner { }
