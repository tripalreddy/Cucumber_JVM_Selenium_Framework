Feature: POC for BDD using Selenium java with cucumber-jvm

@Sanity
  Scenario: my google search project
    Given I navigate to Google.com website
    When I enter search keyword
    And I click Enter button
    Then Search results page is displayed
