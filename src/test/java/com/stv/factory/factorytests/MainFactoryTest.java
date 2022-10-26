package com.stv.factory.factorytests;

import com.stv.factory.factorypages.LoginPage;
import com.stv.factory.factorypages.MainFactoryPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import com.stv.factory.factorypages.PersonalAccountPage;
import com.stv.framework.core.utils.Waiters;

import java.util.concurrent.TimeUnit;

import static com.stv.framework.core.lib.WigglePageURLs.START_URL;


public class MainFactoryTest extends BasicFactoryTest {

    MainFactoryPage mainFactoryPage = new MainFactoryPage();
    LoginPage loginPage = new LoginPage();
    PersonalAccountPage personalAccountPage = new PersonalAccountPage();



    @Ignore
    @Test (description = "Assert the main page is loaded and account icon is visible")
    public void assertAccountIconIsDisplayed() {
        boolean actualResult = mainFactoryPage.isAccountLinkDisplayed();
        Assert.assertEquals(actualResult, true, "Account link isn't visible");
    }


    @Ignore
    @Test (description = "Assert the login page is loaded", dependsOnMethods = "assertAccountIconIsDisplayed")
    public void assertLoginPageOpened() {
        mainFactoryPage.clickOnTrustButton();
        mainFactoryPage.clickOnAccountLink();
        Assert.assertEquals(new LoginPage().isLoginContainerDisplayed(), true, "Login page isn't loaded properly");
    }
//****************************************************************************************************************

   /* Test-case#1
    Feature: Sign in
    In order to work with my personal account
    As a registered user
    I want to  sing in my personal account page

    Scenario: successful authentication
    Given The login page is loaded
    When I  enter the correct E-mail address (kan22979111@gmail.com) in the field ‘Email address’
    And I  enter the correct password (111111) in the field ‘Password’
    And I  press the button ‘Sign in securely’ with the mouse, or I press the ‘enter’ button on the keyboard
    Then  I should see the personal account page is loaded
*/



    @Test (description = "Assert the account page is loaded")
    public void assertAccountPageOpened(){
        mainFactoryPage.clickOnTrustButton();
       mainFactoryPage.clickOnAccountLink();
        loginPage.inputEmailAddress();
        loginPage.inputEmailPassword();
        loginPage.clickSignInButton();
        Assert.assertEquals(personalAccountPage.isAccountPageDisplayed(), true, "Account page isn't loaded properly");

    }
//*********************************************************************************************************


    /*Test-case#8
    Feature: New customer
    In order to create my personal account
    As  a new user
    I want to go through the registration process

    Scenario: unsuccessful transition to the confirmation page
    Given The login page is loaded
    When I  enter the incorrect E-mail address (k111@gmail) in the field ‘Email address’
    And I  press the button ‘Continue’ with the mouse, or I press the ‘enter’ button on the keyboard
    Then I should see one message ‘Please ensure you have entered the correct email address’ on current page

*/
    @Test (description = "unsuccessful transition to the confirmation page")
    public void assertConformationPageNon(){
        mainFactoryPage.clickOnTrustButton();
        mainFactoryPage.clickOnAccountLink();
        loginPage.inputEmailAddressRegistration();
        loginPage.clickContinueButton();
        boolean actualResult = loginPage.isErrorMassageDisplayed();
        Assert.assertEquals(actualResult, true, "Error Massage isn't visible");


    }


}
