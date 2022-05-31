Feature: To test orangehrm functionality

  Background: To test orangehrm login functionality
    Given user is on orangehrm login page
    And enter login details in  orangehrm login page
    When click login button in  orangehrm login page
    Then user is on orangehrm homepage

  Scenario: To test dashboard screen
    When check dasboard tab
    Then check dashboard menus

  Scenario: To test leave screen
    When check leave tab
    Then check leave list menus
