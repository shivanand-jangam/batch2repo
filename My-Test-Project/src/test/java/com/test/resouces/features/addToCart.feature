Feature: check add to cart functionality

Scenario: user should add the items in cart
Given User Provides URI as "https://bookcart.azurewebsites.net"
When User provides end point as "/ShoppingCart/AddToCart/14936/2"
Then User hit the "post" request
And user validate the status code

