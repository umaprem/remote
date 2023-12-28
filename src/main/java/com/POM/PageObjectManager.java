package com.POM;

import org.openqa.selenium.support.PageFactory;

import com.testBase.baseClass;

public class PageObjectManager extends baseClass {
	
	public void pageobjectmanager() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	private NinjaHome nh;
	 public NinjaHome getNinjaHome() {
		nh = new NinjaHome();
		return nh;
	}

}
