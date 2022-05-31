package StepsDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",glue={"StepsDefinition"},
monochrome=true,
plugin= {"pretty","html:target/HTMLReports.html"},
tags= "@Smoke "
)

public class TestRunner {

}
