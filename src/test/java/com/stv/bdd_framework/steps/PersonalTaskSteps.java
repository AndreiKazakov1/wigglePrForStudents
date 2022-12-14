package com.stv.bdd_framework.steps;

import com.stv.factory.factorypages.LoginPage;
import com.stv.factory.factorypages.NewCustomerConformationPage;
import com.stv.factory.factorypages.WishListPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import com.stv.framework.core.utils.RandomEmailMaker;


public class PersonalTaskSteps {
    LoginPage loginPage = new LoginPage();
    NewCustomerConformationPage newCustomerConformationPage = new NewCustomerConformationPage();
    WishListPage wishListPage = new WishListPage();
    RandomEmailMaker randomEmailMaker = new RandomEmailMaker();

    @Then("Conformation page is loaded")
    public void conformationPageIsLoaded() {
        Assert.assertTrue(newCustomerConformationPage.NCConformationPageDisplayed());
    }

    @And("Input valid email registration address")
    public void inputValidEmailRegistration() {
        loginPage.inputValidEmailRegAddressCuc(randomEmailMaker.email);
    }

    @When("Entered email address  is visible in the email-field")
    public void canSeeEmailAddressInFieldSame() {
        Assert.assertEquals(randomEmailMaker.email, newCustomerConformationPage.getEmailValue());
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

    @And("Confirm that wishlist is empty")
    public void confirmThatWishlistIsEmpty() {
        Assert.assertTrue(wishListPage.wishListIsEmpty());
    }

    @And("Click start shopping button")
    public void clickStartShoppingButton() {
        wishListPage.startShippingButtonClick();
    }
}
