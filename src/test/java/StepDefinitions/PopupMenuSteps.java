package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.GenericKeywords;
import utilities.ObjectRepository.HomePage;
import utilities.ObjectRepository.PopupPage;

public class PopupMenuSteps extends GenericKeywords {

	@Given("^Popup option is present$")
	public void popup_option_is_visible() throws Throwable {
		getElement(HomePage.navigation_btn).click();
		getElement(PopupPage.popup_txt).click();
		verifyElementPresent(PopupPage.popup_menu_btn);
	}

	@When("^User click on popup menu$")
	public void verify_animation_designs_are_listed() throws Throwable {
		getElement(PopupPage.popup_menu_btn).click();
		getElement(PopupPage.popup_showPopup_btn).click();
	}

	@Then("^Verify \"([^\"]*)\" is present$")
	public void verify_animation_is_started(String popupMenuOption) throws Throwable {
		verifyOutput(popupMenuOption);
	}
}
