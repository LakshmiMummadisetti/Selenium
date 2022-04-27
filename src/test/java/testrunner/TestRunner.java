package testrunner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@Test
@CucumberOptions(
		features="src/test/java/features",
		glue= {"stepdefinition","hooks" },
		dryRun = false,
		plugin = {"pretty","html:reports/htmlreport"})
public class TestRunner extends AbstractTestNGCucumberTests{

}
