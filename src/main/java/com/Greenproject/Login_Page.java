package com.Greenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
public Login_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

public WebDriver driver;//-------null
@FindBy(id = "email")
private WebElement email;

public WebElement getEmail() {
	return email;
}



@FindBy(name = "passwd")
private WebElement password;

public WebElement getPassword() {
	return password;
}


@FindBy(xpath="//button[@id='SubmitLogin']")
private WebElement signin_Btn;

public WebElement getSignin_Btn() {
	return signin_Btn;
}

}
