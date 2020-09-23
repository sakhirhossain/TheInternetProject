package bdd.TheInternet.StepDef;

import bdd.TheInternet.PageActions.HomePageActions;
import bdd.TheInternet.PageActions.JSalertCancelPageActions;
import bdd.TheInternet.PageActions.JSalertPageActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JSpromptCancelSteps {
	
	HomePageActions HomePageActionsObj = new HomePageActions();
	JSalertPageActions JSalertPageActionsObj = new JSalertPageActions();
	JSalertCancelPageActions JSalertCancelPageActionsObj = new JSalertCancelPageActions();
	
	/* @Given("^Browse to  http://the-internet\\.herokuapp\\.com Homepage$")
	public void browse_to_http_the_internet_herokuapp_com_Homepage() throws Throwable {
		HomePageActionsObj.HomePage();
	}

	@When("^Click on the JavaScript Alerts link$")
	public void click_on_the_JavaScript_Alerts_link() throws Throwable {
		HomePageActionsObj.clickJSprompt();
	}

	@When("^Click on Click for JS Prompt button$")
	public void click_on_Click_for_JS_Prompt_button() throws Throwable {
		JSalertPageActionsObj.prompt();
	} */
	
	
	@When("^Dismiss prompt alert$")
	public void dismiss_prompt_alert() throws Throwable {
		JSalertCancelPageActionsObj.dismissPrompt();
	}

	@Then("^Verify  result confirmation is null$")
	public void verify_result_confirmation_is_null() throws Throwable {
		JSalertCancelPageActionsObj.verifyNull();
	}

}
