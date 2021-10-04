Feature: As a registered I want to use login form so that I login to the system 

Scenario: Login with valid username and password 
	Given User is in homepage 
	When Clicks on signin button 
	Then User see the n sign in page 
	And Enter username 'test_user@mailinator.com' 
	And Enter password 'abc1234' 
	And Click on sign button 
	Then User redirected to the my Account page 
	