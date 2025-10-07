Feature: Calucletor oprations

@Calucletor
  Scenario: Add two numbers
    Given user enters number 30
    And user enters another number 30
    When user adds the numbers
    Then the result should be 60
