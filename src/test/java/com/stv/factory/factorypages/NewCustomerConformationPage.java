package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewCustomerConformationPage extends FactoryPage {
    @FindBy(xpath = "//*[@id=\"RegisterModel_Email\"]")
    private WebElement registerModelEmail;

    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
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


