@LoginEx1
Feature: Verift the Login functionality of the 3i-Bank with valid Excel data

  Scenario Outline: Login in functionality of 3i Bank application
    Given User navigate to 3i login screen
    When User fills from given sheetname "<SheetName>" and rownumber as"<RowNumber>"
    And User should be click on login button
    Then User should be redirect to home page
    And user click on ApplyNow button in home page
    Then click on checkbox and agree buttonon PICRA page
    And user will provide personal details from sheetname "<SheetName>" and rownumber as"<RowNumber>"
    Then User should be click on save and submitt the details
    And User give the inputes from sheetname "<SheetNmme>", and rownumber as"<RowNumber>"
    Then User able to click on save and submitt the details
    And click on profile and logout the button
    
    Examples: 
    
    |SheetName|RowNumber|
    |Login|0|
    |Login|1|
    |login|2|
    
    
     
     
     
     
     
     
      #
    #@home
  #Scenario: Home page functionality of 3i bank
    #Given user navigate to home page
    #And user click on ApplyNow button in home page
    #Then Usernavigate to PICRA screen
    #And user click on checkbox and agree button
    #
    #
    
    
    

  
    