package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = {"/Users/parthadebnath/eclipse-workspace/bank/src/main/resources/Login.feature",
	    		"/Users/parthadebnath/eclipse-workspace/bank/src/main/resources/Login1.feature"
	    },
	    glue = "com.stepdef",
	    monochrome = false,
	    plugin = {
	        "json:target/cucumber-reports.json",
	   
	    }
	)
	public class TestRunner extends AbstractTestNGCucumberTests {
	}