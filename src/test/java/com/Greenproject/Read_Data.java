package com.Greenproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {
	public static void main(String[] args) throws Throwable
	{
		particular_Data();
		particular_columnData();
		particular_RowData();
		All_Data();
	}
	public static void particular_Data() throws Throwable {
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
		}		
}

	public static void particular_columnData() throws Throwable
	{
		System.out.println("--------------------------");
		System.out.println("particular column data");
		System.out.println("-------------------------");
		File f=new File("C:\\Users\\Admin\\eclipse-workspace\\Greenproject\\Data.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fis);
		Sheet sheet = w.getSheetAt(0);
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		
		for(int i=0;i<physicalNumberOfRows;i++)
		{
			Row row = sheet.getRow(i);
			int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			Cell cell = row.getCell(1);
			CellType cellType = cell.getCellType();
			if(cellType.equals(CellType.STRING))
			{
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);	
			}
			else if(cellType.equals(cellType.NUMERIC))
			{
				double numericCellValue = cell.getNumericCellValue();
				int value= (int) numericCellValue;
				System.out.println(value);
			}
		}}
		
	public static void particular_RowData() throws Throwable {
		System.out.println("--------------------------");
		System.out.println("particular Row data");
		System.out.println("--------------------------");
		File f=new File("C:\\Users\\Admin\\eclipse-workspace\\Greenproject\\Data.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fis);
		Sheet sheet = w.getSheetAt(0);
		Row row = sheet.getRow(0);
		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
		
		for(int i=0;i<physicalNumberOfCells;i++)
		{
			Cell cell = row.getCell(i);
			CellType cellType = cell.getCellType();
			if(cellType.equals(CellType.STRING))
			{
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);	
			}
			else if(cellType.equals(cellType.NUMERIC))
			{
				double numericCellValue = cell.getNumericCellValue();
				int value= (int) numericCellValue;
				System.out.println(value);
			}}}

			
		
	public static void All_Data() throws Throwable {
		System.out.println("--------------------------");
		System.out.println("All Data");
		System.out.println("------------------------");
		File f=new File("C:\\Users\\Admin\\eclipse-workspace\\Greenproject\\Data.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		int NumberOfRows = sheetAt.getPhysicalNumberOfRows();
		for(int i=0;i<NumberOfRows;i++)
		{
			Row row = sheetAt.getRow(i);
			int numberOfCells = row.getPhysicalNumberOfCells();
			for(int j=0;j<numberOfCells;j++)
			{
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				if(cellType.equals(CellType.STRING))
				{
					String Value = cell.getStringCellValue();
					System.out.println(Value);		
				}
				else if(cellType.equals(cellType.NUMERIC))
				{
					double numericCellValue = cell.getNumericCellValue();
					int value= (int) numericCellValue;
					System.out.println(value);
	
		}
			}
	
		
		}
	}
	
}
	
