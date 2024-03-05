@tag
Feature: Verify the Login functionlaity of 3i-Bank

  @tag1
  Scenario: Login functionality of 3i-Bank page
    Given User able to navigate Login screen
    And User enter the inputs as username,password and creditcard
    When User clcik on login button
    Then User verify the home page
    And User click on ApplyNow button
    Then User redirect to PICRA screen
    And User click on agree and agree continue button
    Then User navigate to personal detail tab
    And User give the inputs forFirstName,LastName,DateOfBirth,PANNumber,MobileNumber,Email
    When User click on save and submitt the all details
    Then User redirect to the Employment details tab
    And User give the inputs for emp details Employer,EmployersPhone,EmployementStatus,HowOftenareyoupaid,LastPayDate,NextPayDate,LastTakeHomePayChequeAmount,TakeHomeForTheMonthOfMay
    Then User should be save and sbmitt the details
    And User able to click on Logout
