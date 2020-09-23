package bdd.TheInternet.PageActions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;

import bdd.TheInternet.PageElements.JSfirstButtonPageLocators;
import bdd.TheInternet.utilities.SetUpDriver;
import junit.framework.Assert;

public class JSfirstButtonPageActions {

	JSfirstButtonPageLocators JSfirstButtonPageLocatorsObj;
	
	public JSfirstButtonPageActions () {
		
		JSfirstButtonPageLocatorsObj = new JSfirstButtonPageLocators();
		PageFactory.initElements(SetUpDriver.driver, JSfirstButtonPageLocatorsObj); 
		
	}
	
	public void FirstBtn (){
		JSfirstButtonPageLocatorsObj.lnkFirstBtn.click();
		
	}
	
	public void acceptAlert () throws Exception {
		
		Thread.sleep(3000);
		Alert alert = SetUpDriver.driver.switchTo().alert();
		alert.accept();
		
	}
	
	public void verify (){
		
		String confirmMsg = JSfirstButtonPageLocatorsObj.txtResult.getText();
		Assert.assertEquals(confirmMsg, "You successfuly clicked an alert");
		
	}
}
