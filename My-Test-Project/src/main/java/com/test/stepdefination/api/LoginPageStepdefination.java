package com.test.stepdefination.api;

import com.test.base.RestUtil;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepdefination {

	RestUtil restUtil = new RestUtil();

	@Given("User Provides URI as {string}")
	public void user_provides_uri_as(String uri) {
		restUtil.feedBaseURI(uri);
	}

	@When("User Provides headers {string} as {string}")
	public void user_provides_headers_as(String key, String value) {
		restUtil.feedHeaders(key, value);
	}

	@When("User Provides endpoint as {string}")
	public void user_provides_endpoint_as(String endpoint) {
		restUtil.feedEndpoint(endpoint);
	}

	@When("User Provides Body parameters {string} and {string}")
	public void user_provides_body_parameters(String un, String pwd) {
		String json = "{\"username\":\"" + un + "\",\"password\":\"" + pwd
				+ "\"}";
		restUtil.feedBody(json);
	}

	@When("User Hit {string} Request")
	public void user_hit_post_request(String requestType) {
		restUtil.hitAPIRequest(requestType);
	}

	@Then("Verify Response status code as {int}")
	public void verify_response_status_code_as(Integer code) {
		restUtil.validateResponseCodeAs(code);
	}

	@Then("Verify response contains token code")
	public void verify_response_contains_token_code() {
		restUtil.validateTokenIsGenerated();
	}
}
