
Feature: Test Demosite login
  
    Scenario Outline: Varification of login page using number of credentials
    
    Given User launch the chrome browser
    And User opened Demosite URL
    When User enters Username "<name>",Age "<age>",Salary "<salary>" and Address "<address>"
    And User clicks on Submit button
    Then Data Shuold be added in database

    Examples: 
      | name   | age  |salary| address |
      | Sandesh|   31 | 45000|  Mumbai |
      | Sayali |   30 |      |  Goa    |
      | Prasad |   29 | 35000|         |
      | Suraj  |   28 | 30000|kolhapur |
      
 