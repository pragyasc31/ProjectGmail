@tag1 
Feature: Login to Gmail account 
	User with right credential should be able to login into gmail account

@tag1 @tagLogin 
Scenario: Login to Gmail account using correct credentials 
	Given User navigates to gmail login page 
	# And User will click Sign in button
	And User will enter valid username "seleniumt59@gmail.com" 
	When User click Next button 
	And User will enter valid password "Sel@1test" 
	When User click Next button to Sign in 
	Then User should be logged in to the account successfully 
	
    