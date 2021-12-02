package com.Greenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T_Shirt_Page {
public WebDriver driver;
//xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a")
@FindBy(xpath="//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a")
private WebElement selshirt;

public T_Shirt_Page(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}

public WebElement getSelshirt() {
	return selshirt;
}



}
