package com.decIpt;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.POM.PageObjectManager;
import com.testBase.baseClass;

public class chromeTest extends baseClass {
	
	PageObjectManager po = new PageObjectManager();
	
   @Test(priority = 1)
   public void homePage() {
	   browserlaunch("chrome");
       launchurl("https://tutorialsninja.com/demo/index.php?route=account/register");
   }
   
   @Parameters({"firstnmae","lastname"})
   @Test(priority = 2)
   public void fields(String firstname , String lastname) {
		inputvalues(po.getNinjaHome().getFirstName(),firstname);
        inputvalues(po.getNinjaHome().getLastName(),lastname);
	}
   
   
  @Test(priority = 3)
  public void closeBrowser() {
	  close_browser();
  }
  
}
  
  

   
    

