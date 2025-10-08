@UserManagement
Feature: User Management Operations

  Background:
    Given user opens the browser and navigates to "https://claruswaysda.github.io/addRecordWebTable.html"


  @smoke @create
  Scenario: Create a new user
    When user enters "Lina" as firstname
    And user enters "25" as age
    And user selects "Germany" as country
    Then user clicks submit button
    And user verifies new user is added

  @update
  Scenario: Update existing user
    When user edits the first record
    And user changes firstname to "LinaUpdated"
    Then user verifies the record is updated

  @delete @critical
  Scenario: Delete a user
    When user deletes the first record
    Then user verifies the record is deleted

  @smoke @search
  Scenario: Search for a user
    When user searches for "Lina"
    Then user verifies search result is displayed
