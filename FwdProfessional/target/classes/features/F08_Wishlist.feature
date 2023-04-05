
Feature: User should be able to add products to the wishlist
  Scenario: Check Success message
    When user clicks on add to wishlist icon
    Then a green success message should appear
  @smoke

  Scenario: Check if product is added to wishlist
    When user clicks on add to wishlist icon
    Then user navigate to wishlist page
    Then element should be added to wishlist
