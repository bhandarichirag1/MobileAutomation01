Feature: UI Design App functionalities using Scenario
  Description: The purpose is to verify different list view design options

	@smoke
		Scenario: Verify ListView Expand
		Given ListView expand option is present
		When User selects Expand listview option
		Then Verify user is able to expand list
	 
  @regression
  Scenario Outline: Verify List search with different inputs
    Given ListView searchable option is present
    When User tries to search "<country>" through list
    Then Verify "<country>" is the output
    Examples: 
      | country |
      | India |
      | Australia |
      | China |
