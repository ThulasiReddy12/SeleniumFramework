Feature: Validate the login functionality
@Test
  Scenario: Test login functionality
    Given When user open login page
    When User login to application with "rakeshchowdarykurapati@gmail" and "112Rakesh@" credentials
    Then Verify user is on HomePage
