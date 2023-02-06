package org.test;

import org.junit.runner.RunWith;
import org.stepdefinition.JVMReport;

import io.cucumber.java.After;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", glue = "org.stepdefinition", dryRun = false, strict = true, plugin = {
		"html:C:\\Users\\KAMAL\\eclipse-workspace\\Cucumber\\Reports\\htmlreport",
		"json:C:\\Users\\KAMAL\\eclipse-workspace\\Cucumber\\Reports\\jsonreport\\fb.json", 
		"junit:C:\\Users\\KAMAL\\eclipse-workspace\\Cucumber\\Reports\\junitreport\\face.xml"})

public class TestRunner {
//@After
	//public static void report() {

//	JVMReport.generateJvmReport("C:\\Users\\KAMAL\\eclipse-workspace\\Cucumber\\Reports\\JVMreport");
//}
}
