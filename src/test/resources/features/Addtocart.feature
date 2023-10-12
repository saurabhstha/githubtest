Feature: This is an example feature to add items to cart.

  @saucedemoaddtocart
  Scenario: This is scenario to test saucedemo add to cart item after login in
    Given User navigated to url "https://www.saucedemo.com/"
    When User enters username "standard_user"
    And User enters password "secret_sauce"
    And User clicks on login button
    When User should be able to see the homepage
    Then User should be able to check out item from cart


