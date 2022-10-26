package com.stv.factory.factorytests;

import com.stv.factory.factorypages.LoginPage;
import com.stv.factory.factorypages.MainFactoryPage;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import com.stv.factory.factorypages.PersonalAccountPage;



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


    @Test (description = "Assert the account page is loaded")
    public void assertAccountPageOpened(){
        mainFactoryPage.clickOnTrustButton();
        mainFactoryPage.clickOnAccountLink();
        loginPage.inputEmailAddress();
        loginPage.inputEmailPassword();
        loginPage.clickSignInButton();
        Assert.assertEquals(personalAccountPage.isAccountPageDisplayed(), true, "Account page isn't loaded properly");

    }


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
