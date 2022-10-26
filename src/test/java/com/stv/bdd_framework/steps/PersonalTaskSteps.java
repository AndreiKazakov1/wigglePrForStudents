package com.stv.bdd_framework.steps;

import com.stv.factory.factorypages.LoginPage;
import com.stv.factory.factorypages.NewCustomerConformationPage;
import com.stv.factory.factorypages.WishListPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;



public class PersonalTaskSteps {
    LoginPage loginPage = new LoginPage();
    NewCustomerConformationPage newCustomerConformationPage = new NewCustomerConformationPage();
    WishListPage wishListPage = new WishListPage();

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

    @When("Make next click on sign in button")
    public void makeNextClickSignInButton() {
        newCustomerConformationPage.clickSignInButtonConform();
    }

    @And("Click on Wiggle widget")
    public void clickOnWiggleWidget() {
        loginPage.clickOnWiggleIcon();
    }


    @When("Click wishlist link")
    public void clickWishlistLink() {
    wishListPage.setWishListLink();
    }


    @Then("Confirm that wishlist is empty")
    public void confirmThatWishlistIsEmpty() {
    }

    @When("Click start shopping button")
    public void clickStartShoppingButton() {
    }


}
    /*And Wishlist is loaded
    Then Confirm that wishlist is empty
    When Click start shopping button
        Then Main page is loaded
        And Close browser*/