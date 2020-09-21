@regression 
Feature: Confirm Click for JS prompt alert
 
Scenario Outline: User can confirm Click for JS prompt alert
    
    Given Browse to  http://the-internet.herokuapp.com Homepage
    When Click on the JavaScript Alerts link
    And Click on Click for JS Prompt button
    And Insert "<data>" on textbox and accepts prompt alert
    Then Verify  result confirmation matches "<data>"
    
Examples:
    
    | data  |
    | abc12 |
   

 