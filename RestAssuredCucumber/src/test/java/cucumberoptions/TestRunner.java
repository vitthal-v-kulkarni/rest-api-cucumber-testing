package cucumberoptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"/RestAssuredCucumber/src/test/java/features"},
		glue = {"/RestAssuredCucumber/src/test/java/steps"}		
		)
public class TestRunner {

}
