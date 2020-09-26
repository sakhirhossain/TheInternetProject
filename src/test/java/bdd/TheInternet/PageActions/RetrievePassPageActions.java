package bdd.TheInternet.PageActions;

import org.openqa.selenium.support.PageFactory;

import bdd.TheInternet.PageElements.RetrievePassPageLocators;
import bdd.TheInternet.utilities.SetUpDriver;
import junit.framework.Assert;

public class RetrievePassPageActions {
	
	RetrievePassPageLocators RetrievePassPageLocatorsObj;
	
	public RetrievePassPageActions(){
		
		RetrievePassPageLocatorsObj =new RetrievePassPageLocators();	
	PageFactory.initElements(SetUpDriver.driver, RetrievePassPageLocatorsObj);
	}
	
	public void PutEmail(String email){
			RetrievePassPageLocatorsObj.lnkputEmail.sendKeys(email);
	}
	
	public void ClickRetrievePassword() throws Exception{
		Thread.sleep(2000);
		RetrievePassPageLocatorsObj.lnkclickRetriveButton.click();
	}
	
	public void verify() throws Exception{
		Thread.sleep(2000);
		String confirmMsg = RetrievePassPageLocatorsObj.lnkVerify.getText();
		Assert.assertEquals(confirmMsg, "Your e-mail's been sent!");
		
	}

	

}
