@Transaction
Feature: Transaction
  As a user
  I want to order
  So that I can see Transaction Page
#mvn clean verify -Dtags="@DDT"

  Scenario: Transaction added successfully
    Given I am on the home page
    And I click login button
    And I input valid data
    And I click again login button
    When I click buy product
    And I click order
    Then I click paid
    And I check total transaction

  Scenario: Product on transaction doesnt add up
    Given I am on the home page
    And I click login button
    And I input valid data
    And I click again login button
    When I click login button
    And I click transaction button
    Then I check total transaction

  Scenario: Change rows per page and change page
    Given I am on the home page
    And I click login button
    And I input valid data
    And I click again login button
    When I click buy 10 product
    And I click order
    And I click paid
    Then I validate product appreas
    And I click rows per page button
    And I click number 5 button
    And I click arrow button right
    And I click arrow button left