package bdd.TheInternet.PageActions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;

import bdd.TheInternet.PageElements.JSalertPageLocators;
import bdd.TheInternet.utilities.SetUpDriver;
import junit.framework.Assert;

public class JSalertCancelPageActions {
	
	JSalertPageLocators JSalertPageLocatorsObj;
	
	public JSalertCancelPageActions () {
		
		JSalertPageLocatorsObj = new JSalertPageLocators();
		PageFactory.initElements(SetUpDriver.driver, JSalertPageLocatorsObj);
	}

	public void dismissPrompt() {
		Alert prompt  = SetUpDriver.driver.switchTo().alert();
		prompt.dismiss();
		
	}
	
	public void verifyNull () {
		
		String confirmMsg = JSalertPageLocatorsObj.txtResult.getText();
		Assert.assertEquals(confirmMsg, "You entered: null");
	}
}
