package bdd.TheInternet.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileDownloadPageLocators {
	
	@FindBy (xpath="//a[contains(text(),'logo.png')]")
	public WebElement lnkFileImage;

	
}
