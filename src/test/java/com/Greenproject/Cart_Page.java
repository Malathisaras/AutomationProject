package com.Greenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_Page {
public WebDriver driver;

@FindBy(name="Submit")
private WebElement Submit;

public Cart_Page(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}


public WebElement getSubmit() {
	return Submit;
}


@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
private WebElement check;

public WebElement getCheck() {
	return check;
}
}
