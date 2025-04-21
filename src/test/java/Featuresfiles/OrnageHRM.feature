@OrangeHRM
Feature: OrangeHRM Login Functionality
  Scenario: Successful login with valid credentials
    Given User is on the OrangeHRM login page
    When User enters valid <Username> and <Password>
    And Clicks on the login button
    Then User should be navigated to the dashboard page

Examples:
|Username |Password  |
|Admin    |admin123  |