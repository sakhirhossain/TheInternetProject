package bdd.TheInternet.StepDef;

import bdd.TheInternet.PageActions.HSliderPageActions;
import bdd.TheInternet.PageActions.HomePageActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HorizontalSliderSteps {
	
	HomePageActions HomePageActionsObj = new HomePageActions();
	HSliderPageActions HSliderPageActionsObj = new HSliderPageActions();
	
	@Given("^User browses to The Internet homepage$")
	public void user_browses_to_The_Internet_homepage() throws Throwable {
		HomePageActionsObj.HomePage();
	}

	@When("^User navigates to the horizontal slider module$")
	public void user_navigates_to_the_horizontal_slider_module() throws Throwable {
		HomePageActionsObj.HorizontalSlider();
	}

	@When("^Set the slider by sliding it horizontally$")
	public void set_the_slider_by_sliding_it_horizontally() throws Throwable {
		HSliderPageActionsObj.slide();
	}

	@Then("^user can see the value he is indicating to$")
	public void user_can_see_the_value_he_is_indicating_to() throws Throwable {
		HSliderPageActionsObj.verify();
	}

}
