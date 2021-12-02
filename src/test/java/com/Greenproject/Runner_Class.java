package com.Greenproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;



public class Runner_Class extends Base_Class {
	
	//private static final String value = null;
	public static WebDriver driver=Base_Class.getBrowser("chrome");//-----null
	public static Page_Object_Manager pom=new Page_Object_Manager(driver);
	static Logger log=Logger.getLogger(Runner_Class.class);
	
		public static void main(String[] args) throws Throwable  {
			
		PropertyConfigurator.configure("log4j.properties");
		log.info("Automation Practice process Starting");
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getURL();
		getURL(url);	
		driver.manage().window().maximize();		
		click(pom.gethp().getSignin_Btn());	
		String username=particular_Data("C:\\Users\\Admin\\eclipse-workspace\\Greenproject\\Data.xlsx",1,0);
		
		//String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUsername();
		inputValueElement(pom.getlp().getEmail(),username);
		//String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();
		String password=particular_Data("C:\\Users\\Admin\\eclipse-workspace\\Greenproject\\Data.xlsx",1,1);
		inputValueElement(pom.getlp().getPassword(),password);	
		clickOnElement(pom.getlp().getSignin_Btn());
		moveToElement(pom.getwp().getWomen());
		moveToElement(pom.getwp().getTshirt());
		clickOnElement(pom.getwp().getTshirt());		
		moveToElement(pom.gettp().getSelshirt());
		clickOnElement(pom.gettp().getSelshirt());
		Thread(3000); 
		moveToElement(pom.getcp().getSubmit());
		Thread(1000);
		clickOnElement(pom.getcp().getSubmit());
		Thread(4000);		
		moveToElement(pom.getcheck().getCheck());
		Thread(2000);
		clickOnElement(pom.getcheck().getCheck());
		Thread(3000);	
		clickOnElement(pom.getsp().getSummary());
		Thread(2000);
		clickOnElement(pom.getpp().getProceed());
		clickOnElement(pom.getap().getCgv());
		clickOnElement(pom.getshipping().getShipping());
		clickOnElement(pom.getpay().getPayment());
		clickOnElement(pom.getconfirm().getConfirm());
		log.info("Automation Practice process complete");
		quit();		
	}

		
		}
