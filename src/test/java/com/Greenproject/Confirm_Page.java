package com.Greenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirm_Page {
public WebDriver driver;
@FindBy(xpath="(//button[@type='submit'])[2]")
private WebElement confirm;

public Confirm_Page(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}

public WebElement getConfirm() {
	return confirm;
}
@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
private WebElement check;

public WebElement getCheck() {
	return check;
}

}
