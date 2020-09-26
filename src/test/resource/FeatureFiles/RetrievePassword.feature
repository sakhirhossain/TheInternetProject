@regression

Feature: Retrieve forgotten password
Scenario Outline: User can retrieve a password by entering his email

Given Browses to the internet home page
When Clicks on the forgot password module
And Enter "<email>" and click on retrieve password button
Then user will get a confirmation message

Examples:
|   email     |
| abc@aol.com |