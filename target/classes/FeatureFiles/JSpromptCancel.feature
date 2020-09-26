@regression 
Feature: Cancel Click for JS prompt alert
 
Scenario: User can cancel Click for JS prompt alert
    
    Given Browse to  http://the-internet.herokuapp.com Homepage
    When Click on the JavaScript Alerts link
    And Click on Click for JS Prompt button
    And Dismiss prompt alert
    Then Verify  result confirmation is null
    
    


 