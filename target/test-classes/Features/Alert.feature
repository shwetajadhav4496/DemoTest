Feature: Alert validatio

  @smoke
  Scenario: test alert
    Given i enter my name
    When i click on confirm
    Then alert will show

  @smoke
  Scenario: element visible
    Given i click on show
    And elemnt is visible
    When i enter data
    And i click on hide
    Then element is disabled
