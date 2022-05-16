@Buy
Feature: Buy
  As a user
  I want to buy product
  So that I can see added product on Order Page
#mvn clean verify -Dtags="@DDT"
  @DDT
  Scenario Outline: Buy product
    Given I am on the home page
    When I click "<buy>"
    Then I get bubble icon "<result>"
    Examples:
      |buy|result|
      |one|1|
      |two|2|
      |three|3|

  @CancelCategory
  Scenario: Cancel Selecting Category
    Given I am on the home page
    When I click category
    And I click a category from the list
    Then I cancel selecting a category

  @CategoryNegative
  Scenario: Chose Category Not Found
    Given I am on the home page
    When I click category
    And I click Kesehatan
    Then I get product not found