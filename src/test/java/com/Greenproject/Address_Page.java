package com.Greenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_Page {
public WebDriver driver;

@FindBy(id="cgv")
private WebElement cgv;

public Address_Page(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}

public WebElement getCgv() {
	return cgv;
}



}
