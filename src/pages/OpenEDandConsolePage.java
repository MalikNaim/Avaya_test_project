package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream;

import BaseClasses.BasePage;

public class OpenEDandConsolePage extends BasePage{

	private By elementsAvaya=By.linkText("Avaya Breeze™");
	private By administrationheader=By.xpath("//*[@id='mainForm']/div[1]/div[1]/table/tbody/tr/td[1]/div/h1");
	private By invalidLoginMessageFieldLocator=By.xpath("//div[@class='error']");
	private By selectnodedropdown=By.xpath("//select[@name='clusterDashboardTable:1:selectTarget']");
	private By selectonenodedropdown=By.xpath("//select[@name='clusterDashboardTable:0:selectTarget']");
	private By DesignerConsoleURLLocatorOneNode=By.xpath("//*[@id='clusterDashboardTable:0:selectTarget']/option[3]");
	private By designerConsoleURLLocator=By.xpath("//*[@id='clusterDashboardTable:1:selectTarget']/option[3]");
	private By clickNotificationtask=By.xpath("//div[@id='ext-gen248']");
	private By clickEventTask=By.xpath("//div[@id='ext-gen283']");
	private By senderEmaillocator=By.xpath("//input[@id='Sender']");
	private By toEmaillocator=By.xpath("//input[@id='To']");
	private By emailSubjectlocator=By.xpath("//input[@id='EmailSubject']");
	private By emailBodylocator=By.xpath("//textarea[@id='EmailBody']");
	private By outputmappingbtnlocator=By.xpath("//input[@id='btnPropertiesOPM']");
	private By datamapperlocator=By.xpath("html/body/div[25]/div[2]/table[2]/tbody/tr/td/table/tbody/tr/th/img");
	private By datamappingsavebtnlocator=By.xpath("//div[@class='ui-dialog-buttonset']/button[1]");
	private By saveasbtnlocator=By.xpath("//button[@id='ext-gen123']");
	private By saveworkflowwindowlocator=By.xpath("//span[contains(text(),'Save Workflow')]");
	private By selectfolderlocator=By.xpath("//a[@id='automation_anchor']");
	private By enterWorkflownamelocator=By.xpath("//input[@id='saveWfdWorkflowName']");
	//private By clicksavebtnlocator=By.xpath("//*[@id='ext-gen16']/div[26]/div[3]/div/button[2]/span[contains(text(),'Save')]");
	private By clicksavebtnlocator=By.xpath("//button[@type='button']/span[contains(text(),'Save')]");
	private By createdtasknamelocator=By.xpath("//*[@id='ext-gen176']/input");
	private By validatelocator=By.xpath("//button[@id='ext-gen137']");
	private By clickdeploylocator=By.xpath("//button[@id='ext-gen139']");
	private By deploymentsdetailslocator=By.xpath("//*[@id='ext-gen16']/div[26]/div[1]");
	private By clickOkbtnlocator=By.xpath("//*[@id='ext-gen16']/div[28]/div[2]/table/tbody/tr[2]/td[1]/input");
	private By avayaengpopuplocator=By.xpath("//*[@id='ext-gen16']/div[25]/div[1]/span");
	//private By clickpopupokbtnlocator=By.xpath("//*[@id='ext-gen16']/div[26]/div[2]/table/tbody/tr[2]/td[1]/input");
	private By clickpopupokbtnlocator=By.name("//input[@name='btnPropertiesOK']");
	private By openadminconsollocator=By.xpath("//*[@id='clusterDashboardTable:0:selectTarget']/option[2]");
	private By verifyadminconsolewinlocator=By.xpath("//div[@class='container-fluid']/div[1]/nav/div[1]/h3");
	private By searchinstancelocator=By.xpath("//div[@class='container-fluid']/div[2]/div/div[2]/div[1]/div[1]/div[2]/input");
	private By selectcheckboxlocator=By.xpath("//div[@class='container-fluid']/div[2]/div/div[2]/div[1]/div[2]/div[2]/table/tbody/tr/td[1]");
	private By createinstancelocator=By.xpath("//button[@id='createInstance']");
	private By createinstancepopuptextlocator=By.xpath("//div[@class='container-fluid']/div/div/div[2]");
	private By createinstanceOkbtnlocator=By.xpath("//button[@id='createInstanceButton']");
	private By createdinstancelocator=By.xpath("html/body/div[4]");
	private By instancesTablocator=By.xpath("//div[@class='container-fluid']/div[2]/ul/li[3]/a");
	private By advancesearchbtnlocator=By.xpath("//button[@id='advanceSearchInstance']");
	private By verifyadvancesearchlocator=By.xpath("//*[@class='modal-open']/div[19]/div/div/div[1]/h2");
	private By selectradiobtnlocator=By.xpath("//input[@id='SearchOnColumnRadio']");
	private By selectintancelocator=By.xpath("//*[@id='selectColumn']");
	private By selectInstancenamelocator=By.xpath("//*[@id='selectColumn']/option[4]");
	private By searchadvanceInstancelocator=By.xpath("//input[@id='searchInstancesAdvance']");
	private By searchbtnlocator=By.xpath("//button[@id='advanceSearchModalBut']");
	private By searchcreatedinstancelocator=By.xpath("//div[@class='container-fluid']/div[2]/div/div[3]/input");
	private By clickinstancecreatedlocator=By.xpath("//div[@class='container-fluid']/div[2]/div/div[3]/div[1]/div[2]/div[2]/table/tbody/tr[1]/td[5]");
	private By verifycreatedinstancelocator=By.xpath("//div[@class='container-fluid']/div[2]/div/div[7]/div/table[1]/tbody/tr[1]/td");
	private By clickrunninginstancelocator=By.xpath("//div[@class='container-fluid']/div[2]/div/div[7]/div/table[2]/tbody/tr/td/table/tbody/tr/td/div/img[2]");


