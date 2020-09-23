package bdd.TheInternet.StepDef;

import bdd.TheInternet.PageActions.HomePageActions;
import bdd.TheInternet.PageActions.JSfirstButtonPageActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JSalertSteps {
	
	HomePageActions HomePageActionsObj = new HomePageActions();
	JSfirstButtonPageActions JSfirstButtonPageActionsObj = new JSfirstButtonPageActions();

	@Given("^Browse to the internet\\.herokuapp website$")
	public void browse_to_the_internet_herokuapp_website() throws Throwable {
		HomePageActionsObj.HomePage();
	}

	@When("^Click on the JavaScript Alert module$")
	public void click_on_the_JavaScript_Alert_module() throws Throwable {
		HomePageActionsObj.clickJSprompt();
	}

	@When("^Click on Click for JS alert button$")
	public void click_on_Click_for_JS_alert_button() throws Throwable {
		JSfirstButtonPageActionsObj.FirstBtn();
	}

	@When("^Click on Ok button to confirm$")
	public void click_on_Ok_button_to_confirm() throws Throwable {
		JSfirstButtonPageActionsObj.acceptAlert();
	}

	@Then("^Verify that alert button is sucessfully accepted$")
	public void verify_that_alert_button_is_sucessfully_accepted() throws Throwable {
		JSfirstButtonPageActionsObj.verify();
		
	}


	
}

