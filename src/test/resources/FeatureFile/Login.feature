Feature: To validate the Login functionality of facebook Application

Scenario Outline:
To validate login by using different credentials
	Given user have enter into facebook page in chrome browser
	When User enter "<username>" and "<password>"
	And User click the Login button
	Then User should be in invalid credential page
	Examples:
	|username								|password |
	|java123@gmail.com			|java123	|
	|selenium123@gmail.com	|sele123	|
	|phython123@gmail.com		|phyton123|
	|jira123@gmail.com			|jira123	|
	
	
Scenario:
	To validate Login using invalid username and password

	Given user have enter into facebook page in chrome browser
	When User enter invalid user name and invalid password
	And User click the Login button
	Then User should be in invalid credential page
	
	Scenario:
	To validate Login using valid username and password
	
	Given user have enter into facebook page in chrome browser
	When User enter valid user name and invalid password
	And User click the Login button
	Then User should be in invalid credential page