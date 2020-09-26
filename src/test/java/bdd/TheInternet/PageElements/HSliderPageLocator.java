package bdd.TheInternet.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HSliderPageLocator {
	
	@FindBy (xpath="//div[@class='sliderContainer']//input")
	public WebElement lnkSlider;
	
	//span[@id='range']
	@FindBy (xpath="//span[@id='range']")
	public WebElement txtResult;
	

}
