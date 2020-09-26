@regression
Feature: File Upload
Scenario: User able to upload a file

Given Browse to "https://the-internet.herokuapp.com/"
When Click on File Upload
And Click on Choose File
And click upload button
Then verify file has been uploaded 
