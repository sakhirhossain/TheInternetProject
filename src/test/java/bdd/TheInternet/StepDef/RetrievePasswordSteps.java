package bdd.TheInternet.StepDef;

import bdd.TheInternet.PageActions.HomePageActions;
import bdd.TheInternet.PageActions.RetrievePassPageActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RetrievePasswordSteps {
	
	HomePageActions HomePageActionsObj = new HomePageActions();
	RetrievePassPageActions RetrievePassPageActionsObj = new RetrievePassPageActions();
	
	@Given("^Browses to the internet home page$")
	public void browses_to_the_internet_home_page() throws Throwable {
		HomePageActionsObj.HomePage();
	}

	@When("^Clicks on the forgot password module$")
	public void clicks_on_the_forgot_password_module() throws Throwable {
		HomePageActionsObj.retrievePass();
	}

	@When("^Enter \"([^\"]*)\" and click on retrieve password button$")
	public void enter_and_click_on_retrieve_password_button(String email) throws Throwable {
		RetrievePassPageActionsObj.PutEmail(email);
		RetrievePassPageActionsObj.ClickRetrievePassword();
	}

	@Then("^user will get a confirmation message$")
	public void user_will_get_a_confirmation_message() throws Throwable {
		RetrievePassPageActionsObj.verify();
	    
	}

}
