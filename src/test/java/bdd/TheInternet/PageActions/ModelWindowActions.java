package bdd.TheInternet.PageActions;

import org.openqa.selenium.support.PageFactory;


import bdd.TheInternet.PageElements.ModelWindowLocator;

import bdd.TheInternet.utilities.SetUpDriver;


public class ModelWindowActions {
	
	ModelWindowLocator ModelWindowLocatorobj;
	
	
	public ModelWindowActions(){
		
		ModelWindowLocatorobj = new ModelWindowLocator();
		PageFactory.initElements(SetUpDriver.driver, ModelWindowLocatorobj);
		
		
	}
	
	

	public void handlepopup() throws InterruptedException{
		

		
	
//		   String s1= SetUpDriver.driver.findElement(By.className("modal-title")).getText();
//		   System.out.println(s1);
		   
		  Thread.sleep(3000);
		 // SetUpDriver.driver.findElement(By.xpath("//p[contains(text(),'Close')]")).click();	;	  
		  
		  
		  ModelWindowLocatorobj.lnkclosepopup.click();
	
	}
	}

