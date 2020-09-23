package bdd.TheInternet.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JSfirstButtonPageLocators {

	@FindBy (xpath="//button[contains(text(),'Click for JS Alert')]")
	public WebElement lnkFirstBtn;
	
	@FindBy (xpath="//p[@id='result']")
	public WebElement txtResult;
	
}
