@smoke
Feature: users can use login functionality to use their accounts
  Scenario: user could login with valid email and password
    Given user navigates to login page
    Then user enters "tester@example.com" and "P@ssw0rd"
    And user press login button
    Then user login to the system successfully

  Scenario: user couldn't login with invalid email and password
    Given user navigates to login page
    Then user enters "Wrong@example.com" and "P@ssw0rd"
    And user press login button
    Then  user could not login to the system

