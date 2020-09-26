package bdd.TheInternet.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileUploadLocators {
	
	@FindBy (xpath="//input[@id='file-upload']")    
	public WebElement lnkChooseFile;
	
	
	@FindBy  (xpath="//input[@id='file-submit']")  
	public WebElement clkUploadFile;
	

	@FindBy  (xpath="//h3[contains(text(),'File Uploaded!')]")  
	public WebElement txtVerify;

}
