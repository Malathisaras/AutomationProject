package com.Greenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed_Page {
public WebDriver driver;

@FindBy(name="processAddress")
private WebElement proceed;

public Proceed_Page(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver, this);

}

public WebElement getProceed() {
	return proceed;
}


}
