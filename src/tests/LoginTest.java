package tests;

import java.io.IOException;

import javax.swing.text.Utilities;

import org.eclipse.jetty.util.log.Log;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseClasses.BasePage;
import BaseClasses.Driver;
import steps.LoginSteps;
import utilities.ScreenshotOnFailureListener;

public class LoginTest extends BasePage {


	Driver driverObj=new Driver();
	WebDriver driver=null;
	LoginSteps loginSteps=new LoginSteps();
	SoftAssert softAssert=new SoftAssert();
	ScreenshotOnFailureListener Utils=new ScreenshotOnFailureListener();
	

	@BeforeTest
	public void start() throws IOException{
		driver=driverObj.createDriver();
		driver.get(driverObj.getUrl());
	}

	@Test(priority=1)
	public void loginWithValidUserDetails(){
		try
		{
		loginSteps.invalidLogin(driver,softAssert,driverObj.getInvalidUsername(),driverObj.getPassword());
		loginSteps.login(driver,softAssert,driverObj.getUsername(),driverObj.getPassword());
		// loginSteps.logout(driver,softAssert);
		softAssert.assertAll();
		loginSteps.logoutandverifyapplication(driver, softAssert);
		}
			catch (Exception e){
	 
	            Utils.takeScreenShot(driver, null);
	 
	            throw(e);
		}
	}

	@AfterTest
	public void tearDown(){
		driver.quit();
		driver=null;
	}
}
