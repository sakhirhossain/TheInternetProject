package bdd.TheInternet.PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import bdd.TheInternet.PageElements.FileUploadLocators;
import bdd.TheInternet.utilities.SetUpDriver;
import junit.framework.Assert;

public class FileUploadActions {

FileUploadLocators FileUploadLocatorsObj;
	
	public FileUploadActions(){
		
		FileUploadLocatorsObj=new FileUploadLocators();
		PageFactory.initElements(SetUpDriver.driver, FileUploadLocatorsObj);
	
	
	}
	
	public void clickChooseFile() throws Exception{
		
		Thread.sleep(2000);
				
		WebElement chooseFile = SetUpDriver.driver.findElement(By.xpath("//input[@id='file-upload']"));
		chooseFile.sendKeys("C:/Users/12404/Pictures/mountain.jpg");
		}
	
		
	public void clickUpload() throws Exception{
		Thread.sleep(2000);
		FileUploadLocatorsObj.clkUploadFile.click();
	}
	
	public void verify() throws Exception{
		
		Thread.sleep(2000);
		String confirmMsg = FileUploadLocatorsObj.txtVerify.getText();
		Assert.assertEquals(confirmMsg, "File Uploaded!");
		
	}

}
