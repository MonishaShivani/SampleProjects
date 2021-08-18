package org.test;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.LoginPojo;
import org.testing.SampleBaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTestNG extends SampleBaseClass {
	
	@BeforeClass
	private void browserSetup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		browser();
		
	}
	@AfterClass
	public static void closerBrowser() {
		browserClose();

		}
@BeforeMethod
public  void startTime() {
	 Date d = new Date();
	 System.out.println(d);
}
@AfterMethod
public  void endTime() {
	 Date d = new Date();
	 System.out.println(d);
}

@Test(priority=15)
private void testcase1() throws InterruptedException, IOException {
	urlLaunch("https://en-gb.facebook.com/");
	String pageurl = driver.getCurrentUrl();
	System.out.println(pageurl);
	LoginPojo l = new LoginPojo();
	enterDetails(l.getUserText(),getData(1,0));
	enterDetails(l.getUserPassWord(),getData(1,2));
	enterClick(l.getLoginButton());
	Thread.sleep(2000);

}
@Test(priority=-13)
private void testcase2() throws IOException, InterruptedException {
	urlLaunch("https://en-gb.facebook.com/");
	String pageurl = driver.getCurrentUrl();
	System.out.println(pageurl);
	LoginPojo l = new LoginPojo();
	enterDetails(l.getUserText(),getData(2,0));
	enterDetails(l.getUserPassWord(),getData(2,2));
	enterClick(l.getLoginButton());
	Thread.sleep(2000);

}
	@Test(priority=-20)
	private void testcase3() throws InterruptedException, IOException {
		urlLaunch("https://en-gb.facebook.com/");
		String pageurl = driver.getCurrentUrl();
		System.out.println(pageurl);
		LoginPojo l = new LoginPojo();
		enterDetails(l.getUserText(),getData(3,0));
		enterDetails(l.getUserPassWord(),getData(3,2));
		enterClick(l.getLoginButton());
		Thread.sleep(2000);

	}
	@Test(priority=7)
	private void testcase4() throws InterruptedException, IOException {
		urlLaunch("https://en-gb.facebook.com/");
		String pageurl = driver.getCurrentUrl();
		System.out.println(pageurl);
		LoginPojo l = new LoginPojo();
		enterDetails(l.getUserText(),getData(3,0));
		enterDetails(l.getUserPassWord(),getData(3,2));
		enterClick(l.getLoginButton());
		Thread.sleep(2000);

	}
}



