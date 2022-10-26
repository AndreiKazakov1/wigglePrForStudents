Feature:

  Scenario:
    Given Main page is loaded
    When Click on trustButton
    And Click on account link
    And Login page is loaded
    And Input valid email registration "123wer@gmal.com"
    And Click continue button
    Then Conformation page is loaded
    Then See email address like "123wer@gmal.com" in the email-field




