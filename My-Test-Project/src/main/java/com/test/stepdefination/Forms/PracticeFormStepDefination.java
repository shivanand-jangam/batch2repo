package com.test.stepdefination.Forms;

import org.testng.Assert;

import com.test.base.BaseTest;
import com.test.page.Form.PracticeForm;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.utility.RandomString;

public class PracticeFormStepDefination extends BaseTest  {
	
	PracticeForm practiceform=new PracticeForm();
	
	@And("verify the {string} page")
	public void verify_the_ToolsQa_page(String title) {
		
		
	}
	
	
    @When("User enters First Name as{string}")
    public void user_enters_first_name_as(String name)
    {
    	practiceform.firstName(name);
    }
    
    @And("User enters  LastName as{string}")
    public void user_enters_last_name_as(String lastname)
   	{
    	practiceform.lastName(lastname);
   	}
    
    @And("User enters the email as{string}")
    public void user_enters_the_email_as(String email)
    {
    	practiceform.emailAdress(email);
    }
    
    @And("User click on Gender as a{string}")
    public void User_click_on_Gender_as_a_Male(String male)
    {
    	practiceform.selectGenderAsMale();
    }
    
    @When("User enters mobile no")
    public void user_enters_mobile_no()
    {
    	practiceform.enterMobileNo(null);;
    }
    
    
    @And("User clicks the Date Of Birth{string}")
    public void user_clicks_the_dob(String dob)
    {
    	practiceform.enterDateOfBirth(dob);;
    }
    
   @Then("User should navigate the calender")
   public void user_should_navigate_the_calender()
   {
	   practiceform.navigateCalener();;
   }
   
   
   @And("User enters the subject as{string}")
   public void user_enters_the_subject(String subject)
   {
	  
	   practiceform.enterSubject(subject);
   }
   
   @Then("User select the hobi")
   public void user_select_the_hobi()
   {
	   practiceform.selectHobies(); 
   }
   
   
   @When("User clicks choose File")
   public void user_clicks_choose_file() throws InterruptedException
   
   {
	   practiceform.ChooseFile();
   }
   
//   @Then("User should navigate in local drive")
//   public void user_should_navigate_in_local()
//   {
//	   
//   }
//   @And("User choose the local file and uplode it")
//   public void user_choose_the_local_file_and_uplode()
//   {
//	   
//   }
//   
   @When("User enters the Current Address As{string}")
   public void user_enters_the_current_addrss(String Caddress)
   {
	   practiceform.userEntersCurrentAddress(Caddress);
   }
   
  @When("User Clicks on Click On State")
  public void user_clicks_on_select_state()
  {
	  practiceform.userClickOnState();
  }
  
  
  
  @And("User Select State On Dropdown")
  public void user_select_state_on_dropdown() {
	  
	  practiceform.selectStateOnDropdown();
  }
  
  
  
//  @Then("User should navigate the dropdown of state")
//  public void user_should_navigate_the_dropdown_of_state() {
//  
//	  
//  }
//  
//  @And("User should see the state as NCR, Uttar Pradesh, Hariyana, Rajasthan")
//  public void  user_should_see_the_state_ncr_up_hr() {
//  
//	  
//  }
  
//  @And("User select the state as{string}")
//  public void user_select_the_state_as(String state)
//  {
//	  
//  }
//  
  @When("User Clicks on Selct City")
  public void user_clicks_on_select_city()
  {
	  practiceform.userClickOnCity();
  }
  
  
  @And("User Select City on Dropdown")
  public void user_select_city_on_dropdown() {
	  
	  practiceform.selectCityOnDropdown();
  }
  
  
//  @Then("User should navigate to dropdown of citys")
//  public void user_should_navigate_to_dropdown_city()
//  {
//	  
//  }
//  
//  
//  @And("User should see the citys Agra, Locknow, Merrut")
//  public void user_should_see_the_citys_agra_locknow_mettut()
//  {
//	  
//  }
//  
//  @And("User select the city as Agra")
//  public void User_select_the_city_as_Agra()
//  {
//	  
//  }
//  
  
  @When("User clicks on submit button")
  public void user_clicks_on_submit_button()
  {
	  practiceform.userClicksOnSubmitButton();
  }
  
  
  
  @Then("User should navigate to submitting form")
  public void user_should_navigatin_to_submiting_form()
  {
	  practiceform.userNavigateOnSubmitionForm();
  }
  
  
  @And("varify the submitting form")
  public void verifying_the_submiting_form(String varify)
  {
	  practiceform.verifyTheSubmitionForm(varify);
  }
  
  
  @Then("User clicks on close button")
  public void user_clicks_on_the_close_button()
  {
	  practiceform.clickOnCloseButon(); 
  }
   
   
    
    
    
	
	
}
