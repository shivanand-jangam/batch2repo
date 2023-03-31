Feature: First Practice feature file

  Background: User is Logged In
    Given User is on given step

  Scenario: THIS IS TO TEST MY FIRST Scenario TESTCASE
    When User has to perform any action in when step
    And User has to perform any action in and step
    Then User has to validate/assertion in then step
    And User has to validate/assertion in and step
    When User has to perform any action in second when step

  Scenario Outline: THIS IS TO TEST MY FIRST Scenario Outline TESTCASE
    When User has to perform any action in when step <username>
    And User has to perform any action in and step <password>
    Then User has to validate/assertion in then step
    And User has to validate/assertion in and step
    When User has to perform any action in second when step

    Examples: 
      | username | password   |
      | shiva    | shivaa123  |
      | Sridhar  | Sridhar123 |
      | Srikant  | Srikant123 |
