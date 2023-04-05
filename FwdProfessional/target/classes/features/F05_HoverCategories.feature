#@smoke
Feature:
  Scenario:Checking Page title
    When user hover to main categories
    And click on one of the sub-categories
    Then sub-category page should be opened
