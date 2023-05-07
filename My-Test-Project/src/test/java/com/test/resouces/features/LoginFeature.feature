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

  @validLogin
  Scenario Outline: Add Product to Cart
    Given User Provides URI as "https://bookcart.azurewebsites.net"
    When User Provides headers "Content-Type" as "application/json"
    And User Provides endpoint as "/api/ShoppingCart/AddToCart/14936/""<productId>"
    When User Hit "POST" Request
    Then Verify Response status code as 200

    Examples: 
      | productId |
      |         2 |
      |         3 |

  @validLogin
  Scenario: Get List of products in the Cart
    Given User Provides URI as "https://bookcart.azurewebsites.net"
    When User Provides headers "Content-Type" as "application/json"
    And User Provides endpoint as "/api/ShoppingCart/14936"
    When User Hit "GET" Request
    Then Verify Response status code as 200

  @validLogin
  Scenario: Delete Product From Cart
    Given User Provides URI as "https://bookcart.azurewebsites.net"
    When User Provides headers "Content-Type" as "application/json"
    And User Provides endpoint as "/api/ShoppingCart/14936"
    When User Hit "DELETE" Request
    Then Verify Response status code as 200

  @validLogin1234
  Scenario Outline: End to End Cart Test case
    Given User Provides URI as "https://bookcart.azurewebsites.net"
    When User Provides headers "Content-Type" as "application/json"
    And User Provides endpoint as "/api/ShoppingCart/14936"
    When User Hit "DELETE" Request
    Then Verify Response status code as 200
    And User Provides endpoint as "/api/ShoppingCart/AddToCart/14936/""<productId>"
    When User Hit "POST" Request
    Then Verify Response status code as 200
    And User Provides endpoint as "/api/ShoppingCart/14936"
    When User Hit "GET" Request
    Then Verify Response status code as 200
    Then Verify "<productId>" product us added in the Cart
    Examples: 
      | productId |
      |         2 |
      |         3 |
