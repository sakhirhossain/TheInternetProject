package bdd.TheInternet.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RetrievePassPageLocators {
	
	@FindBy(xpath="//input[@id='email']")
	public WebElement lnkputEmail;
	
	@FindBy(xpath="//i[contains(text(),'Retrieve password')]")
	public WebElement lnkclickRetriveButton;
	
	@FindBy(xpath="//div[@id='content']")
	public WebElement lnkVerify;
	
	}
