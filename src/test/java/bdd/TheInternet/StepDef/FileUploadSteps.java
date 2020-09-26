package bdd.TheInternet.StepDef;

import bdd.TheInternet.PageActions.FileUploadActions;
import bdd.TheInternet.PageActions.HomePageActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FileUploadSteps {

	HomePageActions HomePageActionsObj= new HomePageActions();
	FileUploadActions FileUploadActionsObj=new FileUploadActions();
	
	
	
	
	@Given("^Browse to \"([^\"]*)\"$")
	public void browse_to(String arg1) throws Throwable {
		HomePageActionsObj.HomePage();
	}

	@When("^Click on File Upload$")
	public void click_on_File_Upload() throws Throwable {
		HomePageActionsObj.clickFileUpload();
	}

	@When("^Click on Choose File$")
	public void click_on_Choose_File() throws Throwable {
		FileUploadActionsObj.clickChooseFile();
	}

	@When("^click upload button$")
	public void click_upload_button() throws Throwable {
		FileUploadActionsObj.clickUpload();
	}

	@Then("^verify file has been uploaded$")
	public void verify_file_has_been_uploaded() throws Throwable {
		FileUploadActionsObj.verify();
	}


}
