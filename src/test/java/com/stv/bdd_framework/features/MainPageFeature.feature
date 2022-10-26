Feature: Go to login page

  Scenario: 01. Opening the main page
    Given Main page is loaded
    When Click on trustButton
    And Click on account link
    Then Login page is loaded
    And Close browser


