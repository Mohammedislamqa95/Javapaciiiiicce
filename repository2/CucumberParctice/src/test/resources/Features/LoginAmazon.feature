Feature: user able to login with valid user name and password
Scenario: User login with valid username and verify the page title

Given User can open any browser
And User enter the URL

When User able to click on login Button
And User enter the username 
And User can enter the password
And user able to click Submit button

Then User able to verify succesful login
And User can see name and homepage
