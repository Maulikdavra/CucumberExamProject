package runner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


//@RunWith(Cucumber.class)
@RunWith(Cucumber.class)
@CucumberOptions(
		features= "classpath:feature",
		glue="Steps",
		tags="@ColorFeature",
		monochrome=true, //if it's false then it will run sucessfully but it will in unreadable format in console(  it will not be readable english format) 
		dryRun=false, //if it's true then it will only check for compilation error and will skip all secnerio.
		plugin= {
				
			"pretty",
			"html:target/cucumber",
			"json:target/cucumber.json"	
		}
		)

public class LoginRunner {

}
