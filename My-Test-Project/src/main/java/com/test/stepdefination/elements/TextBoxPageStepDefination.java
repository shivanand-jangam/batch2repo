package com.test.stepdefination.elements;

import com.test.base.BaseTest;
import com.test.page.elements.TextBoxPage;

import io.cucumber.java.en.When;

public class TextBoxPageStepDefination extends BaseTest{
	
	TextBoxPage textBoxPage = new TextBoxPage();

	@When("User enters Full name as {string}")
	public void user_enters_full_name_as(String string) {
		textBoxPage.enterUsernameAs(string);
	}

	@When("User enters email as {string}")
	public void user_enters_email_as(String string) {
		textBoxPage.enterUserEmailAs(string);
	}
}
