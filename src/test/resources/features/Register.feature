Feature: As a user
  i have be able to login
  so that i can see home screen

  @Register @TC01-Register
  Scenario: as a user I can successful register with valid data
    Given user on the products page
    When user click widget button
    And user click register
    And user input full name
    And user input valid email
    And user input password
    And user click register button
    Then user on the products page

  @Register @TC02-Register
  Scenario: as a user I register with registered email
    Given user on the products page
    When user click widget button
    And user click register
    And user input new full name
    And user input valid email
    And user input password
    And user click register button
    Then user see error message "Gagal :("



