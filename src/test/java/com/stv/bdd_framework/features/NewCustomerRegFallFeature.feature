Feature: Try to registration new customer

  Scenario: 03. Opening the main page
    Given Main page is loaded
    And Click on trustButton
    And Click on account link
    And Login page is loaded

  Scenario Outline: 031. Invalid email entering
    When Input invalid email registration "<address>"
    And Click continue button
    Then Error massage is displayed
    And Close browser

    Examples:
      | address    |
      | k111@gmail |


