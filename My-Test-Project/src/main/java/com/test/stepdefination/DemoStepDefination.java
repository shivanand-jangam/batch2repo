package com.test.stepdefination;

import org.apache.poi.ddf.EscherColorRef.SysIndexSource;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DemoStepDefination {

	@Given("navigate to google")
	public void navigate_to_google() {
	  System.out.println("Navigated google");
	}

	@Then("click on the images")
	public void click_on_the_images() {
	    System.out.println("clciked on images");
	}



}
