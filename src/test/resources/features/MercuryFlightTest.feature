#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
@tag
Feature: Testing the Merucry flight application features

  @tag1
  Scenario: Testing the Register functionality
    Given Navigate to the Mercury flight application
    When Click on Register Link
    Then Register Page displayed
    And Close the appliaction

  @tag1
  Scenario: Testing the user Registration functionality
    Given Navigate to the Mercury flight application
    When Click on Register Link
    And Enter Valid details and submit
    Then User should create
    And Close the appliaction 