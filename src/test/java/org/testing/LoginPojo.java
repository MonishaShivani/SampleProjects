package org.testing;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends SampleBaseClass{
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='email']")
	private WebElement userText;
	@FindBy(id="pass")
	private WebElement userPassWord;
	@FindBy(xpath = "//button[@name='login']")
	private WebElement loginButton;
	public WebElement getUserText() {
		return userText;
	}
	public WebElement getUserPassWord() {
		return userPassWord;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	

}
