package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.GenericKeywords;
import utilities.ObjectRepository.HomePage;
import utilities.ObjectRepository.ListViewPage;

public class ExpandListViewSteps extends GenericKeywords {

	@Given("^ListView expand option is present$")
	public void listView_option_is_visible() throws Throwable {
		getElement(HomePage.navigation_btn).click();
		getElement(ListViewPage.listView_txt).click();
		verifyElementPresent(ListViewPage.listView_Expand_btn);
	}

	@When("^User selects Expand listview option$")
	public void verify_listview_expand_button_is_present() throws Throwable {
		getElement(ListViewPage.listView_Expand_btn).click();
	}

	@Then("^Verify user is able to expand list$")
	public void verify_list_is_expanded() throws Throwable {
		getElement(ListViewPage.listView_Expand_list0_txt).click();
		verifyElementPresent(ListViewPage.listView_Expand_Demo1_txt);
	}
}
