Feature: User needs to sign up the 6Landing page to get the login credentials

	@Test
	Scenario: SignupLanding Page for the new user
	Given User navigates to the Landing Page
	When  User perfrom SignUp operation
	Then  User navigates the landing signup page
	When  User insert the signup information
	Then  User verify welcome to 6Strorage page
	
	
	
	