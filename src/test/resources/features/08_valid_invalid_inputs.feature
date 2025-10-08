@Validnnvalid
Feature: valid_invalid_inputs


  Scenario: valid inputs
    Given user enters valid inputs
    |1234567|
    |1234567|
    |1234567|
    |1234567|
    |1234567|

  Scenario: invalid inputs
    Given user enters invalid inputs
    |()/&%+^'111|
    |abc|
    |aaaaaaaaaaaaaaa|
#    | |
    |=)(/&%+'!|