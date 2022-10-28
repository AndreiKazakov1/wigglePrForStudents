package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewCustomerConformationPage extends FactoryPage {
    @FindBy(xpath = "//*[@id=\"RegisterModel_Email\"]")
    private WebElement registerModelEmail;

    @FindBy(xpath = "//*[@id=\"wiggle\"]/div/div[1]/div[1]/p/a")
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


#wiggle > div > div:nth-child(1) > div:nth-child(1) > p > a
        #wiggle > div > div:nth-child(1) > div:nth-child(1) > p > a
//*[@id="wiggle"]/div/div[1]/div[1]/p/a
<a href="https://www.wiggle.co.uk/secure/myaccount/logon?ReturnUrl=%2Fsecure%2Faccount">Sign in</a>