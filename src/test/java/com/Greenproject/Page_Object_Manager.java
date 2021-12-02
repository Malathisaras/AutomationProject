package com.Greenproject;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import com.helper.Config_Reader;

public class Page_Object_Manager {
	public WebDriver driver;
	private Home_Page hp;
	private Login_Page lp;
	private Women_Page wp;
	private T_Shirt_Page tp;
	private Cart_Page cp;
	private Check_Page check;
	private Summary_Page sp;
	private Proceed_Page pp;
	private Address_Page ap;
	private Shipping_Page shipping;
	private Payment_Page pay;
	private Confirm_Page confirm;
	private Config_Reader reader;

	public Config_Reader getReader() {
		if(reader==null)
		{
			reader=new Config_Reader(driver);
		}
		return reader;
	}
	public Page_Object_Manager(WebDriver driver2) {
		this.driver=driver2;
	}
	public Home_Page gethp() {
		if(hp==null)
		{
			hp=new Home_Page(driver);
		}
		return hp;
	}
public Login_Page getlp() {
	if(lp==null)
	{
		lp=new Login_Page(driver);
	}
	return lp;
}

public Women_Page getwp() {
	if(wp==null) {
		wp=new Women_Page(driver);
		}
	return wp;
}
public T_Shirt_Page gettp() {
	if(tp==null) {
		tp=new T_Shirt_Page(driver);
	}
	return tp;
}
public Cart_Page getcp() {
	if(cp==null) {
		cp=new Cart_Page(driver);
	}
	return cp;
}
public Check_Page getcheck() {
	if(check==null) {
		check=new Check_Page(driver);
	}
	return check;
}
public Summary_Page getsp() {
	if(sp==null) {
		sp=new Summary_Page(driver);
	}
	return sp;
}
public Proceed_Page getpp() {
	if(pp==null) {
		pp=new Proceed_Page(driver);
	}
	return pp;
}
public Address_Page getap() {
	if(ap==null) {
		ap=new Address_Page(driver);
	}
	return ap;
}
public Shipping_Page getshipping() {
	if(shipping==null) {
		shipping=new Shipping_Page(driver);
	}
	return shipping;
}

public Confirm_Page getconfirm() {
	if(confirm==null) {
		confirm=new Confirm_Page(driver);
	}
	return confirm;
}
public Payment_Page getpay() {
	if(pay==null) {
		pay=new Payment_Page(driver);
	}
	return pay;
}

}