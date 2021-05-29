@tag1 
Feature: Compose and Send mail 
	User will compose a mail and will send it
#
#@tag1 @tagSendMail 
#Scenario: Compose and Send mail to given email id 
#	Given User will click Compose button 
#	Then Compose email pop up will come 
#	When User will enter valid email "pragyasingh1308@gmail.com" 
#	And User will enter subject "Test subject" 
#	And User will enter body "Test body" 
#	Then User click Send button 
	
	
@tag1 @tagSendMail 
Scenario Outline: Compose and Send mail to given email id 
	Given User will click Compose button 
	Then Compose email pop up will come 
	When User will enter valid email "<Email>" 
	And User will enter subject "<Subject>" 
	And User will enter body "<Body>" 
	Then User click Send button 

Examples: 
          | Email                        | Subject   | Body |
          | pragyasinghrajput@gmail.com  | Test Sub |Test Body|
          | pragyasinghrajput13@gmail.com| Test Sub |Test Body2|
	
	
@tag1 @tagSendMail @LastTag 
Scenario: Verify mail has been sent or not 
	Given User will navigate to Sent tab 
	Then User will verify the content 
  