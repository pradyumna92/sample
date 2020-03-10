package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "html:src/test/logs/report"
        },
        features = "src/test/java/TestSuites/friendsurance.feature",
        glue = {"com/stepdefs", "runner"}
)

 
public class TestRunner {
}
