Feature: UI Design App functionalities using Scenario
  Description: The purpose is to verify different popup menu options

  @regression
  Scenario Outline: Verify Popup menu options
    Given Popup option is present
    When User click on popup menu
    Then Verify "<popupMenuOption>" is present
    Examples: 
      | popupMenuOption |
      | Play |
      | Add to Playlist |
      | Search |
