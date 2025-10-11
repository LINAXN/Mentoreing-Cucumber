@Registration
Feature: Registration Form

  Scenario Outline: Register new users with different data
    Given User navigate to "https://claruswaysda.github.io/form.html"

    When User enters SSN "<SSN>"
    And user enters first name "<firstName>"
    And user enters last name "<lastName>"
    And user enters address "<address>"
    And user enters email "<email>"
    And user enters phone "<phone>"
    And user enters username "<username>"
    And user enters password "<password>"
    And user enters confirm password "<confirmPassword>"
    And User submit the form
    Then I should see a success message

    Examples:
      | SSN | firstName | lastName | address | email           | phone      | username | password | confirmPassword |
      | 1   | Lina      | Salem    | 1       | lina@gmail.com  | 0551234567 | lina01   | Test@123 | Test@123        |
      | 2   | Omar      | Nasser   | 2       | omar@gmail.com  | 0552345678 | omar11   | Pass@234 | Pass@234        |
      | 3   | Sara      | Ali      | 3       | sara@gmail.com  | 0553456789 | sara22   | Word@345 | Word@345        |
      | 4   | Maha      | Saleh    | 4       | maha@gmail.com  | 0554567890 | maha33   | Key@456  | Key@456         |
      | 5   | Yasin     | Fahad    | 5       | yasin@gmail.com | 0555678901 | yasin44  | Lock@567 | Lock@567        |