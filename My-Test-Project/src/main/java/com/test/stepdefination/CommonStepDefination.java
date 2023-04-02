package com.test.stepdefination;

import com.test.base.BaseTest;
import com.test.base.BrowserFactory;
import com.test.page.CommonPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommonStepDefination extends BaseTest{

	CommonPage commonPage = new CommonPage();

	@Then("User should navigate to {string} page")
	public void user_should_navigate_to_elements_page(String menuOption) {
		commonPage.shouldSeePageTitleAs(menuOption);
	}

	@When("User clicks on {string} Sub Menu option")
	public void user_clicks_on_text_box_option(String subMenu) {
		commonPage.clickOnSubMenuOption(subMenu);
	}

	@Given("User navigates to the application home page")
	public void user_navigates_to() {
//		browserFactory.openBrowser("chrome");
	}
}
