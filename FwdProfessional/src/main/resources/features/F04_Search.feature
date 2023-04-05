@smoke

Feature: user is able to search for products in two ways
  Scenario Outline:user could search using product name
    When user enter "<itemName>" in search bar
    Examples:
      |itemName|
      |book|
      |laptop|
      |nike|

  Scenario Outline:user could search using product sku
    When user enter <product sku> in the search bar
    Examples:
      |product sku|
      |SCI_FAITH|
      |APPLE_CAM|
      |SF_PRO_11|




