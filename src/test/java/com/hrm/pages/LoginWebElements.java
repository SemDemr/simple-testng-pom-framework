package com.hrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrm.testbase.BaseClass;

public class LoginWebElements extends BaseClass {

	@FindBy(id = "user-name")
	public WebElement username;

	@FindBy(id = "password")
	public WebElement password;

	@FindBy(css = "input#login-button")
	public WebElement loginBtn;

	public LoginWebElements() {
		PageFactory.initElements(driver, this);
	}

}
