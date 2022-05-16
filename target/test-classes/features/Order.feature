@Order
Feature: Order
  As a user
  I want to buy
  So that I can see Order Page
#mvn clean verify -Dtags="@DDT"

  Scenario: Order success
    Given I am on the home page
    And I click login button
    And I input valid data
    And I click again login button
    When I click buy product
    And I click order
    Then I click paid
    And I check the result

  Scenario: Order empty
    Given I am on the home page
    When I click buy product
    And I click order
    And I click minus button
    Then I check order result

  Scenario: Paid need login first
    Given I am on the home page
    When I click buy product
    And I click order
    Then I click paid
    And I asked to login

  Scenario: Click order without buying
    Given I am on the home page
    When I click order
    Then I check order result