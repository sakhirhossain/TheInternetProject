package bdd.TheInternet.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocator {

	@FindBy (xpath="//a[contains(text(),'JavaScript Alerts')]")
	public WebElement lnkJSAlert;
}
