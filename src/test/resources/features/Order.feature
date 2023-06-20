Feature: Order - As a cashier I want to create new order

  @Order
  Scenario: As a cashier, I want create new order with Dine In Service
    Given cashier on onboarding page
    When cashier click first next button
    And cashier input id "ITMT-3351"
    And cashier input password "kasir"
    And cashier click login button
    Then cashier successfully login and entered the sushi order page
    And cashier input customer's name "Amalia"
    And cashier select service Dine In
    And cashier input number of table "19"
    And cashier click Create New Order button
    Then the app successfully display the menu
