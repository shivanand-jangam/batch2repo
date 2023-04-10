package com.test.stepdefination.elements;

import com.test.page.elements.CheckBox;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckBoxStepDefinations extends CheckBox{

	CheckBoxStepDefinations checkbox=new CheckBoxStepDefinations();
	
	
	@And("verify the Check Box page")
	public void verify_the_check_box_page(String verify)
	{
		checkbox.validateCheckBox(verify);
	}
	
	@When("User clicks on Home Page checkbox expand option")
	public void user_clicks_on_home_page_checkbox_expand_option() {
		
	}
	
	@Then("User should see Desktop, Documents and Download checkboxes")
	public void user_should_see_desktop_Documets_and_Downlode_checkboxes() {
		
	}
	
	
	@When("User clicks on Home Page checkbox")
	public void user_clicks_home_page_checkbox() {
		
	}
	
	
	@Then("User should see Desktop, Documents and Download checkboxes are selected")
	public void user_should_see_the_Dekstop_document_checkboxes_are_selcte() {
		
		
}
	
	@When("User clicks on Desktop checkbox expand option")
	public void user_clicks_on_desktop_checkbox_expand_option() {
		
		
	}
	
	
	@Then("User should see Notes and Commands selected checkboxes")
	public void user_should_see_notes_and_commands_selected_checkbox() {
		
		
	}
	
	
	@When("User clicks on Document expand option")
	public void user_clicks_on_document_expand_option() {
		
		
	}
	
	@Then("User should see the Workspace and Office selected Checkboxes")
	public void User_should_see_the_Workspace_and_Office_selected_Checkboxes() {
		
		
	}
	
	@When("User select the workspace expand option")
	public void user_select_the_workspace_expand_option() {
		
		
	}
	
	@Then("User should see the React, Angular, Veu selected checkboxes")
	public void User_should_see_the_React_Angular_Veu_selected_checkboxes() {
		
		
	}
	
	
	@When("User clicks office expand option")
	public void user_clicks_office_expand_option() {
		
		
	}
	
	@Then("User should see the Public, Private, Classified, General selected checkboxes")
	public void User_should_see_the_Public_Private_Classified_General_selected_checkboxes() {
		
		
	}
	
	  
	@When("User clicks Downlode Expand option")
	public void User_clicks_Downlode_Expand_option() {
		
		
	}
	
	@Then("User should see the world file and xcell file selected option")
	public void User_should_see_the_world_file_and_xcell_file_selected_option() {
		
		
	}
	
	
	@When("User clicks the substraction symbol")
	public void User_clicks_the_substraction_symbol() {
		
		
	}
	
	
	@Then ("All expanded checkboxes should be reduce")
	public void All_expanded_checkboxes_should_be_reduce() {
		
		
	}
	
	
	
	


	
}
