package com.Greenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
public WebDriver driver;//-----null

@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")

private  WebElement signin_Btn;


public  WebElement getSignin_Btn() {
	return signin_Btn;
}


public Home_Page(WebDriver abc) {
	this.driver=abc;// this.driver=from test runner driver;
	PageFactory.initElements(driver, this);
}

}
