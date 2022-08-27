package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\admin\\eclipse-workspace\\Cucumberassignment2\\Features",
glue="stepDefinitions",monochrome=true,dryRun=false,plugin= {"pretty","html:reports/report.html"})
public class runnerTest {

}
