Feature: feature to test search Funtionatility

Scenario: Validate google search is working
Given browser is open
And user o google search page
When user enters a test in a search box
And hits enter
Then user is navigated to search results
 