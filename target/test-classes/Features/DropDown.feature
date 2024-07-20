@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: test drop down
    Given i open browser
    And i launch url
    When I select from dropdown
    Then i see value in textbox

  @tag2
  Scenario Outline: test checkbox
    Given I am on home page
    When I check box
    Then it is selected
