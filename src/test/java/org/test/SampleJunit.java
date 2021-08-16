package org.test;

import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.LoginPojo;
import org.testing.SampleBaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;


public class SampleJunit extends SampleBaseClass{
	@BeforeClass
	public static void browserSetup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
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

public void testCase1() throws IOException, InterruptedException {
	urlLaunch("https://en-gb.facebook.com/");
	String title = driver.getTitle();
	System.out.println(title);
	//Assert.assertTrue("Verify Title", title.contains("facebook"));
	Assert.assertTrue(false);
	LoginPojo l = new LoginPojo();
	
	
	//Assert.assertEquals("Verify email", "JAVA", attribute);
	enterDetails(l.getUserText(),getData(1,0));
	enterDetails(l.getUserPassWord(),getData(1,1));
	enterClick(l.getLoginButton());
	Thread.sleep(2000);
	
	
}
@Ignore
@Test
public void testCase2() throws IOException, InterruptedException {
	urlLaunch("https://en-gb.facebook.com/");
	String pageurl = driver.getCurrentUrl();
	System.out.println(pageurl);
	LoginPojo l = new LoginPojo();
	enterDetails(l.getUserText(),getData(2,0));
	enterDetails(l.getUserPassWord(),getData(2,1));
	enterClick(l.getLoginButton());
	Thread.sleep(2000);

}
	
}
