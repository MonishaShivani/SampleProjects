package org.test;

import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.LoginPojo;
import org.testing.SampleBaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample extends SampleBaseClass {

	@BeforeClass
	public static void browserSetup() {
		
		browser();		
	}
	@AfterClass
		public static void closerBrowser() {
		browserClose();

		}
 @Before
 public  void startTime() {
	 Date d = new Date();
	 System.out.println(d);
 }
	@After
	public void endTime() {
		 Date d = new Date();
		 System.out.println(d);
	}
	@Test
	public void testCase22() throws IOException {
		urlLaunch("https://en-gb.facebook.com/");
		String pageurl = driver.getCurrentUrl();
		System.out.println(pageurl);
		LoginPojo l = new LoginPojo();
		enterDetails(l.getUserText(),getData(2,0));
		enterDetails(l.getUserPassWord(),getData(2,1));
		enterClick(l.getLoginButton());
		

	}
}
