package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/feature/searchProduct.feature",
        glue = "stepDefinitions",
        tags = "",
monochrome = true,dryRun = false)

public class TestNGTestRunner extends AbstractTestNGCucumberTests {

}
