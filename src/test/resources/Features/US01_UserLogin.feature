@smoke
Feature: User Login


  Scenario: Positive Login Test
    Given User is on the login page
    When The user enters valid username and password
    And The user clicks login button
    Then The user logs in successfully






