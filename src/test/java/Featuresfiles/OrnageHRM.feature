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

  Scenario Outline: Unsuccessful login with invalid credentials
    Given User is on the OrangeHRM login page
    When User enters invalid <Username> and <Password>
    And Clicks on the login button
    Then Error message "Invalid credentials" should be displayed
  Examples:
  |Username |Password  |
  |admin    |admin1234 |