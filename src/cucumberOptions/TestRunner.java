package cucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/VivekVitthalShetty/IdeaProjects/apiAutomation/src/features"
        ,glue = "stepDefinations")
public class TestRunner { }
