package com.Greenproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Base_Class {
public static WebDriver driver;
static String value;
	public static WebDriver getBrowser(String type)
	{
		if(type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe");
	driver=new ChromeDriver();
			
		}
		else if(type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("User.dir")+"//Driver//geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		return driver;
	}
	public static void clickOnElement(WebElement element) throws InterruptedException  {
		Thread.sleep(2000);
		element.click();
		
	}
	public static void inputValueElement(WebElement element,String value) {
		element.sendKeys(value);
		
	}
	public static void getURL(String url) {
		driver.get(url);
		
	}
	
	public static void close() {
		driver.close();
		
		
	}
	public static void quit() {
		driver.quit();
	}
	
	public static void moveToElement(WebElement element){
		Actions a=new Actions(driver);
		a.moveToElement(element).build().perform();
		
	}
	public static void click(WebElement element)
	{
		Actions a=new Actions(driver);
		a.click(element).build().perform();	
	}
	public static void Thread(int value) throws InterruptedException
	{
		Thread.sleep(value);
	}
	public static String particular_Data(String path, int i, int j) throws Throwable {
		File f=new File(path);
		FileInputStream fis=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		Row row = sheetAt.getRow(i);
		//int pn = sheetAt.getPhysicalNumberOfRows();
		//System.out.println(pn);
		Cell cell = row.getCell(j);
		CellType cellType = cell.getCellType();
		
		
		
		if(cellType.equals(cellType.STRING))
		{
			String stringCellValue = cell.getStringCellValue();
			//System.out.println(stringCellValue);	
			value=cell.getStringCellValue();
		}
		else if(cellType.equals(cellType.NUMERIC))
		{
			double numericCellValue = cell.getNumericCellValue();
			int val= (int) numericCellValue;
			//System.out.println(value);
			value=String.valueOf(val);
		}		
		return value;
	}

	}
