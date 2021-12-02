package com.Greenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary_Page {
public WebDriver driver;

@FindBy(xpath="//*[@id=\"center_column\"]/p[2]/a[1]")
//@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
private WebElement Summary;

public Summary_Page(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}

public WebElement getSummary() {
	return Summary;
}


}
