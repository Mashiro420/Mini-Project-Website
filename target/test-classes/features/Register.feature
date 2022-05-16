@Register
Feature: Register
  As a user
  I want to register
  So that I can create account
#mvn clean verify -Dtags="@DDT"
  @DDT
  Scenario Outline: Register Scenario
    Given I am on the home page
    And I click login button
    And I click linked text register
    When I input "<username>" username
    And I input an "<email>" email
    And I input "<password>" password
    And I click register button
    Then I get the "<result>"
    Examples:
      |username|email|password|result|
      |test|new|test|login page|
      |    |test|test|fullname is required|
      |test|    |test|email is required|
      |test|test|    |password is required|
      |    |    |test|email is required|
      |test|    |    |email is required|
      |    |test|    |password is required|
      |    |    |    |email is required|