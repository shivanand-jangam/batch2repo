package com.test.practice;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\java\\com\\test\\resouces\\features\\Forms\\PracticeForm.feature", extraGlue = {
		"src\\main\\java\\com\\test\\page\\Form",}, plugin = {"pretty",
				"html:target/cucumber-reports/cucumber-pretty",
				"json:target/cucumber-reports/CucumberTestReport.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"rerun:target/rerun.txt"}, tags = "@bhima")

public class dummyrunner {

}
