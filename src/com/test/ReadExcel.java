package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.testng.annotations.Test;

public class ReadExcel {
	
	@Test(enabled=true)
	public void ReadXLS() throws Exception {
		File file = new File("C:\\prod\\SeleniumTest\\src\\resources\\file_example_XLS_50.xls");
		FileInputStream fis = new FileInputStream(file);
		Workbook workbook = new HSSFWorkbook(fis);
		workbook.setActiveSheet(1);
		Sheet sheet =  workbook.getSheet("Sheet1");
		Sheet sheet2 =  workbook.getSheetAt(1);
		System.out.println(workbook.getSheetName(0));
		System.out.println(workbook.getSheetName(1));
	   System.out.println("ROWS COUNT  "+ sheet.getLastRowNum());
	   System.out.println("col  "+ sheet2.getLastRowNum());
	
		for(int i=0;i<sheet.getLastRowNum()+1;i++) {
			Row row = sheet.getRow(i);
			for(int j=0;j<row.getLastCellNum();j++) {
				System.out.println(row.getCell(4));
			}
		}
		
	}
	
	
	@Test(enabled=false)
	public void ReadXLSX() throws Exception {
		File file1 = new File("C:\\prod\\SeleniumTest\\src\\resources\\file_example_XLSX_10.xlsx");
		FileInputStream fis1 = new FileInputStream(file1);
		XSSFWorkbook workbook1 = new XSSFWorkbook(fis1);
		Sheet sheet1 = workbook1.getSheet("Sheet1");
		
		System.out.println();
		System.out.println(sheet1.getLastRowNum());
		for(int i=0;i<1;i++) {
			Row row = sheet1.getRow(i);
			
			for(int j=0;j<row.getLastCellNum();j++) {
				System.out.println(row.getCell(j));
			}
		}
	}

	
	@Test(enabled=false)
	public void WriteXLSX() throws Exception {
		String write[] = {"1","ac","bc","cd","ef","Gh","hi","2"};
		File file1 = new File("C:\\prod\\SeleniumTest\\src\\resources\\file_example_XLSX_10.xlsx");
		FileInputStream fis1 = new FileInputStream(file1);
		XSSFWorkbook workbook1 = new XSSFWorkbook(fis1);
		Sheet sheet1 = workbook1.getSheet("Sheet1");
		
		System.out.println();
		System.out.println(sheet1.getLastRowNum());
	    Row row = sheet1.getRow(0);
		
	    Row newRow = sheet1.createRow(sheet1.getLastRowNum()+1);
	    for(int i=0;i<row.getLastCellNum();i++) {
	    Cell cell = newRow.createCell(i);
	    cell.setCellValue(write[i]);
	    }
		fis1.close();
	    FileOutputStream fos = new FileOutputStream("C:\\prod\\SeleniumTest\\src\\resources\\file_example_XLSX_10.xlsx");
	    workbook1.write(fos);
	    fos.close();
	}
	
	@Test(enabled=false)
	public void WriteXLS() throws Exception {
		String write[] = {"1","ac","bc","cd","ef","Gh","hi","2"};
		File file = new File("C:\\prod\\SeleniumTest\\src\\resources\\file_example_XLSX_10.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook workbook = new HSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet("Sheet1");
		 
		for(int i = 0 ; i< sheet.getLastRowNum(); i++) {
			Row row = sheet.getRow(i);
			for(int j = 0 ; j< row.getLastCellNum(); j++) {
				System.out.println(row.getCell(j));
			}
		}
	
	    	Row row = sheet.createRow(sheet.getLastRowNum()+1);
	        for(int i = 0 ; i<row.getLastCellNum(); i++) {
	        	Cell cell = row.createCell(i); 
	        		cell.setCellValue(write[i]);
	        }
	        fis.close();
	        FileOutputStream fos = new FileOutputStream("");
	        workbook.write(fos);
	        fos.close();
	}

}

