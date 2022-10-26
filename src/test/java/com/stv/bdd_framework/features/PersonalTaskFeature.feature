Feature:

  Scenario: 04. Personal task realization
    Given Main page is loaded
    When Click on trustButton
    And Click on account link
    And Login page is loaded
    And Input valid email registration "123wer@gmal.com"
    And Click continue button
    Then Conformation page is loaded
    And See email address like "123wer@gmal.com" in the email-field
    When Make next click on sign in button
    Then Login page is loaded
    When Click on Wiggle widget
    Then Main page is loaded
    When Click wishlist link
    Then Confirm that wishlist is empty
    When Click start shopping button
    Then Main page is loaded
    And Close browser












