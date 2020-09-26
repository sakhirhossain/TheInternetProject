package bdd.TheInternet.PageActions;

import java.io.File;

import org.openqa.selenium.support.PageFactory;

import bdd.TheInternet.PageElements.FileDownloadPageLocators;
import bdd.TheInternet.utilities.SetUpDriver;

public class FileDownloadPageActions {
	
	FileDownloadPageLocators FileDownloadPageLocatorsObj;
	
	public FileDownloadPageActions(){
		
		FileDownloadPageLocatorsObj = new FileDownloadPageLocators();
		PageFactory.initElements(SetUpDriver.driver, FileDownloadPageLocatorsObj);
}
public void ClickImg() throws Exception{
	Thread.sleep(2000);
	FileDownloadPageLocatorsObj.lnkFileImage.click();
}

 public boolean isFileDownloaded(String downloadPath, String fileName) throws Exception {
	 Thread.sleep(2000);
	  File dir = new File(downloadPath);
	  File[] dirContents = dir.listFiles();

	  for (int i = 0; i < dirContents.length; i++) {
	      if (dirContents[i].getName().equals(fileName)) {
	          // File has been found, it can now be deleted:
	          //dirContents[i].delete();
	    	  System.out.println("File has been found");
	          return true;
	      }
	          }
	      return false;
	  }

}


