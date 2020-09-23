package bdd.TheInternet.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JSConfirmPageLocators {
	
	@FindBy(xpath="//button[contains(text(),'Click for JS Confirm')]")
	public WebElement lnkJSConfirm;
	
	@FindBy(xpath="//p[@id='result']")
	public WebElement txtResults;


}
