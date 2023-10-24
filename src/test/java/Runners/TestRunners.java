package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/LoginTillCheckoutProduct.feature",
        glue = {"StepDefinitions"},
        tags = "@regression"
)

public class TestRunners extends AbstractTestNGCucumberTests {
}
