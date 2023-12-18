package StepDefinitions;

import java.text.SimpleDateFormat;
import java.util.Date;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.GenericKeywords;
import utilities.ObjectRepository.HomePage;
import utilities.ObjectRepository.PickerPage;

public class PickerSteps extends GenericKeywords {

	@Given("^Picker option is present$")
	public void picker_option_is_visible() throws Throwable {
		getElement(HomePage.navigation_btn).click();
		getElement(PickerPage.picker_txt).click();
		verifyElementPresent(PickerPage.picker_customDate_btn);
	}

	@When("^User proceeds with selected date$")
	public void user_proceeds_with_selected_date() throws Throwable {
		getElement(PickerPage.picker_customDate_btn).click();
		getElement(PickerPage.picker_Done_btn).click();
	}

	@Then("^Verify current date is picked$")
	public void verify_date_selected_is_current() throws Throwable {
		SimpleDateFormat simpleformat = new SimpleDateFormat("d");
		String date = simpleformat.format(new Date());
		verifyOutput(date);
	}

	@And("^Verify current month is picked$")
	public void verify_month_selected_is_current() throws Throwable {
		SimpleDateFormat simpleformat = new SimpleDateFormat("MMMM");
		String month = simpleformat.format(new Date());
		verifyOutput(month.toUpperCase());
	}

	@And("^Verify current year is picked$")
	public void verify_year_selected_is_current() throws Throwable {
		SimpleDateFormat simpleformat = new SimpleDateFormat("yyyy");
		String year = simpleformat.format(new Date());
		verifyOutput(year);
	}
}
