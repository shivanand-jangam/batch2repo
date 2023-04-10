
Feature: Text Box feature Test cases

  Background: User is Logged In
    #Given User navigates to the application home page
@smooke
    Scenario: Verify Practice Form functionality
    When User clicks on "Forms" menu
    Then User should navigate to "Forms" page
    When User clicks on "Practice Form" Sub Menu option
    Then User should navigate to "Practice Form" page
    And verify the "DEMOQA" page        
    When User enters First Name as"abc"
    And User enters  LastName as"xyz"
    And User enters the email as"shri123@gmil.com"
    And User click on Gender as a"Male"
    When User enters mobile no
    And User clicks the Date Of Birth"dob"
    Then User should navigate the calender
    And User enters the subject as"zzz"
    Then User select the hobi   
    When User clicks choose File 
    #Then User should navigate in local drive  
    #And User choose the local file and uplode it
    When User enters the Current Address As"Wagholi"  
    When User Clicks on Click On State
    And User Select State On Dropdown
    #Then User should navigate the dropdown of state
    #And User should see the state as NCR, Uttar Pradesh, Hariyana, Rajasthan
    #And User select the state as"Uttar pradesh"
    When User Clicks on Selct City
    And User Select City on Dropdown
    #Then User should navigate to dropdown of citys
    #And User should see the citys Agra, Locknow, Merrut
    #And User select the city as Agra
    When User clicks on submit button
    Then User should navigate to submitting form
    And varify the submitting form
    Then User clicks on close button
    
    