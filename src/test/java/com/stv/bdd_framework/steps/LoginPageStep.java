package com.stv.bdd_framework.steps;

import com.stv.factory.factorypages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import static com.stv.framework.core.lib.Const.VALID_EMAIL;

public class LoginPageStep {
    LoginPage loginPage = new LoginPage();

    @When("The user inputs valid email {string}")
    public void theUserInputsValidEmail(String adr) {
        loginPage.inputEmailAddressCuc(adr);
    }

    @When("The user inputs valid {string}")
    public void theUserInputsValidPassword(String pass) {
        loginPage.inputEmailPasswordCuc(pass);
    }

    @And("The user click continue button")
    public void clickContButton(){

    }
}
