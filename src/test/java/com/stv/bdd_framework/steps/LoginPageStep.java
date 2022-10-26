package com.stv.bdd_framework.steps;

import com.stv.factory.factorypages.LoginPage;
import com.stv.factory.factorypages.PersonalAccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class LoginPageStep {
    LoginPage loginPage = new LoginPage();
    PersonalAccountPage personalAccountPage = new PersonalAccountPage();

    @When("The user inputs valid email {string}")
    public void theUserInputsValidEmail(String adr) {
        loginPage.inputEmailAddressCuc(adr);
    }

    @When("The user inputs valid {string}")
    public void theUserInputsValidPassword(String pass) {
        loginPage.inputEmailPasswordCuc(pass);
    }

    @And("The user click sing in button")
    public void clickSignInButton(){
        loginPage.clickSignInButton();
    }

    @Then("Personal account page is loaded")
    public void accountPageDisplayed(){
        Assert.assertTrue(personalAccountPage.isAccountPageDisplayed(), "Account page isn't loaded properly");
    }

    @When("Input invalid email registration {string}")
    public void inputInvalidEmailRegistration(String adds) {
        loginPage.inputInvalidEmailRegAddressCuc(adds);
    }

    @And("Click continue button")
    public void clickContinueButton() {
        loginPage.clickContinueButton();
    }

    @Then("Error massage is displayed")
    public void errorMassageIsDisplayed() {
        Assert.assertTrue(loginPage.isErrorMassageDisplayed(), "Error Massage isn't visible");
    }
}


