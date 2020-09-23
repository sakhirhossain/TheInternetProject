@regression
Feature: Confirm JS Alert
Scenario: User will be able to confirm JS Alert

Given Browse to the internet.herokuapp website
When Click on the JavaScript Alert module
And Click on Click for JS alert button
And Click on Ok button to confirm
Then Verify that alert button is sucessfully accepted