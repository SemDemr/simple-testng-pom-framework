package com.hrm.testbase;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;
	static String url = "https://www.saucedemo.com/";

	@Before
	public void setUp() {
		// WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@After
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

}
