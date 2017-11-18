package steps;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import BaseClasses.BasePage;
import pages.NotificationPage;
import pages.OpenEDandConsolePage;

public class NotificationSteps extends BasePage {

	NotificationPage notificationtask=new NotificationPage();
	OpenEDandConsolePage OpenEDConsolePage = new OpenEDandConsolePage();

	public void notificationtask(WebDriver driver, SoftAssert softAssert) throws IOException, InterruptedException
	{
		OpenEDConsolePage.clickAvayalink(driver,softAssert);
		OpenEDConsolePage.selectnodedropdownoptions(driver, softAssert);
		notificationtask.importworkflowmenuicon(driver, softAssert);
		notificationtask.uploadfile(driver, softAssert);
		Thread.sleep(6000);
		notificationtask.importfile();
		notificationtask.clickimportbtn(driver, softAssert);
	}

	public void savenotificationWFD(WebDriver driver, SoftAssert softAssert, String randomname) throws InterruptedException
	{
		OpenEDConsolePage.clicksaveasmenuicon(driver, softAssert);
		OpenEDConsolePage.enterworkflownamerandomly(driver, softAssert, randomname);
		OpenEDConsolePage.selectworkflowfolder(driver, softAssert);
		Thread.sleep(8000);
		OpenEDConsolePage.clickSavebtnworkflow(driver, softAssert);
		OpenEDConsolePage.clickvalidatemenuicon(driver);
		OpenEDConsolePage.clickDeployemenuicon(driver,softAssert);
		OpenEDConsolePage.clickDeploywindowokbtn(driver,softAssert);
		System.out.println("click deploy menu");
		OpenEDConsolePage.clickAvayawindowokbtn(driver);
		System.out.println("click save btn");

	}
	public void Openadminconsole(WebDriver driver,SoftAssert softAssert, String randomname) throws InterruptedException
	{
		OpenEDConsolePage.openadminconsole(driver, softAssert);
		OpenEDConsolePage.searchcreatedinstance(driver, softAssert, randomname);
		OpenEDConsolePage.instancecheckbox(driver, softAssert);
		OpenEDConsolePage.clickcreateinstancebtn(driver, softAssert);
	}

	public void createinstance(WebDriver driver,SoftAssert softAssert,String randomname) throws InterruptedException
	{
		
		//OpenEDConsolePage.clickcreateinstanceOkbtn(driver, softAssert);
		OpenEDConsolePage.instanceTab(driver, softAssert);
		OpenEDConsolePage.advanceSearchbtn(driver, softAssert);
		OpenEDConsolePage.selectradiobtn(driver, softAssert);
		OpenEDConsolePage.selectworkflowname(driver, softAssert);
		OpenEDConsolePage.searchadvanceinstance(driver, softAssert, randomname);
		OpenEDConsolePage.clickadvancesearchbtn(driver, softAssert);
		//OpenEDConsolePage.clickcreatedinstancechekbox(driver, softAssert);
		OpenEDConsolePage.clickcreatedinstance(driver, softAssert, randomname);

	}
	public void fillcreateinstnacedetails(WebDriver driver, SoftAssert softAssert, String emailsender, String msgreceiver, String emailreceiver, String msgsender,String emailsubject, String emailbody)
	{
		try {
			Thread.sleep(8000);
			notificationtask.enteremailform(driver, softAssert, emailsender);
			notificationtask.entermsgto(driver, softAssert, msgreceiver);
			notificationtask.enteremailto(driver, softAssert, emailreceiver);
			notificationtask.entermsgfrom(driver, softAssert, msgsender);
			notificationtask.enteremailsubject(driver, softAssert, emailsubject);
			notificationtask.enteremailbody(driver, softAssert, emailbody);
			notificationtask.createinstanceokbtn(driver, softAssert);
		} catch (InterruptedException e) {
			System.out.println("this is full fill the instance details");
			e.printStackTrace();
		}
		
		
	}
}
