#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Test Demo site Login
  I want to use this template for my feature file

  Scenario Outline: Verification if login with Entering number of creadentials
  Given User launched chrome browser
  And  User opens Demosite
    When user enters <name>
    And user enters <value> 
     And user enters <value> 
    Then user enters<status> 
    Then user on Expected page

    Examples: 
      | name  | value | status  |Address
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
