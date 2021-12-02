package com.Greenproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_data {
public static void main(String[] args) throws Throwable {
	Write_Particularcell();

}	
public static void Write_Particularcell() throws Throwable {
	System.out.println("Write Particular Cell");
	System.out.println("--------------------");
	File f=new File("C:\\Users\\Admin\\Desktop\\Data.xlsx");
	FileInputStream fis=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(fis);
	Sheet createSheet = w.createSheet("Credentials");
	Row createRow = createSheet.createRow(0);
	Cell createCell = createRow.createCell(0);
	createCell.setCellValue("Email");
	w.getSheet("Credentials").getRow(0).createCell(1).setCellValue("Password");
	w.getSheet("Credentials").createRow(1).createCell(0).setCellValue("malukannan16@gmail.com");
	w.getSheet("Credentials").getRow(1).createCell(1).setCellValue("124");
	w.getSheet("Credentials").createRow(2).createCell(0).setCellValue("krishkannan16@gmail.com");
	w.getSheet("Credentials").getRow(2).createCell(1).setCellValue("hello");
	FileOutputStream fos=new FileOutputStream(f);
	w.write(fos);
	w.close();
	System.out.println("write succesfully");
	
	
}
}
