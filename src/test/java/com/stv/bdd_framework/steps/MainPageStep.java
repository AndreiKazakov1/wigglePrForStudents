package com.stv.bdd_framework.steps;

import com.stv.factory.factorypages.LoginPage;
import com.stv.factory.factorypages.MainFactoryPage;
import com.stv.factory.factorytests.BasicFactoryTest;
import io.cucumber.java.AfterStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;
import static com.stv.framework.core.lib.WigglePageURLs.START_URL;


public class MainPageStep extends BasicFactoryTest {
    MainFactoryPage mainFactoryPage = new MainFactoryPage();
    LoginPage loginPage = new LoginPage();

    @Given("Main page is loaded")
    public void accountLincIsDisplayed(){
        WebDriver driver = getDriver();
        driver.get(START_URL);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Assert.assertTrue(mainFactoryPage.isAccountLinkDisplayed(), "Account link isn't visible");

    }

    @When("Click on trustButton")
    public void clickTrustButton(){
        mainFactoryPage.clickOnTrustButton();
    }

    @And("Click on account link")
    public void clickAccountLink(){
        mainFactoryPage.clickOnAccountLink();
    }

    @Then("Login page is loaded")
    public void isLoginPageDisplayed(){
        Assert.assertTrue(loginPage.isLoginContainerDisplayed(), "Login page isn't loaded properly");
    }

    @And("Close browser")
    public void closeBrowser(){
        getDriver().close();
    }



}
