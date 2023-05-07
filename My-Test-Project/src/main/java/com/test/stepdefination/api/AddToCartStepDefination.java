package com.test.stepdefination.api;

import com.test.base.RestUtil;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartStepDefination {

	RestUtil restUtil = new RestUtil();

	@When("User Provides endpoint as {string}{string}")
	public void user_provides_endpoint_as(String string1, String string2) {
		String endpoint = string1 + string2;
		restUtil.feedEndpoint(endpoint);
	}

	@Then("Verify {string} product us added in the Cart")
	public void verify_product_us_added_in_the_cart(String string) {
		restUtil.validateBookIdAs(Integer.parseInt(string));
	}

}