package bdd.TheInternet.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JSalertPageLocators {

	@FindBy (xpath="//button[contains(text(),'Click for JS Prompt')]")
	public WebElement lnkPrompt;
	
	@FindBy (xpath="//p[@id='result']")
	public WebElement txtResult;
	
	
}
