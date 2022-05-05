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
		tags="~@test1 or @test3"  //Executes tags with @test3 and ignores tags with @test1
		
		)
public class Runner3 {

}
