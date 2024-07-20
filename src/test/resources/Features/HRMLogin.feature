Feature: Login to HRM

	@smoke1
  Scenario Outline: Login to HRM page
    Given my browser is open
    And I open orange hrm login page
    When I enter <username> and <password>
    Then I am logged in to my account

    Examples: 
      |username|password|
      |admin|admin123|
     
