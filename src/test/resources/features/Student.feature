Feature: Student Management System

  Scenario:
#  As a teacher, I want to add a new student by filling out fields (Name, ID, Email, Course, Grade) so
#  that I can keep track of each student’s information in the list.-----
#  All fields are mandatory- Email must be in a valid format- Student appears in the list after being added
#  Data should be saved in local storage

    Given teacher is on the student management page
    When teacher enters student details
      | Name | ID  | Email          | Course | Grade |
      | Lina | 101 | Lina@gmail.com | IT     | A     |

    And teacher clicks the add button
    Then teacher verifies the student is added to the list
    And teacher verifies the student data is saved in local storage
    Then close the browser

  Scenario: Prevent adding student with invalid email format
    When teacher enters student details
      | Name | ID  | Email        | Course | Grade |
      | Sara | 102 | sara@gmail   | CS     | B     |
      | Sara | 102 | sara@gmail   | CS     | B     |
      | Sara | 102 | sara@gmail   | CS     | B     |
      | Sara | 102 | sara@gmail   | CS     | B     |
    And teacher clicks the add button
    Then teacher should see an error message "Invalid email format"