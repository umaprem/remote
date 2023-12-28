package com.decIpt;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.Format;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Readexceldata {
	
	@DataProvider(name="data")
	public static Object[][]Readexceldata() throws IOException  {
	File file = new File("C:\\Users\\91831\\Desktop\\dec27.12.xlsx");
	FileInputStream fi = new FileInputStream(file);
	Workbook book =new XSSFWorkbook(fi);
	Sheet sheet = book.getSheet("data");
	int lastRowNum = sheet.getLastRowNum();
	System.out.println("Row count:"+lastRowNum);
	short lastCellNum = sheet.getRow(0).getLastCellNum();	
	System.out.println("Cell count:"+lastCellNum);
	
	Object[][]data = new Object[lastRowNum][lastCellNum];
	
	for (int i=1; i<=lastRowNum; i++) {
		
		for (int j=0; j<lastCellNum; j++) {
			Cell cell = sheet.getRow(i).getCell(j);
			DataFormatter format= new DataFormatter();
			data[i-1][j] = format.formatCellValue(cell);
			
		}
		
	}
	return data;	
	}

}
