Feature: Home page testing

  
  Scenario: updating contact details
    Given I want to update my info
    And i change my details
    When I update my country
    And click on save
    Then my details are saved
