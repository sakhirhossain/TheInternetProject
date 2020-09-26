package bdd.TheInternet.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileDownloadPageLocators {
	
	@FindBy (xpath="//a[contains(text(),'some-file.txt')]")
	public WebElement lnkFileImage;

	
}
