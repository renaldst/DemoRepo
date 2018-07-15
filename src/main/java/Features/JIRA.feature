Feature: JIRA Ticket Creation

Scenario: Create a Formatting ticket in JIRA

	Given user opens browser 
	When user is on JIRA homepage 
	Then enters username and password
	Then user clicks on Submit button
	Then clicks on Create button to create JIRA ticket
	Then user enters information for JIRA ticket
	Then user creates JIRA ticket
	
