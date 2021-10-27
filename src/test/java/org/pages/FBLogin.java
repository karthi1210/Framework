package org.pages;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLogin extends BaseClass{
	
	@FindBy(id = "email")
	private WebElement txtUser;
	
	@FindBy(id = "pass")
	private WebElement txtPass;
	
	@FindBy(xpath = "//button[@name='login']")
	private WebElement btn;
	
	
	public WebElement getTxtUser() {
		return txtUser;
	}




	public WebElement getTxtPass() {
		return txtPass;
	}




	public WebElement getBtn() {
		return btn;
	}




	public FBLogin() {
		
		PageFactory.initElements(driver, this);
		
	}

}