	private By notificationicon=By.xpath("//div[@id='ext-gen234']");
	private By eventicon=By.xpath("//div[@id='ext-gen283']");


	public void clickAvayalink(WebDriver driver,SoftAssert softAssert){
		waitForElementPresence(driver, elementsAvaya);
		driver.findElement(elementsAvaya).click();
		System.out.println("click avaya breez element");
		/*waitForElementVisibility(driver, administrationheader);
		System.out.println("wait administrator headr");
		softAssert.assertEquals("Cluster Administration  ", driver.findElement(administrationheader).getText());	
		System.out.println("user is able to verify admin cluster page");*/
	}

	public void selectnodedropdownoptions(WebDriver driver, SoftAssert softAssert) throws IOException, InterruptedException{
		//two node cluster
		/*driver.switchTo().frame("iframe0");
		waitForElementVisibility(driver, selectnodedropdown);
		driver.findElement(selectnodedropdown).click();
		waitForElementVisibility(driver, designerConsoleURLLocator);
		driver.findElement(designerConsoleURLLocator).click();
		driver.switchTo().defaultContent();
		 Object[] allHAndlers= driver.getWindowHandles().toArray();
		 System.out.println(allHAndlers.length);  
		 driver.switchTo().window((String)allHAndlers[1]);*/  

		//one node cluster
		driver.switchTo().frame("iframe0");
		waitForElementVisibility(driver, selectonenodedropdown);
		driver.findElement(selectonenodedropdown).click();
		waitForElementVisibility(driver, DesignerConsoleURLLocatorOneNode);
		driver.findElement(DesignerConsoleURLLocatorOneNode).click();
		driver.switchTo().defaultContent();
		Object[] allHAndlers= driver.getWindowHandles().toArray();
		System.out.println(allHAndlers.length);  
		driver.switchTo().window((String)allHAndlers[1]); 
		
	}

	public void createandsaveEmailWFD(WebDriver driver, SoftAssert softAssert) throws IOException, InterruptedException
	{
		//driver.findElement(clickNotificationtask).click();
		driver.findElement(notificationicon).click();
		Process process1 = Runtime.getRuntime().exec("C:\\Users\\hp\\Desktop\\Scripts\\notificationtask.exe");
		process1.waitFor();
		/*  waitForElementVisibility(driver, clickEventTask);
		driver.findElement(clickEventTask).click();*/

		waitForElementVisibility(driver, eventicon);
		driver.findElement(eventicon).click();
		Process process2 = Runtime.getRuntime().exec("C:\\Users\\hp\\Desktop\\Scripts\\Notification1.exe");
		process2.waitFor();
	}

	public void entersenderemail(WebDriver driver,String SendEmail)
	{
		waitForElementVisibility(driver, senderEmaillocator);
		driver.findElement(senderEmaillocator).sendKeys(SendEmail);
	}

	public void enterToemail (WebDriver driver, String ToEmail)
	{
		driver.findElement(toEmaillocator).sendKeys(ToEmail);
	}

	public void enterEmailSubject(WebDriver driver,String EmailSubject)
	{
		driver.findElement(emailSubjectlocator).sendKeys(EmailSubject);
	}

