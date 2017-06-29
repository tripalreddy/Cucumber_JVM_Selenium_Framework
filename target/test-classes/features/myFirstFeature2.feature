Feature: POC for BDD using Selenium java with cucumber-jvm Parameter handling

  Scenario: Scenario1
    Given go to Google.com site
    When enter test keyword "james"
    And click Enter key
    Then Verify Search results page
    Then closebrowser

  Scenario: Scenario2
    Given go to Google.com site
    When enter test keyword "bond"
    And click Enter key
    Then Verify Search results page
    Then closebrowser
