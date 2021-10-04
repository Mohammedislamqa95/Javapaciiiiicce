package stepDifinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"stepDifinations"}, 
monochrome = true,
plugin={"pretty","junit:target/junitReport.xml",
		"json:target/JSONReports/report.json",
		"html:target/HtmlReport9s"}
)

public class TestRunner {

}
