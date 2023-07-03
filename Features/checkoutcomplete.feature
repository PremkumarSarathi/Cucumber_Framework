Feature: Checkout Complete
  Scenario: Click add cart for the selected product
    Given User launch Application
    And User enter valid credentials "standard_user" and "secret_sauce"
    And click on login
    Then Page title should be displayed
    Then Sorting the products "Price (high to low)" in the product page
    When Click the add cart button
#    Then Validating the added products
    When Click on Add cart icon link
    Then Validating user can navigate to Your cart page
    Then Validating selected products are present in the your cart page
    When Click on checkout button
    Then User can navigate to user information page
    When Enter the user first name "Prem"
    When Enter the user last name "Sarathi"
    When Enter the user zip code "632521"
    Then click the continue button
    And Validating user can navigate to checkout overview page
    When Adding total price of quantity
    Then Validating total price of quantity
    When Click on Finish button
    Then Validating user can navigate to checkout complete page
    Then Validating order successful message
    When Click on back home button
    Then Validating user can navigate to product page
    And Validating user can logout from the product page