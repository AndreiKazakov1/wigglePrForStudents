package com.stv.bdd_framework.steps;

import com.stv.factory.factorypages.LoginPage;
import com.stv.factory.factorypages.NewCustomerConformationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class PersonalTaskSteps {
    LoginPage loginPage = new LoginPage();
    NewCustomerConformationPage newCustomerConformationPage = new NewCustomerConformationPage();


    @And("Input valid email registration {string}")
    public void inputValidEmailRegistration(String addr) {
        loginPage.inputValidEmailRegAddressCuc(addr);
    }


    @Then("Can see email address in field same {string}")
    public void canSeeEmailAddressInFieldSame(String adr) {
        Assert.assertEquals(adr, newCustomerConformationPage.getEmailValue());
    }
}
