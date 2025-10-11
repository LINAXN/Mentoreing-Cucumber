@first_feature
Feature: First Feature

  @first_scenario @smoke
  Scenario: First Scenario
    Given print Hello World on console
    When print from one to hundred on console
    Then assert if Cucumber contains C

  @first_scenario @smoke
  Scenario: First Scenario
    Given other failed step
    When print from one to hundred on console
    Then assert if Cucumber contains C