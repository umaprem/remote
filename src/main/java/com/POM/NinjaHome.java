package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testBase.baseClass;

public class NinjaHome extends baseClass {

	public NinjaHome() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "twotabsearchtextbox" )
	private WebElement searchBox;
	
	@FindBy(id="input-firstname")
	private WebElement firstName;
	
	
	@FindBy(id="input-lastname")
	private WebElement lastName;
	
	@FindBy(id="input-email")
	private WebElement email;
	
	@FindBy(id="input-telephone")
	private WebElement tele;
	
	
	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getTele() {
		return tele;
	}
	
	
}


 