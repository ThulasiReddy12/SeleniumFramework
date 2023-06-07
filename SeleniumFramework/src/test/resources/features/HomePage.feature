Feature: Search for product

  Scenario: verify user is able to search for an product at home page
    Given When user open login page
    When User login to application with "rakeshchowdarykurapati@gmail" and "112Rakesh@" credentials
    Then Verify user is on HomePage
    When User search for "Apple" product
    Then verify searched product list should display
