package bdd.TheInternet.PageActions;

import org.openqa.selenium.support.PageFactory;

import bdd.TheInternet.PageElements.VerifyModelWindowLocator;
import bdd.TheInternet.utilities.SetUpDriver;

public class VerifyModelWindowAction {

	VerifyModelWindowLocator VerifyModelWindowLocatorobj;
	
	
	public VerifyModelWindowAction(){
		
		VerifyModelWindowLocatorobj = new VerifyModelWindowLocator();
		PageFactory.initElements(SetUpDriver.driver, VerifyModelWindowLocatorobj);
		
		
	}
	
	
	
	public void VerifyTxt(){
		
		
		  String s1=VerifyModelWindowLocatorobj.gettxt.getText();
		  System.out.println(s1);
		
		
		
	}
	
}
