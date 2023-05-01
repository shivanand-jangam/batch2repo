Feature: Login Functionality

  @validLogin
  Scenario Outline: User Should Login With Valid Credentials
    Given User Provides URI as "https://bookcart.azurewebsites.net"
    When User Provides headers "Content-Type" as "application/json"
    And User Provides endpoint as "/api/login"
    And User Provides Body parameters "<username>" and "<password>"
    When User Hit "POST" Request
    Then Verify Response status code as 200
    And Verify response contains token code

    Examples: 
      | username  | password         |
      | Shiva5511 | Shivajangam@5511 |
