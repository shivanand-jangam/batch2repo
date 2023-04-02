package com.test.stepdefination;

import com.test.base.BaseTest;
import com.test.page.HomePageMenu;

import io.cucumber.java.en.When;

public class HomePageMenuStepDefinatiopn extends BaseTest{

	HomePageMenu homePageMenu = new HomePageMenu();

	@When("User clicks on {string} menu")
	public void user_clicks_on_elements_menu(String menuOption) {
		homePageMenu.clickOnMenuOption(menuOption);
	}

}
