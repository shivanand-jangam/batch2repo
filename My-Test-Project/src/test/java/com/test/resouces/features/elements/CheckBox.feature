Feature: Check functionalit of CheckBox.

  Background: User is on login page
    Given User navigates to "https://demoqa.com/"

  Scenario: Verify CheckBox functionality
    Given User Cliks on CheckBox menu
    When User navigate to CheckBox page
    Then Verify the CheckBox page
    When User Click on home CheckBox
    Then User verifies the You have selected checkboxes info
    And User clicks on expand Icon
    When User verifies the child checkboxes are selected by default
    Then User verifies the You have selected checkboxes info

  Scenario: TC002 verify functinality of Redion button
    When User clicks on redio button mentu
    And User navigate to Redio button page
    Then valrify  the Redion button page
    When User Click on yes button
    Then verify the yes button
    When User Click on Impressive button
    Then verify the Impressive button
    When User Click on No button
    Then Verify the No button
