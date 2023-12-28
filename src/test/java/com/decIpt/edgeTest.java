package com.decIpt;


import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.POM.PageObjectManager;
import com.testBase.baseClass;

public class edgeTest extends baseClass{
	
	PageObjectManager po = new PageObjectManager();
	
	  @Test(groups = "edge")
	  public void Page() {
	  browserlaunch("edge");
	  launchurl("https://tutorialsninja.com/demo/index.php?route=account/register");
	  }
	  
	  @Parameters({"firstname","lastname"})
	  @Test(groups = "edge")
	  public void stepfield(String firstname, String lastname) {
	     inputvalues(po.getNinjaHome().getFirstName(),firstname);
	     inputvalues(po.getNinjaHome().getLastName(),lastname);
	     thread_Sleep(5000);
		}
	  
	 
	 @Test(groups = "edge")
	 public void closeBrowser() {
		  close_browser();
	 }

	

	}
	 
