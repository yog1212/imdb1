@TV_Shows
Feature: Verify TV Shows in IMDB

  @TV_Shows
  Scenario Outline: Verify TV Shows in IMDB
    Given I open <Browser>
    And I go to loginURL   
    Then User check for TV_shows
    
    Examples: 
      |Browser |
      |Chrome|