package com.Greenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women_Page {

	public Women_Page(WebDriver wdriver) {
		this.driver=wdriver;
		PageFactory.initElements(driver, this);
	}
	public WebDriver driver;
	
	@FindBy(xpath="//a[@title='Women']")
	private WebElement women;

	public WebElement getWomen() {
		return women;
	}
	@FindBy(xpath="(//a[@title='T-shirts'])[1]")
	private WebElement tshirt;

	public WebElement getTshirt() {
		return tshirt;
	}
	

}


