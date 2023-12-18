package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.GenericKeywords;
import utilities.ExtentReport.ExtentTestManager;
import utilities.ObjectRepository.HomePage;

public class Hooks extends GenericKeywords {
	@Before
    public void beforeScenario(io.cucumber.java.Scenario scenario){
        System.out.println("Starting scenario execution");
		ExtentTestManager.startTest(scenario.getName());
		executeDriver();
		verifyElementPresent(HomePage.playOn_btn);
		getElement(HomePage.playOn_btn).click();
    }	
	
	@After
    public void afterScenario(){
        System.out.println("Scenario executed successfully");
        closeDriver();
    }
}
