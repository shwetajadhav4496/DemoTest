Feature: Test google search

	@smoke
  Scenario: Validate google search
    Given browser is open
    And user is on google search
    When user enters text
    And user hit search button
    Then user is navigated to search result
