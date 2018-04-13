Feature: Test Facebook Smoke Scenario

	@Test1
	Scenario: Test Login gmail with valid Credentials 
		Given Open Firefox and start Application
		When I enter Valid User Name and password 
		Then User should be able to login sucessfully
		
	@Test
	Scenario: SignupLanding Page for the new user
	Given User navigates to the Landing Page
	When  User perfrom SignUp operation
	Then  User navigates the landing signup page
	When  User insert the signup information
	And   User perform GetstartedNow operation
	Then  User verify welcome to 6Strorage page
	
	@Test
	Scenario: Login to Admin Portal
	
	Given User navigates to the Admin Page	
	And   User provides the valid username and password
	When  User performs sign operation
	Then  User navigates to Admin homepage  
	
	
	