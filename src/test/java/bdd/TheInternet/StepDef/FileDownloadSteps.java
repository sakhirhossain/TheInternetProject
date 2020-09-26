package bdd.TheInternet.StepDef;

import bdd.TheInternet.PageActions.FileDownloadPageActions;
import bdd.TheInternet.PageActions.HomePageActions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FileDownloadSteps {
	
	HomePageActions  HomePageActionsObj =new  HomePageActions();
	FileDownloadPageActions FileDownloadPageActionsObj = new FileDownloadPageActions();
	
	@Given("^Browse to the internet home page$")
	public void browse_to_the_internet_home_page() throws Throwable {
		HomePageActionsObj.HomePage();
	}
	
	@When("^User Click on File Download$")
	public void user_Click_on_File_Download() throws Throwable {
		HomePageActionsObj.FileDownload();
	}

	@When("^User Click on text document module$")
	public void user_Click_on_text_document_module() throws Throwable {
		FileDownloadPageActionsObj.ClickImg();
		}
	
	@Then("^User can verify File has been downloaded Successfully$")
		public void user_can_verify_File_has_been_downloaded_Successfully() throws Throwable {
		
		FileDownloadPageActionsObj.isFileDownloaded("C:/Users/12404/Downloads","some-file.txt");
	}	
}


