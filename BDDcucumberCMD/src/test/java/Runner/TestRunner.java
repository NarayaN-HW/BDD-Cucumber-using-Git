package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\Feature\\loginCmd.feature",
		glue= {"Steps"}, // fix glue to execute pkg
		monochrome = true
		, plugin = {"json:target/cucumber.json"}
//		tags = "(@smoke or not @regression) or @important and @test or @parrent"
		)
public class TestRunner {

}
