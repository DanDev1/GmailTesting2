package gmailLogin.GmailTesting;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;
//import cucumber.api.junit.*;

@RunWith(Cucumber.class)

@CucumberOptions(

      features="src/test/java/demoSOS.feature"

      //format={"pretty","html:target/Reports"}
    	//	  glue={"stepDefinition"}
      )

public class RunnerClassSOS {

}