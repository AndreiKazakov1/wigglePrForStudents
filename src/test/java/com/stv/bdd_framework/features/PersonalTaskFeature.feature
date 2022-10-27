@PersonalTaskFeature
Feature: Go to main page after shopping page

  Scenario: 04. Login page loading
    Given Main page is loaded
    When Click on trustButton
    And Click on account link
    Then Login page is loaded
    When Input valid email registration address
    And Click continue button
    Then Conformation page is loaded
    When Entered email address  is visible in the email-field
    And Make next click on sign in button
    Then Login page is loaded
    When Click on Wiggle widget
    Then Main page is loaded
    When Click wishlist link
    And Confirm that wishlist is empty
    And Click start shopping button
    Then Main page is loaded










