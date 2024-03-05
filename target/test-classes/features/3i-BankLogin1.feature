@LoginDD
Feature: Verift the Login functionality of the 3i-Bank with valid data

  Scenario Outline: Login functionality of the 3i-Bank with valid data
    Given User navigate to 3i-Bank Loginpage
    When User enter the user name as "<username>",password as "<password>" , creditcardno as "<creditcard>" and click on login button
    And Click on Apply Now button
    Then PICRA screen will displayed
    And Click on I agree button and Agree&Continue button
    And user enter the personal details as  "<FirstName>","<LastName>","<DOB>","<PAN NO>","<Mobileno>","<Email>"
    And click on save and submitt the details
    And Click on OK and next button
    Then User navigate Employement detail page
    And User enter the Employement details as "<Employer>","<Employer Phone>","<Employment status>","<How Often are you paid?>","<Last Pay Date>","<Next Pay Date>","<Last Take Home Pay Cheque Amount>","<Take Home For The Month Of May>"
    And click on save and submitt the Employement details
    Then click on log out button

    Examples: 
      | username | password | creditcard | FirstName | LastName | DOB        | PAN NO | Mobileno   | Email                | Employer | Employer Phone | Employment status | How Often are you paid? | Last Pay Date | Next Pay Date | Last Take Home Pay Cheque Amount | Take Home For The Month Of May |
      | Test     | Test@123 |       1254 | Testleo   | ALLex    | 07/31/1993 | 123456 | 8374027476 | demoleo@yopmail.cpom | Jose     |     8754321876 | Approved          | Last Day Of The Month   | 01/27/2024    | 02/27/2024    |                              100 |                            100 |
