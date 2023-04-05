#@smoke

Feature:User is able to go to product through homepage slider
  Scenario:  first slider is clickable on home page
    When user clicks on first slider
    Then user should navigate to first product page
  Scenario:
    When user clicks on second slider
    Then user should navigate to second product page
