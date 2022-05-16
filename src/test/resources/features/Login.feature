@Login
Feature: Login
  As a user
  I want to login
  So that I can buy product
#mvn clean verify -Dtags="@DDT"
  @DDT
  Scenario Outline: Login scenario
    Given I am on the home page
    And I click login button
    When I input "<email>" email
    And I input "<password>" password
    And I click again login button
    Then I get the "<result>"
    Examples:
      |email|password|result|
      |test|test|home page|
      |tast|test|record not found|
      |test|tist|email or password is invalid|
      |tust|tost|record not found|