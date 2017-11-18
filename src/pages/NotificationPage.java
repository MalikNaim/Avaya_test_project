package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream;

import BaseClasses.BasePage;

public class NotificationPage extends BasePage{

	private By importworkflowlocator=By.xpath("//button[@id='ext-gen125']");
	private By verifyimportworkflowlocator=By.xpath("//*[@id='ext-gen16']/div[26]/div[1]");
	private By browselocator=By.xpath("//*[@id='ext-gen16']/div[26]/div[2]/form/input");
	private By importbtnlocator=By.xpath("//div[@class='ui-dialog-buttonset']/button/span[contains(text(),'Import')]");
	private By verifycreateinstnacewindowlocator=By.xpath("//*[@class='modal-open']/div[5]/div/div/div[1]/h2");
	private By emailfromlocator=By.xpath("//div[@class='well well-sm']/div/div/div[1]/div/div[1]/input");
	private By msgtolocator=By.xpath("//input[@name='root[Msg to]']");
	private By emailTo=By.xpath("//input[@name='root[Email T0]']");
	private By msgFormlocator=By.xpath("//input[@name='root[Msg From]']");
	private By emailsubjectlocator=By.xpath("//input[@name='root[Email Subject]']");
	private By bodylocator=By.xpath("//input[@name='root[Body]']");
	private By buttonlocator=By.xpath("//button[@id='createInstanceButton']");
	
	
	
	public void importworkflowmenuicon(WebDriver driver, SoftAssert softAssert)
	{
		waitForElementClickable(driver, importworkflowlocator);
		driver.findElement(importworkflowlocator).click();
		softAssert.assertEquals("Import Workflow", verifyimportworkflowlocator);
		System.out.println("verify import workflow header");
	}
	public void uploadfile(WebDriver driver, SoftAssert softAssert) throws IOException, InterruptedException
	{
		
		/*waitForElementVisibility(driver, browselocator);
		System.out.println("visibility element present");
		driver.findElement(browselocator).click();*/
		  
		     WebElement el = driver.findElement( By.id( "importwfdfile" ));
		     Actions builder = new Actions(driver);
		     builder.moveToElement( el ).click( el );
		     builder.perform();
		
		System.out.println("click on import browser button");
	}
	public void importfile() throws IOException, InterruptedException
	{
		Process process1 = Runtime.getRuntime().exec("C:\\Users\\hp\\Desktop\\Scripts\\acceptnotificatontask.exe");
		process1.waitFor();
	}
	public void clickimportbtn(WebDriver driver, SoftAssert softAssert)
	{
		/*waitForElementVisibility(driver, importbtnlocator);
		driver.findElement(importbtnlocator).click();*/
		
		 WebElement el = driver.findElement( By.xpath( "//div[@class='ui-dialog-buttonset']/button/span[contains(text(),'Import')]" ));
	     Actions builder = new Actions(driver);
	     builder.moveToElement( el ).click( el );
	     builder.perform();	
	}
	public void enteremailform(WebDriver driver, SoftAssert softAssert, String emailsender)
	{
		softAssert.assertEquals("Create Instance", verifycreateinstnacewindowlocator);
		System.out.println("verify create instance window");
		waitForElementVisibility(driver, emailfromlocator);
		driver.findElement(emailfromlocator).sendKeys(emailsender);
		System.out.println("Enter from email");
	}
	
	public void entermsgto(WebDriver driver, SoftAssert softAssert, String msgreceiver)
	{
		waitForElementVisibility(driver, msgtolocator);
		driver.findElement(msgtolocator).sendKeys(msgreceiver);
		System.out.println("enter receiver message");
	}
	
	public void enteremailto(WebDriver driver, SoftAssert softAssert, String emailreceiver)
	{
		waitForElementVisibility(driver, emailTo);
		driver.findElement(emailTo).sendKeys(emailreceiver);
		System.out.println("etner sender email");
	}
	
	public void entermsgfrom(WebDriver driver, SoftAssert softAssert, String msgsender)
	{
		waitForElementVisibility(driver, msgFormlocator);
		driver.findElement(msgFormlocator).sendKeys(msgsender);
		System.out.println("enter sender message");
	}
	
	public void enteremailsubject(WebDriver driver, SoftAssert softAssert, String emailsubject)
	{
		waitForElementVisibility(driver, emailsubjectlocator);
		driver.findElement(emailsubjectlocator).sendKeys(emailsubject);
		System.out.println("enter email subject");
	}
	
	public void enteremailbody(WebDriver driver, SoftAssert softAssert, String emailbody)
	{
		waitForElementVisibility(driver, bodylocator);
		driver.findElement(bodylocator).sendKeys(emailbody);
		System.out.println("enter email body");
	}
	
	public void createinstanceokbtn(WebDriver driver, SoftAssert softAssert)
	{
		waitForElementVisibility(driver, buttonlocator);
		driver.findElement(buttonlocator).click();
		System.out.println("click on ok button from create instance");
	}
	
}