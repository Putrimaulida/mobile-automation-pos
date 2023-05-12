Feature: As a user
  i have be able to login
  so that i can buy products

  @TC01-Login
  Scenario: as a user I can successful login with valid data
    Given user on the products page
    When user click widget button
    And user input valid email
    And user input password
    And user click login button
    Then user on the products page