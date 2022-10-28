Feature: Personal account page success loading

  Scenario: 02. Go to personal account page
    Given Main page is loaded
    When Click on trustButton
    And Click on account link
    Then Login page is loaded

  Scenario Outline: 021. Input valid email address
    When The user inputs valid email "<address>"
    Examples:
      | address               |
      | kan22979111@gmail.com |

  Scenario Outline: 022. Input valid password
    When  The user inputs valid "<password>"
    Examples:
      | password |
      | 111111   |

  @CloseBrowser
  Scenario: 02. Go to personal account page (ending)
    When The user click sing in button
    Then  Personal account page is loaded






