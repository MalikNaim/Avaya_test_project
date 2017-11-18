package steps;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import BaseClasses.BasePage;
import pages.OpenEDandConsolePage;

public class OpenEDandConsoleSteps extends BasePage {
	
	OpenEDandConsolePage OpenEDConsolePage = new OpenEDandConsolePage();

	public void selectEngagementdesigner(WebDriver driver, SoftAssert softAssert) throws IOException, InterruptedException
    {
		OpenEDConsolePage.clickAvayalink(driver,softAssert);
		OpenEDConsolePage.selectnodedropdownoptions(driver, softAssert);
		OpenEDConsolePage.createandsaveEmailWFD(driver, softAssert);	
    }

    public void fillemailtaskdetails(WebDriver driver, SoftAssert softAssert, String SendEmail, String ToEmail, String EmailSubject, String EmailBody)
    {	
    	OpenEDConsolePage.entersenderemail(driver, SendEmail);
    	OpenEDConsolePage.enterToemail(driver, ToEmail);
    	OpenEDConsolePage.enterEmailSubject(driver, EmailSubject);
    	OpenEDConsolePage.enterEmailBody(driver, EmailBody);
    	OpenEDConsolePage.clickoutmappingbtn(driver, softAssert);
    	OpenEDConsolePage.clickdatamapperlebel(driver);
    	OpenEDConsolePage.clicksavebtn(driver);
    }
    
    public void createsaveWFD(WebDriver driver, SoftAssert softAssert, String randomname) throws InterruptedException
    {
    	OpenEDConsolePage.clicksaveasmenuicon(driver, softAssert);
    	OpenEDConsolePage.enterworkflownamerandomly(driver, softAssert, randomname);
    	OpenEDConsolePage.selectworkflowfolder(driver, softAssert);
    	OpenEDConsolePage.clickSavebtnworkflow(driver, softAssert);
    	OpenEDConsolePage.clickvalidatemenuicon(driver);
    	OpenEDConsolePage.clickDeployemenuicon(driver,softAssert);
    	OpenEDConsolePage.clickDeploywindowokbtn(driver,softAssert);
    	System.out.println("click deploy menu");
    	OpenEDConsolePage.clickAvayawindowokbtn(driver);
    	System.out.println("click save btn");
    }
    public void openadminConsolepage(WebDriver driver,SoftAssert softAssert, String randomname) throws InterruptedException
    {
    	OpenEDConsolePage.openadminconsole(driver, softAssert);
    	OpenEDConsolePage.searchcreatedinstance(driver, softAssert, randomname);
    }

    public void adminconsoleinstance(WebDriver driver,SoftAssert softAssert,String randomname) throws InterruptedException
    {
    	OpenEDConsolePage.instancecheckbox(driver, softAssert);
    	OpenEDConsolePage.clickcreateinstancebtn(driver, softAssert);
    	OpenEDConsolePage.clickcreateinstanceOkbtn(driver, softAssert);
    	OpenEDConsolePage.instanceTab(driver, softAssert);
    	OpenEDConsolePage.advanceSearchbtn(driver, softAssert);
    	OpenEDConsolePage.selectradiobtn(driver, softAssert);
    	OpenEDConsolePage.selectworkflowname(driver, softAssert);
    	OpenEDConsolePage.searchadvanceinstance(driver, softAssert, randomname);
    	OpenEDConsolePage.clickadvancesearchbtn(driver, softAssert);
    	//OpenEDConsolePage.clickcreatedinstancechekbox(driver, softAssert);
    	OpenEDConsolePage.clickcreatedinstance(driver, softAssert, randomname);
    	
    }
}
