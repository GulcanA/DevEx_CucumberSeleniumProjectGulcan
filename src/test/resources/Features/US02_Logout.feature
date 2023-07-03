@smoke
Feature: User Logout
  Scenario: User should be able to logout successfully
    Given User is on the login page
    When The user enters valid username and password
    And The user clicks login button
    Then The user logs in successfully
    Then User hover over My Account drop down menu
    And User clicks Logout and logout successfully
    Then User clicks back icon on the browser and cannot login again


