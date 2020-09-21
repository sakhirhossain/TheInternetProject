package bdd.TheInternet.StepDef;

import bdd.TheInternet.PageActions.HomePageActions;
import bdd.TheInternet.PageActions.JSalertPageActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JSpromptSteps {
	
	HomePageActions HomePageActionsObj = new HomePageActions();
	JSalertPageActions JSalertPageActionsObj = new JSalertPageActions();
	
	
	@Given("^Browse to  http://the-internet\\.herokuapp\\.com Homepage$")
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
	}

	@When("^Insert \"([^\"]*)\" on textbox and accepts prompt alert$")
	public void insert_on_textbox_and_accepts_prompt_alert(String data) throws Throwable {
		JSalertPageActionsObj.input(data);
	}

	

	@Then("^Verify  result confirmation matches \"([^\"]*)\"$")
	public void verify_result_confirmation_matches(String data) throws Throwable {
	    
		JSalertPageActionsObj.validation(data);
	}

}
