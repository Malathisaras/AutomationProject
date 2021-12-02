package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Config_Reader {
	public WebDriver driver;
	
	
	public Config_Reader(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}


	public Config_Reader() {
		// TODO Auto-generated constructor stub
	}


	public static void particular_RowData() throws Throwable {
		System.out.println("--------------------------");
		System.out.println("Particular data");
		System.out.println("-------------------");
		File f=new File("C:\\Users\\Admin\\eclipse-workspace\\Greenproject\\Data.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		Row row = sheetAt.getRow(1);
		int pn = sheetAt.getPhysicalNumberOfRows();
		System.out.println(pn);
		Cell cell = row.getCell(0);
		CellType cellType = cell.getCellType();
		
		if(cellType.equals(cellType.STRING))
		{
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);		
		}
		else if(cellType.equals(cellType.NUMERIC))
		{
			double numericCellValue = cell.getNumericCellValue();
			int value= (int) numericCellValue;
			System.out.println(value);
		}	}}	
	
//	public String getURL() {
//		
//		
//		String url=p.getProperty("url");
//		return url;
//}
//	public String getUsername()
//	{
//		
//		String username = p.getProperty("Email");
//		
//		return username;
//	}
//	public String getPassword() {
//		String password = p.getProperty("Password");
//		return password;
//
//	}

