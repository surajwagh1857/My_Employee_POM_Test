
Feature: Test Employee data 
 


  Scenario Outline: Enter the data of employee and check it.
    Given User Launch the browser
    Given the open the given home url
    Then user enters the all credentials
    Then user Click on submit button
    Then user should on Expected page
    Examples: 
      | name  | age    | salary |address|
      | suraj |     25 | 60     |pune   |
      | komal |     22 |   50   |kolhapur|
      |sanjivani |    26|   65   |Sangli|
      | supriya |     26 |  65  |kolhapur|
      