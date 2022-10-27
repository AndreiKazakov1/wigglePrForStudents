package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewCustomerConformationPage extends FactoryPage {
    @FindBy(xpath = "//*[@id=\"RegisterModel_Email\"]")
    private WebElement registerModelEmail;

    @FindBy(css = "#wiggle > div > div:nth-child(1) > div:nth-child(1) > p > a")
    private WebElement signInlConf;

    public boolean NCConformationPageDisplayed() {
        return registerModelEmail.isDisplayed();
    }

    public String getEmailValue() {
        return registerModelEmail.getAttribute("value");
    }

    public void clickSignInButtonConform() {
        signInlConf.click();
    }
}


