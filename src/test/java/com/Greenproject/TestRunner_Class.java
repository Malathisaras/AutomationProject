package com.Greenproject;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.testng.Runner_Class;

public class TestRunner_Class extends Base_Class {
	//private static final String value = null;
		public static WebDriver driver=Base_Class.getBrowser("chrome");//-----null
		public static Page_Object_Manager pom=new Page_Object_Manager(driver);
		static Logger log=Logger.getLogger(Runner_Class.class);
		
		//	public static void main(String[] args) throws Throwable  {
		@Test(priority=-1)
			private void chrome_launch() throws Throwable
			{
			PropertyConfigurator.configure("log4j.properties");
			
			log.info("Automation Practice process Starting");
			log.info("Launching Browser");
			String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getURL();
			getURL(url);	
			driver.manage().window().maximize();
			}
		@Test
			private void Login() throws Throwable {
			
				click(pom.gethp().getSignin_Btn());	
				String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUsername();
				inputValueElement(pom.getlp().getEmail(),username);
				String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();
				inputValueElement(pom.getlp().getPassword(),password);	
				clickOnElement(pom.getlp().getSignin_Btn());	
				log.info("Login Successfully");
			}
		@Test(priority=1)
			private void Select_Dress() throws InterruptedException {
				moveToElement(pom.getwp().getWomen());
				moveToElement(pom.getwp().getTshirt());
				clickOnElement(pom.getwp().getTshirt());		
				moveToElement(pom.gettp().getSelshirt());
				clickOnElement(pom.gettp().getSelshirt());
				Thread(3000); 
				moveToElement(pom.getcp().getSubmit());
				Thread(1000);

			}
		@Test(priority=2)
			private void Dress_Order() throws Throwable {
				clickOnElement(pom.getcp().getSubmit());
				Thread(4000);		
				moveToElement(pom.getcheck().getCheck());
				Thread(2000);
				clickOnElement(pom.getcheck().getCheck());
				Thread(3000);	
				clickOnElement(pom.getsp().getSummary());
				Thread(2000);
				clickOnElement(pom.getpp().getProceed());
				clickOnElement(pom.getap().getCgv());
				clickOnElement(pom.getshipping().getShipping());
				clickOnElement(pom.getpay().getPayment());
				clickOnElement(pom.getconfirm().getConfirm());
				log.info("dress succesfully ordered");
				log.info("Automation Practice process complete");
		
			}
		@Test(priority=3)
			private void exit_page(){
				quit();		
			}
			
		}

