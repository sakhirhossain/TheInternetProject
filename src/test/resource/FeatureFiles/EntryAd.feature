@regression
Feature: Entry Ad
Scenario: close the popup window.

Given User Browses to http://the-internet.herokuapp.com
When User navigates to Entry Ad
And User clicks on close button
Then Verify Display message "Entry Ad"