	package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src//test//resources//Features//search.feature",
				glue= "sharedSteps",
				plugin = {"pretty",
						"json:TestReport/report.json",
						"junit:TestReport/report.xml",
						"html:TestReport/report.html"})
			
public class TestRunner10 extends AbstractTestNGCucumberTests {

}
