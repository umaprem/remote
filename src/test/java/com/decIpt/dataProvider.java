package com.decIpt;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.POM.PageObjectManager;
import com.testBase.baseClass;

public class dataProvider extends baseClass {
		
		PageObjectManager po = new PageObjectManager();
		
	   @BeforeMethod
	   public void homePage() {
		   browserlaunch("chrome");
	       launchurl("https://tutorialsninja.com/demo/index.php?route=account/register");
	   }
	   
	   
	   @Test(dataProvider = "data", dataProviderClass = Readexceldata.class)
	   public void fields(String username,String pass)  {
		   thread_Sleep(10000);
			inputvalues(po.getNinjaHome().getFirstName(),username);
	        inputvalues(po.getNinjaHome().getLastName(),pass);
	        thread_Sleep(10000);
	   }
	   @AfterMethod
	   public void closeBrowser() {
	 	  close_browser();
	   }
	  }




