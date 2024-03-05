@Login
Feature: Verift the Login functionality of the 3i-Bank with valid data

  Scenario: Login functionality of the 3i-Bank with valid data
    Given User navigate to 3i-Bank page
    And User enter the username,password and creditcard
    When click on Login Button
    And Verify the home page
    And click on Apply Now buttron
    Then PICRA page will displayed
    And click on I agree checkbox and Agree&Continue button
    And Fills the personal details
    And Fills Employment details
    Then user click on Logout button
    
