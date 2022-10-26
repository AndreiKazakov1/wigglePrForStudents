package com.stv.bdd_framework.steps;

import com.stv.factory.factorypages.LoginPage;
import com.stv.factory.factorypages.NewCustomerConformationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class PersonalTaskSteps {
    LoginPage loginPage = new LoginPage();
    NewCustomerConformationPage newCustomerConformationPage = new NewCustomerConformationPage();

    @Then("Conformation page is loaded")
    public void conformationPageIsLoaded() {
        Assert.assertTrue(newCustomerConformationPage.NCConformationPageDisplayed());
    }


    @And("Input valid email registration {string}")
    public void inputValidEmailRegistration(String addr) {
        loginPage.inputValidEmailRegAddressCuc(addr);
    }


    @Then("See email address like {string} in the email-field")
    public void canSeeEmailAddressInFieldSame(String adr) {
        Assert.assertEquals(adr, newCustomerConformationPage.getEmailValue());
    }



}