	public void enterEmailBody(WebDriver driver,String EmailBody)
	{
		driver.findElement(emailBodylocator).sendKeys(EmailBody);
	}

	public void clickoutmappingbtn(WebDriver driver, SoftAssert softAssert)
	{
		waitForElementVisibility(driver, outputmappingbtnlocator);
		driver.findElement(outputmappingbtnlocator).click();
	}

	public void clickdatamapperlebel(WebDriver driver)
	{
		waitForElementVisibility(driver, datamapperlocator);
		driver.findElement(datamapperlocator).click();
	}

	public void clicksavebtn(WebDriver driver)
	{
		waitForElementVisibility(driver, datamappingsavebtnlocator);
		driver.findElement(datamappingsavebtnlocator).click();
	}

	public void clicksaveasmenuicon(WebDriver driver,SoftAssert softAssert)
	{
		waitForElementVisibility(driver, saveasbtnlocator);
		driver.findElement(saveasbtnlocator).click();
		softAssert.assertEquals("Save Workflow", driver.findElement(saveworkflowwindowlocator).getText());
	}

	public void selectworkflowfolder(WebDriver driver,SoftAssert softAssert)
	{
		waitForElementVisibility(driver, selectfolderlocator);
		driver.findElement(selectfolderlocator).click();
	}

	public void enterworkflownamerandomly(WebDriver driver, SoftAssert softAssert,String randomname)
	{
		waitForElementVisibility(driver, enterWorkflownamelocator);
		System.out.println("Enter WFD name");
		driver.findElement(enterWorkflownamelocator).sendKeys(randomname);
		System.out.println("Enter random WFD name");
	}

	public void clickSavebtnworkflow(WebDriver driver,SoftAssert softAssert) throws InterruptedException
	{
		/*System.out.println("click save btn");
		//waitForElementVisibility(driver, clicksavebtnlocator);
		driver.findElement(clicksavebtnlocator).click();*/
		
		
		 WebElement el = driver.findElement( By.xpath( "//*[@id='ext-gen16']/div[26]/div[3]/div/button[2]/span[contains(text(),'Save')]" ));
	     Actions builder = new Actions(driver);
	     builder.moveToElement( el ).click( el );
	     builder.perform();
		
		
		System.out.println("User is able to save WFD");
		softAssert.assertEquals("randomname", driver.findElement(createdtasknamelocator).getText());
	}
	public void clickvalidatemenuicon(WebDriver driver)
	{
		waitForElementVisibility(driver, validatelocator);
		driver.findElement(validatelocator).click();
	}

	public void clickDeployemenuicon(WebDriver driver,SoftAssert softAssert)
	{
		waitForElementVisibility(driver, clickdeploylocator);
		driver.findElement(clickdeploylocator).click();
		softAssert.assertEquals("Deployment Details", driver.findElement(deploymentsdetailslocator).getText());
		System.out.println("verify deployment header");
	}

	public void clickDeploywindowokbtn(WebDriver driver,SoftAssert softAssert)
	{
		/*waitForElementVisibility(driver, clickOkbtnlocator);
		driver.findElement(clickOkbtnlocator).click();*/
		 WebElement el = driver.findElement( By.id( "btnPropertiesOK" ));
	     Actions builder = new Actions(driver);
	     builder.moveToElement( el ).click( el );
	     builder.perform();
		
		System.out.println("click on deploy save btn");
		softAssert.assertEquals("Avaya Engagement Designer", driver.findElement(avayaengpopuplocator).getText());
		System.out.println("verify designer popup");
	}

	public void clickAvayawindowokbtn(WebDriver driver)
	{
		waitForElementVisibility(driver, clickpopupokbtnlocator);
		driver.findElement(clickpopupokbtnlocator).click();
		driver.close();
	}

