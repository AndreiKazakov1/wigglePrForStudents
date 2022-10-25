package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static com.stv.framework.core.lib.Const.*;


public class LoginPage extends FactoryPage {
    @FindBy(className = "bem-checkout__login-container")
    private WebElement loginContainer;

    public boolean isLoginContainerDisplayed(){
        return loginContainer.isDisplayed();
    }
//*************************************************************


    @FindBy(xpath = "//*[@id=\"LogOnModel_UserName\"]")
    private WebElement emailAddressField;

    @FindBy(xpath = "//*[@id=\"LogOnModel_Password\"]")
    private WebElement emailPasswordField;

    @FindBy(xpath = " //*[@id=\"qa-login\"]")
    private WebElement signInButton;


    public void inputEmailAddress(){emailAddressField.sendKeys(VALID_EMAIL);}

    public void inputEmailPassword(){emailPasswordField.sendKeys(VALID_PASSWORD);}

    public void clickSignInButton(){
        signInButton.click();
    }

}
