@LoginExcel
Feature: Verift the Login functionality of the 3i-Bank application

  @tag1
  Scenario: Login functionality of the 3i-Bank with valid data
    Given User navigate to 3i-Bank Login screen
    And User enter the username,password for the creditcard
    When User enter the login button
    Then Home page will displayed
    And User click on Apply Now button in home page
    Then User should be navigate to PICRA screen
    And User click on I agree and Agree&Continue button in PICRA screen
    Then User navigtes to Personal details tab
    And User give the inputs as FirstName,LastName,DateOfBirth,PANNumber,MobileNumber,Email
    Then User click on save and submitt the personal details
    And Click on OK in approved screen and click on next button
    Then User navigate to Employement details tab
    And User gives the input as in Employment details Employer,EmployersPhone,EmployementStatus,HowOftenareyoupaid,LastPayDate,NextPayDate,LastTakeHomePayChequeAmount,TakeHomeForTheMonthOfMay
    Then User click on save and submitt Em[ployment details
    And User able to click on logout
