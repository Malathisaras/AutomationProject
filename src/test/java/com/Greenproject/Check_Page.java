package com.Greenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Check_Page {
public WebDriver driver;

@FindBy(xpath="//a[@title='Proceed to checkout']")
private WebElement check;

public Check_Page(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}

public WebElement getCheck() {
	return check;
}


}
