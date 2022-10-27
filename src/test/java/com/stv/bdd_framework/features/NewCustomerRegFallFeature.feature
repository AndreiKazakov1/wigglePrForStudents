Feature: Try to registration new customer

  Scenario: 03. Opening the main page
    Given Main page is loaded
    When Click on trustButton
    And Click on account link
    Then Login page is loaded

  @NewCustomerRegFallFeature
  Scenario Outline: 031. Invalid email entering
    When Input invalid email registration "<address>"
    And Click continue button
    Then Error massage is displayed

    Examples:
      | address    |
      | k111@gmail |


