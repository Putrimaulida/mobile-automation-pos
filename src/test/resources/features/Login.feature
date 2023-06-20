Feature: As a cashier
  I have be able to login
  So that i can order process

  @PositiveLogin
  Scenario: As a cashier I can successful login with valid data
    Given cashier on onboarding page
    When cashier click first next button
    And cashier input id "ITMT-3351"
    And cashier input password "kasir"
    And cashier click login button
    Then cashier successfully login and entered the sushi order page

  @InvalidIdLogin
  Scenario: As a cashier i cant login because i input invalid id
    Given cashier on onboarding page
    When cashier click first next button
    And cashier input id "ITMT-335"
    And cashier input password "kasir"
    And cashier click login button
    Then cashier still on the login page

  @InvalidPassLogin
  Scenario: As a cashier i cant login because i input invalid password
    Given cashier on onboarding page
    When cashier click first next button
    And cashier input id "ITMT-3351"
    And cashier input password "cashier"
    And cashier click login button
    Then cashier still on the login page

  @NegativeLogin
  Scenario: As a cashier i cant login because i not input cashier id field
    Given cashier on onboarding page
    When cashier click first next button
    And cashier input password "cashier"
    And cashier click login button
    Then cashier still on the login page

  @NegativeLogin01
  Scenario: As a cashier i cant login because i not input password field
    Given cashier on onboarding page
    When cashier click first next button
    And cashier input id "CS-01"
    And cashier click login button
    Then cashier still on the login page

  @NegativeLogin02
  Scenario: As a cashier i cant login because i not input id and password field
    Given cashier on onboarding page
    When cashier click first next button
    And cashier click login button
    Then cashier still on the login page