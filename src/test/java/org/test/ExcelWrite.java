package org.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	public static void main(String[] args) throws IOException {
		File f = new File("D:\\Eclipse\\Framework\\ExcelWrite\\ExcelWrite.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet sheet = w.createSheet("USERS");
		Row row= sheet.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("Vicky");
		Row row1= sheet.createRow(1);
		Cell cell1 = row1.createCell(1);
		cell1.setCellValue("Jansi");
		FileOutputStream fout = new FileOutputStream(f);
		w.write(fout);
		
	}

}
