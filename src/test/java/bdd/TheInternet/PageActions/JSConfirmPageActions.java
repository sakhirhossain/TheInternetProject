package bdd.TheInternet.PageActions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;

import bdd.TheInternet.PageElements.JSConfirmPageLocators;
import bdd.TheInternet.utilities.SetUpDriver;
import junit.framework.Assert;

public class JSConfirmPageActions {
	
	JSConfirmPageLocators JSConfirmPageLocatorsObj;
	
	public JSConfirmPageActions(){
		JSConfirmPageLocatorsObj = new JSConfirmPageLocators();
		PageFactory.initElements(SetUpDriver.driver, JSConfirmPageLocatorsObj);
	}
	
	public void clickJSConfirmButton() throws InterruptedException{
		Thread.sleep(3000);
		JSConfirmPageLocatorsObj.lnkJSConfirm.click();
	}
	
	public void input()  throws Exception{
	
	Alert promptAlert = SetUpDriver.driver.switchTo().alert();
	System.out.println(promptAlert.getText());
	promptAlert.accept(); 
		
		
	Thread.sleep(3000);
	}
	
	public void results() throws Exception{
		String confirmMsg = JSConfirmPageLocatorsObj.txtResults.getText();
		Assert.assertEquals(confirmMsg, "You clicked: Ok");
		Thread.sleep(2000);
	}


}
