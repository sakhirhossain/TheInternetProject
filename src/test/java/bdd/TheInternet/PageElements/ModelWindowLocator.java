package bdd.TheInternet.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ModelWindowLocator {

	
	@FindBy(xpath="//p[contains(text(),'Close')]")
	public WebElement lnkclosepopup;


}
