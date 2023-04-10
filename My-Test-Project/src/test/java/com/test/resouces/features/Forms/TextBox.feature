Feature: Text Box feature Test cases

  Background: User is Logged In
    Given User navigates to the application home page

  @RegressionTest @SmokeSuite11
  Scenario: Verify Text Box functionality
    When User clicks on "Elements" menu
    Then User should navigate to "Elements" page
    When User clicks on "Text Box" Sub Menu option
    Then User should navigate to "Text Box" page
    When User enters Full name as "abc xyz"
    And User enters email as "abc2gmail.com"
    And User enters Current Address as "Current Address Pune"
    And User enters Permanent Address as "Permanent Address Pune"
    And User Clicks on Submit button
    Then User should see Name as "abc xyz"
    And User should see Email as "abdadd@gmail.com"
    And User should see Current Address as "dvsdv"
    And User should see Permananet Address as "zsdvsvsd"
