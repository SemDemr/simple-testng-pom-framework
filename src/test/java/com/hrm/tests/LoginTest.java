package com.hrm.tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.hrm.pages.LoginWebElements;
import com.hrm.testbase.BaseClass;

public class LoginTest extends BaseClass{

	@Test
	public void loginTest() throws IOException{
		LoginWebElements login = new LoginWebElements();
		
		login.username.sendKeys("problem_user");
		login.password.sendKeys("secret_sauce");
		login.loginBtn.click();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(srcFile, new File("screenshots/login.png"));

	}
	
}
