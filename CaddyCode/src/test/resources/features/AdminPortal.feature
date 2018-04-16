Feature: Registred user to login to Admin Page to setup the admin storage data
	
	@Test
	Scenario: Login to Admin Portal	
	Given User navigates to the Admin Page	
	And   User provides the valid username and password
	When  User performs sign operation
	Then  User navigates to Admin homepage  
	
	@Test
	Scenario: Login to Admin Portal	with different user
	Given User navigates to the Admin Page	
	And   User provides the valid username and password
	When  User performs sign operation
	Then  User navigates to Admin homepage  
	
	