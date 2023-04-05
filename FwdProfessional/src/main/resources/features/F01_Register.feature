@smoke
Feature: User should be able to create a new account

Scenario: user can create an account with valid data
Given user go to register page
When user select gender type
And user enter "automation" and "tester"
And user enter date of birth
And user enter "tester@example.com" field
And user enter "P@ssw0rd" and "P@ssw0rd" Password fields
And user clicks on register button
Then success message is displayed

  Scenario: user cannot create an account with repeated data
    Given user go to register page
    When user select gender type
    And user enter "automation" and "tester"
    And user enter date of birth
    And user enter "tester@example.com" field
    And user enter "P@ssw0rd" and "P@ssw0rd" Password fields
    And user clicks on register button
    Then failure message is displayed





