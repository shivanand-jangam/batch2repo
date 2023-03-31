package com.test.stepdefination.dummyfolder;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstTestCaseStepDefination {

	@Given("^User is on given step$")
	public void user_Is_On_Given_Step() {
		System.out.println("******** User is on given step ********");
	}

	@When("User has to perform any action in when step")
	public void user_Has_To_Perform_Any_Action_In_When_Step() {
		System.out.println(
				"******** User has to perform any action in when step ********");

	}

	@When("User has to perform any action in and step")
	public void user_has_to_perform_any_action_in_and_step() {
		System.out.println(
				"******** User has to perform any action in and step ********");
	}

	@Then("User has to validate\\/assertion in then step")
	public void user_has_to_validate_assertion_in_then_step() {
		System.out.println(
				"******** User has to validate\\\\/assertion in then step ********");
	}

	@Then("User has to validate\\/assertion in and step")
	public void user_has_to_validate_assertion_in_and_step() {
		System.out.println(
				"******** User has to validate\\\\/assertion in and step ********");
	}

	@When("User has to perform any action in second when step")
	public void user_has_to_perform_any_action_in_second_when_step() {
		System.out.println(
				"******** User has to perform any action in second when step ********");
	}

	@When("User has to perform any action in when step {string}")
	public void user_has_to_perform_any_action_in_when_step_test(
			String username) {
		System.out.println(username);
		System.out
				.println("******** User has to perform any action in when step "
						+ username + "********");
	}

	@When("User has to perform any action in and step {string}")
	public void user_has_to_perform_any_action_in_and_step_test_test(
			String password) {
		System.out.println(password);
		System.out
				.println("******** User has to perform any action in when step "
						+ password + "********");
	}

}
