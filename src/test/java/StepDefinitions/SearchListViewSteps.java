package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.GenericKeywords;
import utilities.ObjectRepository.HomePage;
import utilities.ObjectRepository.ListViewPage;

public class SearchListViewSteps extends GenericKeywords {

	@Given("^ListView searchable option is present$")
	public void listView_option_is_visible() throws Throwable {
		getElement(HomePage.navigation_btn).click();
		getElement(ListViewPage.listView_txt).click();
		verifyElementPresent(ListViewPage.listView_Searchable_btn);
	}

	@When("^User tries to search \"([^\"]*)\" through list$")
	public void verify_animation_designs_are_listed(String countryName) throws Throwable {		
		getElement(ListViewPage.listView_Searchable_btn).click();
		getElement(ListViewPage.listView_Search_inputTxt).click();
		getElement(ListViewPage.listView_Search_inputTxt).sendKeys(countryName);
	}

	@Then("^Verify \"([^\"]*)\" is the output$")
	public void verify_animation_is_started(String countryName) throws Throwable {
		verifyOutput(countryName);
	}
}
