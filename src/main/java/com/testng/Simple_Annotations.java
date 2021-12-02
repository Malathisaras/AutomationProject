package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Simple_Annotations {
	
@BeforeClass
private void url() {
	System.out.println("launching the URL");

}
@Test	
public void women() {
	System.out.println("Women");
}
@BeforeMethod
public void signin()
{
	System.out.println("Login");
}
@AfterMethod
public void signoff()
{
	System.out.println("log off");
}
@Test
public void Dresses() {
	System.out.println("Dresses");
}
@Test
public void T_Shirts() {
	System.out.println("T_shirts"
			+ "");
}
@AfterClass
private void Home_Page() {
	System.out.println("Home Page");
} 
@AfterTest
private void close() {
System.out.println("close");
}
@AfterSuite
private void cookies() {
	System.out.println("cookies");

}
}

    