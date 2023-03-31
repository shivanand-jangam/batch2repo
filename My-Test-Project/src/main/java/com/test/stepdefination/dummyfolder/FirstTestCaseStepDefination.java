package com.test.stepdefination.dummyfolder;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstTestCaseStepDefination {

	@Given("User is on given step")
	public void user_Is_On_Given_Step() {

	}

	@When("User has to perform any action in when step")
	public void user_Has_To_Perform_Any_Action_In_When_Step() {

	}

	@When("User has to perform any action in and step")
	public void user_has_to_perform_any_action_in_and_step() {

	}

	@Then("User has to validate\\/assertion in then step")
	public void user_has_to_validate_assertion_in_then_step() {

	}

	@Then("User has to validate\\/assertion in and step")
	public void user_has_to_validate_assertion_in_and_step() {

	}

	@When("User has to perform any action in second when step")
	public void user_has_to_perform_any_action_in_second_when_step() {

	}

	@When("User has to perform any action in when step (.*)")
	public void user_has_to_perform_any_action_in_when_step(String username) {
		System.out.println(username);

	}

	@When("User has to perform any action in and step (.*)")
	public void user_has_to_perform_any_action_in_and_step(String password) {
		System.out.println(password);
	}

}
