
Feature: To test loginpage functionality
  @ui
  Scenario: Test loginpage with valid credentials
    Given user lands on login page
    When user enter <username> and <password>
    And click login button with valid
    Then user lands on homepage

    Examples:
| username | password |
| Raghav | 12345 |
| Ele | 12345 |