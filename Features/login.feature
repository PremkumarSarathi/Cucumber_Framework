Feature: login
  Scenario: Succesful login with valid credential
    Given User launch Application
    And User enter valid credentials "standard_user" and "secret_sau"
    And click on login
    Then Page title should be displayed

 Scenario Outline: Succesful login with valid credential
    Given User launch Application
    And User enter valid credentials "<email>" and "<password>"
    And click on login
    Then Page title should be displayed

  Examples:
    | email         | password     |
    | standard_user | secret_sauce |