package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
public static void main(String[] args) throws IOException {
	File f = new File("D:\\Eclipse\\Framework\\ExcelRead\\ExcelSample1xlsx.xlsx");
	FileInputStream fin = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(fin);
	Sheet sheet = w.getSheet("Users");
	for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		Row row = sheet.getRow(i);
		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
			Cell cell = row.getCell(j);
			int cellType = cell.getCellType();
			if (cellType==1) {
				String stringValue = cell.getStringCellValue();
				System.out.println(stringValue);
			}
			else if (cellType==0) {
				if (DateUtil.isCellDateFormatted(cell)) {
					Date dateValue = cell.getDateCellValue();
					SimpleDateFormat s = new SimpleDateFormat("MM-dd-yyyy");
					String value = s.format(dateValue);
					System.out.println(value);
				}
				
			
			else {
				double d = cell.getNumericCellValue();
				long l = (long)d;
				String value = String.valueOf(l);
				System.out.println(value);
			}	
			}
		}
		
	}
	
	
	
}
}
