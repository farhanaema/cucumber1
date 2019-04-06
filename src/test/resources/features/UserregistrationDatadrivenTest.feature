#Sample Feature Definition Template
@tag
Feature: Testing the Datadriven
	I want to use this template for my feature file

@tag1
Scenario Outline: Testing the user registration with multiple userids
 		Given Navigate to the Mercury flight application
    When Click on Register Link
    And  Enter "<username>" and "<password>" and "<confirmpassword>"
    And  click on submit
		Then I verify the "<username>" creation
		And Close the appliaction
Examples:
    |username  |password | confirmpassword |
    |test1     |test123  |  test123|
    |test2     |hello    |   hello |   