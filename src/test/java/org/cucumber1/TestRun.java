package org.cucumber1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\Login.feature"},glue={"org.def"})
public class TestRun {
         private void vicky() {
			System.out.println("vicky");
		}
}
