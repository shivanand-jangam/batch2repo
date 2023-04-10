package com.test.stepdefination.elements;

import com.test.base.BaseTest;
import com.test.page.elements.TextBoxPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TextBoxPageStepDefination extends BaseTest {

	TextBoxPage textBoxPage = new TextBoxPage();

	@When("User enters Full name as {string}")
	public void user_enters_full_name_as(String string) {
		textBoxPage.enterUsernameAs(string);
	}

	@When("User enters email as {string}")
	public void user_enters_email_as(String string) {
		textBoxPage.enterUserEmailAs(string);
	}

	@And("User enters Current Address as {string}")
	public void user_enters_current_address_adress_as(String address) {
		textBoxPage.enterCurrentAddressAs(address);
	}

	@And("User enters Permanent Address as {string}")
	public void user_enters_permenant_address_adress_as(String paddress) {
		textBoxPage.enterPermanentAddressAs(paddress);
	}

	@And("User Clicks on Submit button")
	public void user_clicks_on_submit_button() {
		textBoxPage.clickOnSubmitButton();
	}

	@Then("User should see Name as {string}")
	public void user_should_see_name_as(String uname) {
		textBoxPage.shouldSeeNameDisplayedAs(uname);
	}

	@And("User should see Email as {string}")
	public void user_should_see_email_as(String email) {
		textBoxPage.shouldSeeEmailDisplayedAs(email);
	}

	@And("User should see Current Address as {string}")
	public void user_should_see_current_address_as(String CAdd) {
		textBoxPage.UserSeeCurrentAddressAs(CAdd);
	}

	@And("User should see Permananet Address as {string}")
	public void user_should_see_parmanat_address_as(String pa) {
		textBoxPage.UserSeeParmanatAdressAs(pa);
	}
}
