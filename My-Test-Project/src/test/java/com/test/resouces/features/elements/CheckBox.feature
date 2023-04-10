Feature: Check functionalit of CheckBox.

  Background: User is on login page
    Given User navigates to the application home page


  Scenario: Verify CheckBox functionality
    When User clicks on "Elements" menu
    Then User should navigate to "Elements" page
    When User clicks on "Check Box" Sub Menu option
    Then User should navigate to "Check Box" page
    And verify the Check Box page
    #When User Select on home "Check Box" he should navigate the submenu
    #And User select the "Check Box" user see the all submenu selecte
    #Then User verifies the message
    When User clicks on Home Page checkbox expand option
  Then User should see Desktop, Documents and Download checkboxes
  When User clicks on Home Page checkbox
  Then User should see Desktop, Documents and Download checkboxes are selected
  
  When User clicks on Desktop checkbox expand option
  Then User should see Notes and Commands selected checkboxes
  When User clicks on Document expand option
  Then User should see the Workspace and Office selected Checkboxes
  When User select the workspace expand option
  Then User should see the React, Angular, Veu selected checkboxes
  When User clicks office expand option
  Then User should see the Public, Private, Classified, General selected checkboxes
  When User clicks Downlode Expand option
  Then User should see the world file and xcell file selected option
  When User clicks the substraction symbol
  Then All expanded checkboxes should be reduce
  
   
  
  