package bdd.TheInternet.StepDef;

import bdd.TheInternet.PageActions.HomePageActions;
import bdd.TheInternet.PageActions.JSConfirmPageActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JSconfirmSteps {
	HomePageActions HomePageActionsObj = new HomePageActions();
	JSConfirmPageActions JSConfirmPageActionsObj = new JSConfirmPageActions();

	@Given("^user browses to https://the-internet\\.herokuapp\\.com homepage$")
	public void user_browses_to_https_the_internet_herokuapp_com_homepage() throws Throwable {
		HomePageActionsObj.HomePage();
	}

	@When("^user clicks on JavaScript Alerts link$")
	public void user_clicks_on_JavaScript_Alerts_link() throws Throwable {
		HomePageActionsObj.clickJSprompt();
	}

	@When("^user clicks on JS Confirm button$")
	public void user_clicks_on_JS_Confirm_button() throws Throwable {
		JSConfirmPageActionsObj.clickJSConfirmButton();
	}

	@When("^user click on Ok button$")
	public void user_click_on_Ok_button() throws Throwable {
		JSConfirmPageActionsObj.input();
	}

	@Then("^user will be able to verify results for click for JS Confirm$")
	public void user_will_be_able_to_verify_results_for_click_for_JS_Confirm() throws Throwable {
		JSConfirmPageActionsObj.results();
	}


	
}
