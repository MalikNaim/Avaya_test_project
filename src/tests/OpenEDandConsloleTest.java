package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseClasses.BasePage;
import BaseClasses.Driver;
import steps.LoginSteps;
import steps.OpenEDandConsoleSteps;

public class OpenEDandConsloleTest extends BasePage {

	String ranNumberrandom;

	Driver driverObj=new Driver();
	WebDriver driver=null;
	LoginSteps loginSteps=new LoginSteps();
	SoftAssert softAssert=new SoftAssert();
	OpenEDandConsoleSteps OpenEDConsoleSteps=new OpenEDandConsoleSteps();

	@BeforeTest
	public void start() throws IOException{
		driver=driverObj.createDriver();	
		driver.get(driverObj.getUrl());
	}
	@Test(priority=1)
	public void loginWithValidUserDetails(){
		loginSteps.login(driver,softAssert,driverObj.getUsername(),driverObj.getPassword());
		// loginSteps.logout(driver,softAssert);
		softAssert.assertAll();
	}

	@Test(priority=2)
	public void openEdconsolebrowser() throws IOException, InterruptedException{
		OpenEDConsoleSteps.selectEngagementdesigner(driver, softAssert);
		OpenEDConsoleSteps.fillemailtaskdetails(driver, softAssert,driverObj.getSendEmail(),driverObj.getToEmail(),driverObj.getEmailSubject(),driverObj.getEmailBody());
		ranNumberrandom=driverObj.getrandomname()+ranNumber(2);
		OpenEDConsoleSteps.createsaveWFD(driver, softAssert, ranNumberrandom);
		OpenEDConsoleSteps.openadminConsolepage(driver, softAssert, ranNumberrandom);
		OpenEDConsoleSteps.adminconsoleinstance(driver, softAssert, ranNumberrandom);
		/*driver.switchTo().defaultContent();
		loginSteps.logoutandverifyapplication(driver, softAssert);*/

	}
	@Test(priority=0)
	public void loginWithInvalidUserDeatils(){
		loginSteps.invalidLogin(driver,softAssert,driverObj.getInvalidUsername(),driverObj.getPassword());
	}

	//@AfterTest
	public void tearDown(){
		driver.quit();
		driver=null;
	}

}
