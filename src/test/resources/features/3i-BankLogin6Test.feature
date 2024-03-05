@POM
Feature: Verify the Login function of 3i-Bank

  @tag1
  Scenario: Login functionality of 3i-Bank screen
    Given User should able to navigate Login screen
    And User given the credentails for username,passwors and creditcard
    Then User click on Login button in login page

  @tag2
  Scenario: Home page functionality of 3i-Bank screen
    Given User should able to home page screen
    And User click on ApplyNow button in homepage
    Then User navigate to PCRA page
    And click on check box and agree button

  @tag3
  Scenario: Personal details tab functionality of 3i-Bank screen
    Given User should able to Personal details page
    And User enter the inputs for FirstName,LastName,DateOfBirth,PANNumber,MobileNumber,Email
    Then User click on save and submitt 
    And click on OK button on personal details tab
    
    @tag4
  Scenario: Employment details tab functionality of 3i-Bank screen
    Given User should able to Emplyment details page
    And User enter the inputs for Employer,EmployersPhone,EmployementStatus,HowOftenareyoupaid,LastPayDate,NextPayDate,LastTakeHomePayChequeAmount,TakeHomeForTheMonthOfMay
    Then User click on save and submitt on employ tab
    And click on OK button on employ details tab
    
   @tag5
  Scenario: Logout functionality of 3i-Bank screen
    Given User able to Logout
    And User click on profile
    Then User able logout the button
    
