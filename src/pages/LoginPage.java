package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import BaseClasses.BasePage;

public class LoginPage extends BasePage {

	private By usernameTextFieldLocator = By.xpath("//input[@id='IDToken1']");
	private By PasswordTextFieldLocator = By.xpath("//input[@id='IDToken2']");
	private By loginBtnLocator = By.id("SubmitButton");
	private By homeTitlenameLocaotr=By.xpath("//div[@id='Elements']/h2[contains(text(),'Elements')]");
	private By invalidLoginMessageFieldLocator=By.xpath("//div[@class='error']");
	private By logoutApplicationlocator=By.xpath("//div[@id='loginuserDetails']/a");
	private By verifylogutlocator=By.xpath("//div[@id='r1_app_shell']/font/font");
	
	

	public void enterUsername(WebDriver driver, String username) {
		waitForElementVisibility(driver, usernameTextFieldLocator);
		driver.findElement(usernameTextFieldLocator).sendKeys(username);
	}

	public void enterPassword(WebDriver driver, String password) {
		driver.findElement(PasswordTextFieldLocator).sendKeys(password);
	}

	public void clickOnLoginButton(WebDriver driver,SoftAssert softAssert) {
		driver.findElement(loginBtnLocator).click();
		//softAssert.assertEquals("Elements", homeTitlenameLocaotr);
		System.out.println("verify home title page");
	}

	public void verifyInvalidLogin(WebDriver driver, SoftAssert softAssert) {
		waitForElementVisibility(driver, invalidLoginMessageFieldLocator);
		softAssert.assertEquals(" Authentication failed. Check your keyboard's caps lock and re-enter your User ID and password.", driver.findElement(invalidLoginMessageFieldLocator).getText());
	}

	public void logoutapplication(WebDriver driver, SoftAssert softAssert) {
		waitForElementVisibility(driver, logoutApplicationlocator);
		driver.findElement(logoutApplicationlocator).click();
		softAssert.assertEquals("   You have been logged out. ", verifylogutlocator);
	}

}
