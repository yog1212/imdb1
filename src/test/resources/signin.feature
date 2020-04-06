@TV_Shows
Feature: Verify New Account Signin in IMDB

  @TV_Shows
  Scenario Outline: Verify New Account Signin in IMDB
    Given I open <Browser>
    And I go to loginURL   
    Then User click on Signin and Create New Account with <name> and <email> and <password>
    
    Examples: 
      |Browser |name|email|password|
      |Chrome|Test|Test|Test|