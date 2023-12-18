Feature: UI Design App functionalities using Scenario
  Description: The purpose is to verify custom date picker
   
   @smoke
		Scenario: Verify default selected date is current
		Given Picker option is present
		When User proceeds with selected date
		Then Verify current date is picked
		And Verify current month is picked
		And Verify current year is picked