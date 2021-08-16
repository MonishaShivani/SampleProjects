package org.testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleBaseClass {
	public static WebDriver driver;
	public static void browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	public static void urlLaunch(String url) {
		driver.get(url);
	}
	public static void pageMaximize() {
		driver.manage().window().maximize();
	}
	public static void siteTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public static void currentUrl() {
		String pageurl = driver.getCurrentUrl();
		System.out.println(pageurl);
	}
	public static void enterDetails(WebElement ele,String s) {
		ele.sendKeys(s);
	}
	public static void enterClick(WebElement ele) {
		ele.click();
	}
	public static void browserClose() {
		driver.close();

	}
//	public static void screenShot(String name) throws IOException {
//		TakesScreenshot t = (TakesScreenshot)driver;
//		File source = t.getScreenshotAs(OutputType.FILE);
//		File dest = new File("D:\\Eclipse\\Framework\\screenshot\\"+name+".jpg");
//		FileUtils.copyFile(source, dest);
//		}
	public static String getData(int rowNumber, int columnNumber) throws IOException {
		File f = new File("D:\\Eclipse\\Framework\\ExcelRead\\ExcelSample1xlsx.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet sheet = w.getSheet("Users");
		
		Row row = sheet.getRow(rowNumber);
		Cell cell = row.getCell(columnNumber);
		int cellType = cell.getCellType();
		String value="";
		if (cellType==1) {
			value = cell.getStringCellValue();
			
		}
		else if (cellType==0) {
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateValue = cell.getDateCellValue();
				SimpleDateFormat s = new SimpleDateFormat("MM-dd-yyyy");
				value = s.format(dateValue);
				
			}
			else {
				double d = cell.getNumericCellValue();
				long l = (long)d;
			value = String.valueOf(l);
				
			}		

	}
		return value;

	}	

}

