Feature: User Registration Form

  Scenario Outline: Register new users with different data
    Given User navigate to "https://claruswaysda.github.io/form.html"
    When User fill in the registration form with:
      | SSN             | <SSN>             |
      | firstName       | <firstName>       |
      | lastName        | <lastName>        |
      | email           | <email>           |
      | phone           | <phone>           |
      | username        | <username>        |
      | password        | <password>        |
      | confirmpassword | <confirmpassword> |

    And User submit the form
    Then I should see a success message

    Examples:
      | SSN |  | firstName |  | lastName | email           | phone      | username | password | confirmpassword |
      | 1   |  | Lina      |  | Salem    | lina@gmail.com  | 0551234567 | lina01   | Test@123 | Test@123        |
      | 2   |  | Omar      |  | Nasser   | omar@gmail.com  | 0552345678 | omar11   | Pass@234 | Pass@234        |
      | 3   |  | Sara      |  | Ali      | sara@gmail.com  | 0553456789 | sara22   | Word@345 | Word@345        |
      | 4   |  | Maha      |  | Saleh    | maha@gmail.com  | 0554567890 | maha33   | Key@456  | Key@456         |
      | 5   |  | Yasin     |  | Fahad    | yasin@gmail.com | 0555678901 | yasin44  | Lock@567 | Lock@567        |
