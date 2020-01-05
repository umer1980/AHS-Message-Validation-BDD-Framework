package utils;

import Drivers.driver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/resources/testing.feature",glue = {"StepDefs"},
plugin = "html:target/myreport")

public class RunnerClassTest {


}




