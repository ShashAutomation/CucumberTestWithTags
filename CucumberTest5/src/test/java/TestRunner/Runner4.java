package TestRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features={"F:\\selenium projects\\CucumberTest5\\src\\test\\resources\\features\\input.feature"},
			
				
		glue= {"Stepdefinitions"},
		plugin= {"pretty"},
		stepNotifications=true,
		monochrome=true,
		dryRun=false,
		tags= "@test1 and @test2" //Executes tags with both @test1 and @test2 
		
		)

public class Runner4 {

}
