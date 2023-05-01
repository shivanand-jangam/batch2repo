package com.test.stepdefination.api;

import com.test.base.RestUtil;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartStepDefination {

	RestUtil restUtil = new RestUtil();

	@When("User Provides Body parameters {string} and {string}")
	public void user_provides_body_parameters(String un, String pwd) {

	}


	@Then("Verify response contains token code")
	public void verify_response_contains_token_code() {
	}
}
