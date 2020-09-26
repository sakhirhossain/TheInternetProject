package bdd.TheInternet.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocator {

	@FindBy (xpath="//a[contains(text(),'JavaScript Alerts')]")
	public WebElement lnkJSAlert;
	
	@FindBy(xpath="//a[contains(text(),'Entry Ad')]")
	public WebElement lnkEntryAd;
	
	
	@FindBy(xpath="//a[contains(text(),'Horizontal Slider')]")
	public WebElement lnkHorizSlider;
	
	@FindBy(xpath="//li[17]//a[1]")
	public WebElement lnkFileDwnld;
	
	@FindBy (xpath="//a[contains(text(),'File Upload')]") 
	public WebElement lnkFileUpload;
	
	@FindBy (xpath="//a[contains(text(),'Forgot Password')]")
	public WebElement lnkRetPwd;
	
	

}
