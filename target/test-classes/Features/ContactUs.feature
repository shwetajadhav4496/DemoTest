Feature: contact us feature

  Scenario Outline: contact us scenario
    Given user navigate to contact us page
    When user fills form from given sheetname <Sheetname> and row <rownumber>
    And user clicks on send button
    Then it shows a successful msg

    Examples: 
      |Sheetname|rownumber|
      |contactus|0|
      |contactus|1|
