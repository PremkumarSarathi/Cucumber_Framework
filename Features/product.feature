Feature: Add to cart
  Scenario: Click add cart for the selected product
    Given User launch Application
    And User enter valid credentials "standard_user" and "secret_sauce"
    And click on login
    Then Page title should be displayed
    Then Sorting the products "Price (high to low)" in the product page
    When Click the add cart button
    Then Validating the added products
    When Click on Add cart icon link
    Then Validating user can navigate to Your cart page