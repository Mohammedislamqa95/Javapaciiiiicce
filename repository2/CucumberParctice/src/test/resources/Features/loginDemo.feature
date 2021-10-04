Feature: login demo

Scenario: Successful Login with valid Credentials
	Given User Launch Chrome browser
	When User Opens URL "http://admin-demo.nopcommerce.com/login"
	And User enters Email as "admin@yourstore.com" and Password as "admin"
	And Click on Login
	Then Page Title should be "Dashboard / nopCommerce administration"
	When User click on Log out Link
	Then Page Title should be "Your store. Login"
	And Close browser