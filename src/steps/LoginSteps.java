package steps;

import BaseClasses.BasePage;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import pages.LoginPage;

public class LoginSteps extends BasePage {

	
    LoginPage loginPage = new LoginPage();

    public void login(WebDriver driver, SoftAssert softAssert, String username, String password) {
        loginPage.enterUsername(driver, username);
        loginPage.enterPassword(driver, password);
        loginPage.clickOnLoginButton(driver,softAssert);
       
       // loginPage.verifyadminclusterheader(driver, softAssert);
    }

    public void invalidLogin(WebDriver driver, SoftAssert softAssert, String invalidUsername, String password) {
    	System.out.println("invalid login");
        loginPage.enterUsername(driver, invalidUsername);
        System.out.println("login valid");
        loginPage.enterPassword(driver, password);
        loginPage.clickOnLoginButton(driver,softAssert);
        
    }
    public void logoutandverifyapplication(WebDriver driver,SoftAssert softAssert)
    {
    	loginPage.logoutapplication(driver, softAssert);
    }

}
