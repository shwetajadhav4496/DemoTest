Feature: radio button

  Scenario: test radio button
    Given i open browser
    And i launch url
    When I select radio button
    Then my radio button is selected

  @Smoke
  Scenario: test suggestion box
    Given i input some text
    And it will give suggestion
    When i select data from suggestion
    Then my selected data is entered in text box
