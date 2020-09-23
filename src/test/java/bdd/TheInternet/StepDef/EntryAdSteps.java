package bdd.TheInternet.StepDef;

import bdd.TheInternet.PageActions.HomePageActions;
import bdd.TheInternet.PageActions.ModelWindowActions;
import bdd.TheInternet.PageActions.VerifyModelWindowAction;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EntryAdSteps {
	
	HomePageActions HomePageActionsObj = new HomePageActions();
	ModelWindowActions ModelWindowActionsObj = new ModelWindowActions();
	VerifyModelWindowAction VerifyModelWindowActionObj = new VerifyModelWindowAction();
	
	@Given("^User Browses to http://the-internet\\.herokuapp\\.com$")
	public void user_Browses_to_http_the_internet_herokuapp_com() throws Throwable {
		HomePageActionsObj.HomePage();
	}

	@When("^User navigates to Entry Ad$")
	public void user_navigates_to_Entry_Ad() throws Throwable {
		HomePageActionsObj.ClickEntryAD();
	}

	@When("^User clicks on close button$")
	public void user_clicks_on_close_button() throws Throwable {
		ModelWindowActionsObj.handlepopup();
	}

	@Then("^Verify Display message \"([^\"]*)\"$")
	public void verify_Display_message(String arg1) throws Throwable {
		VerifyModelWindowActionObj.VerifyTxt();
	}

}
