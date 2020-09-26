
@regression
Feature: Confirm Click for JS confirm alert 

Scenario: User can accept confirm alert

Given user browses to https://the-internet.herokuapp.com homepage
When user clicks on JavaScript Alerts link
And user clicks on JS Confirm button
And user click on Ok button
Then user will be able to verify results for click for JS Confirm