	public void verifyInvalidLogin(WebDriver driver, SoftAssert softAssert) {
		waitForElementVisibility(driver, invalidLoginMessageFieldLocator);
		softAssert.assertEquals("Either username or password is invalid", driver.findElement(invalidLoginMessageFieldLocator).getText());
	}
	public void openadminconsole(WebDriver driver, SoftAssert softAssert)
	{
		String mainWindowHandle = driver.getWindowHandles().iterator().next();
		driver.switchTo().window(mainWindowHandle);
		driver.switchTo().frame("iframe0");
		System.out.println("switch to frame");
		waitForElementVisibility(driver, selectonenodedropdown);
		driver.findElement(selectonenodedropdown).click();
		System.out.println("click on cluster node one");
		waitForElementVisibility(driver, openadminconsollocator);
		System.out.println("opn cln");
		driver.findElement(openadminconsollocator).click();
		System.out.println("open cluster node one");
		driver.switchTo().defaultContent();
		Object[] allHAndlers= driver.getWindowHandles().toArray();
		System.out.println(allHAndlers.length);  
		driver.switchTo().window((String)allHAndlers[1]); 
		softAssert.assertEquals("Administration Console", driver.findElement(verifyadminconsolewinlocator).getText());

	}
	public void searchcreatedinstance(WebDriver driver, SoftAssert softAssert, String randomname) throws InterruptedException
	{
		Thread.sleep(8000);
		waitForElementVisibility(driver, searchinstancelocator);
		driver.findElement(searchinstancelocator).sendKeys(randomname);
		System.out.println("Search random instance name");
		//softAssert.assertEquals("Deployment Details", driver.findElement(deploymentsdetailslocator).getText());
	}
	public void instancecheckbox(WebDriver driver, SoftAssert softAssert)
	{
		waitForElementVisibility(driver, selectcheckboxlocator);
		driver.findElement(selectcheckboxlocator).click();
		System.out.println("Select instance check box");
	}
	public void clickcreateinstancebtn (WebDriver driver, SoftAssert softAssert)
	{
		waitForElementVisibility(driver, createinstancelocator);
		driver.findElement(createinstancelocator).click();
		System.out.println("Create instance");
		softAssert.assertEquals("There is not any variable defined in the Output Schema of the Start Event in this Workflow.", driver.findElement(createinstancepopuptextlocator).getText());
		System.out.println("verify instance message");
	}
	public void clickcreateinstanceOkbtn (WebDriver driver, SoftAssert softAssert)
	{
		waitForElementVisibility(driver, createinstanceOkbtnlocator);
		driver.findElement(createinstanceOkbtnlocator).click();
		softAssert.assertEquals("Created instance ", createdinstancelocator);
		System.out.println("verify created instance");
	}
	public void instanceTab(WebDriver driver, SoftAssert softAssert) throws InterruptedException
	{
		Thread.sleep(8000);
		waitForElementVisibility(driver, instancesTablocator);
		driver.findElement(instancesTablocator).click();
		System.out.println("click on instance tab ");
	}
	public void advanceSearchbtn(WebDriver driver, SoftAssert softAssert)
	{
		waitForElementVisibility(driver, advancesearchbtnlocator);
		driver.findElement(advancesearchbtnlocator).click();
		softAssert.assertEquals("Advanced search on                     instances", verifyadvancesearchlocator);
	}
	public void selectradiobtn(WebDriver driver, SoftAssert softAssert)
	{
		waitForElementVisibility(driver, selectradiobtnlocator);
		driver.findElement(selectradiobtnlocator).click();
	}
	public void selectworkflowname(WebDriver driver, SoftAssert softAssert)
	{
		waitForElementVisibility(driver, selectintancelocator);
		driver.findElement(selectintancelocator).click();
		System.out.println("click on instance arrow icon");
		waitForElementVisibility(driver, selectInstancenamelocator);
		driver.findElement(selectInstancenamelocator).click();
		System.out.println("select insatnace name");

		/*Select s = new Select((WebElement) selectintancelocator);
	s.selectByVisibleText("Workflow Name");*/
	}
	public void searchadvanceinstance(WebDriver driver, SoftAssert softAssert, String randomname)
	{
		waitForElementVisibility(driver, searchadvanceInstancelocator);
		driver.findElement(searchadvanceInstancelocator).sendKeys(randomname);
	}
	public void clickadvancesearchbtn(WebDriver driver, SoftAssert softAssert)
	{
		waitForElementVisibility(driver, searchbtnlocator);
		driver.findElement(searchbtnlocator).click();
		//softAssert.assertEquals(randomname, verifyadvancesearchlocator);
	}

	public void clickcreatedinstancechekbox(WebDriver driver, SoftAssert softAssert)
	{
		waitForElementVisibility(driver, searchcreatedinstancelocator);
		driver.findElement(searchcreatedinstancelocator).click();
		System.out.println("search created instance");
	}

	public void clickcreatedinstance(WebDriver driver, SoftAssert softAssert, String randomname) throws InterruptedException
	{
		Thread.sleep(5000);
		waitForElementVisibility(driver, clickinstancecreatedlocator);
		driver.findElement(clickinstancecreatedlocator).click();
		System.out.println("open instance");
		softAssert.assertEquals(randomname, verifycreatedinstancelocator);
	}
}
