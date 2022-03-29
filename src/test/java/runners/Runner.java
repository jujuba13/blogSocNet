package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\Features\\Acesso",
		glue =  "steps",
		tags = "@fluxopadrao",
		plugin ={"pretty", "html:target/cucumber.html", "json:target/cucumber.json", "junit:target/cucmber.xml"},
		monochrome = true
		)


public class Runner {

}
