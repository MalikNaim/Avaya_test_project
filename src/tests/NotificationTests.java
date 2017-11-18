package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseClasses.BasePage;
import BaseClasses.Driver;
import steps.LoginSteps;
import steps.NotificationSteps;

public class NotificationTests extends BasePage {
	
	String ranNumberrandom;
	NotificationSteps notificationstepstask=new NotificationSteps();

	Driver driverObj=new Driver();
	WebDriver driver=null;
	LoginSteps loginSteps=new LoginSteps();
	SoftAssert softAssert=new SoftAssert();

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
	public void notificationtaskcompleted() throws IOException, InterruptedException
	{
		notificationstepstask.notificationtask(driver, softAssert);
		ranNumberrandom=driverObj.getrandomname()+ranNumber(2);
		notificationstepstask.savenotificationWFD(driver, softAssert, ranNumberrandom);
		notificationstepstask.Openadminconsole(driver, softAssert, ranNumberrandom);
		notificationstepstask.fillcreateinstnacedetails(driver, softAssert, driverObj.getemailfrom(), driverObj.getmsgto(), driverObj.getemailto(), driverObj.getmsgfrom(), driverObj.getemailsubject(), driverObj.getbody());
		notificationstepstask.createinstance(driver, softAssert, ranNumberrandom);
	}


	@Test(priority=0)
	public void loginWithInvalidUserDeatils(){
		loginSteps.invalidLogin(driver,softAssert,driverObj.getInvalidUsername(),driverObj.getPassword());
	}

	// @AfterTest
	public void tearDown(){
		driver.quit();
		driver=null;
	}
}
