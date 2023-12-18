package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.GenericKeywords;
import utilities.ObjectRepository.AnimationsPage;
import utilities.ObjectRepository.HomePage;

public class StartAnimationSteps extends GenericKeywords {

	@Given("^Animation design option is present$")
	public void animation_option_is_visible() throws Throwable {
		getElement(HomePage.navigation_btn).click();
		getElement(AnimationsPage.animations_btn).click();
	}

	@When("^User selects Bounce animation Option$")
	public void verify_animation_designs_are_listed() throws Throwable {
		verifyElementPresent(AnimationsPage.animations_Bounce_btn);
		getElement(AnimationsPage.animations_Bounce_btn).click();
	}

	@Then("^Verify user is able to start animation$")
	public void verify_animation_is_started() throws Throwable {
		getElement(AnimationsPage.animations_start_btn).click();
		verifyElementPresent(AnimationsPage.animation_img);
	}
}
