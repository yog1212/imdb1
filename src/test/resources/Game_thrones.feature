@TV_Shows
Feature: Verify Game Throne Search in IMDB

  @TV_Shows
  Scenario Outline: Verify Game Throne Search in IMDB
    Given I open <Browser>
    And I go to loginURL   
    Then User check Search for <keyword>
    
    Examples: 
      |Browser |keyword|
      |Chrome|Game of thrones|