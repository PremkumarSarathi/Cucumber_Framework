package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"@target/failedrerun.txt"},
        glue = "stepDefinition",
        plugin = {"pretty",
                "html:target/cucumber/report.html",
                "rerun:target/failedrerun.txt"},
        monochrome = true
)
public class FailedReRun {
}
