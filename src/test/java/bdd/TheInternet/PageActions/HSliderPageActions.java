package bdd.TheInternet.PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import bdd.TheInternet.PageElements.HSliderPageLocator;
import bdd.TheInternet.utilities.SetUpDriver;

public class HSliderPageActions {
	
	HSliderPageLocator HSliderPageLocatorObj;
	
	public HSliderPageActions(){
		
		HSliderPageLocatorObj = new HSliderPageLocator();
		PageFactory.initElements(SetUpDriver.driver, HSliderPageLocatorObj);
		
	}
	
	public void slide () throws Exception{
		
		Thread.sleep(2000);
		
		WebElement slider = SetUpDriver.driver.findElement(By.xpath("//div[@class='sliderContainer']//input"));
		Actions action = new Actions(SetUpDriver.driver);
		action.dragAndDropBy(slider, 2, 0).perform();
	}
	
	public void verify(){
		
		WebElement element = SetUpDriver.driver.findElement(By.xpath("//span[@id='range']"));
		String text = element.getText();
		System.out.println("Text obtained is " + text); 

	
	}

}
