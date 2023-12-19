package testRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="/Cucumber_Kunal/src/test/java/FeatureFile/data.feature",glue={"stepdefinition"},monochrome= true,

plugin= {"pretty","junit:target/jUnit1reports/report.xml"}	
		)

public class runner {

}
