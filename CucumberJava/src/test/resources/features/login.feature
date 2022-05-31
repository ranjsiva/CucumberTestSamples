
Feature: To test login functionality
  @Smoke
  Scenario: Test login with valid credentials
    Given user is on login page
    And enter <username> and <password>
    When click login button
    Then user is on homepage
   
Examples:
| username | password |
| Raghav | 12345 |
| Ele | 12345 |
  
