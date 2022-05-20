package org.runnner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class)
	@CucumberOptions(features="LoginPage\\LoginPages.feature",glue= {"com.stepdefinition"})
	public class TestRunner {
		
}
