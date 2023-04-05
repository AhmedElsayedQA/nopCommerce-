#@smoke
Feature: Website provides Two Currencies
  Scenario: Using Euro currency
    Given user select euro currency from dropdown menu
  Then product's price should have euro symbol