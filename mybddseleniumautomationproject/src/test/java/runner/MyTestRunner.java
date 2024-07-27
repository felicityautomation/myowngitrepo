package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {""},glue = {""},plugin = {"test345"})
public class MyTestRunner extends AbstractTestNGCucumberTests {

}
