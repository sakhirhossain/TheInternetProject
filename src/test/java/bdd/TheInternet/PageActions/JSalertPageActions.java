package bdd.TheInternet.PageActions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;

import bdd.TheInternet.PageElements.JSalertPageLocators;
import bdd.TheInternet.utilities.SetUpDriver;
import junit.framework.Assert;

public class JSalertPageActions {
	
	JSalertPageLocators JSalertPageLocatorsObj ;
	
	public JSalertPageActions () {
		
		JSalertPageLocatorsObj = new JSalertPageLocators ();
		PageFactory.initElements(SetUpDriver.driver, JSalertPageLocatorsObj);
		
	}
	
	public void prompt () throws Exception{
		
		Thread.sleep(3000);
		
		JSalertPageLocatorsObj.lnkPrompt.click();
	}
	
	public void input (String data) throws Exception {
		
		Thread.sleep(2000);
		
		// This step will result in an alert on screen
	//	   WebElement element = SetUpDriver.driver.findElement(By.id("I am a JS prompt"));
		//   ((JavascriptExecutor) SetUpDriver.driver).executeScript("arguments[0].click()", element);
		  Alert promptAlert  = SetUpDriver.driver.switchTo().alert();
		  String alertText = promptAlert.getText();
		  System.out.println("Alert text is " + alertText);
		  //Send some text to the alert
		   promptAlert.sendKeys(data);
		   promptAlert.accept();
		
/*		WebElement we=SetUpDriver.driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
		we.click();
		JavascriptExecutor js = (JavascriptExecutor)SetUpDriver.driver;
		js.executeScript("arguments[0].value='Test';", we); */
		
		
		
	//	SetUpDriver.driver.findElement(By. name("uid")).sendKeys("abc123");
		
//	JavascriptExecutor js = (JavascriptExecutor) SetUpDriver.driver;
	//js.executeScript ("document.getElementsByName('xyz')[0].focus()");
	//	js.executeScript("document.getElementsByName('p')[0].value='ABC'"); 
		
	//	js.executeScript("document.getElementById('p').value='asf';"); 
	}

/*	public void clickOK () throws Exception {
		
		Thread.sleep(2000);
		
		WebElement element = SetUpDriver.driver.findElement(By.id("OK")); 
		JavascriptExecutor executor = (JavascriptExecutor)SetUpDriver.driver; 
		executor.executeScript("arguments[0]. click();", element);
	}
*/	
	public void validation (String data){
		
		String confirmMsg = JSalertPageLocatorsObj.txtResult.getText();
		Assert.assertEquals(confirmMsg, "You entered: " + data);
	// Assert.assertEquals(confirmMsg, data); 	
		
		
		
	}
}
