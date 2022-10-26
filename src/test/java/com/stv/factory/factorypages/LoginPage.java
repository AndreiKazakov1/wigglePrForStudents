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

    @FindBy(xpath = "//*[@id=\"LogOnModel_UserName\"]")
    private WebElement emailAddressField;

    @FindBy(xpath = "//*[@id=\"LogOnModel_Password\"]")
    private WebElement emailPasswordField;

    @FindBy(xpath = " //*[@id=\"qa-login\"]")
    private WebElement signInButton;

    @FindBy(id="DualRegisterEmailModel_Email")
    private WebElement emailAddressFieldRegistration;

    @FindBy(id="qa-dual-register")
    private WebElement continueButton;

    @FindBy(id="DualRegisterEmailModel_Email-error")
    private WebElement emailErrorMassage;


    public void inputEmailAddress(){emailAddressField.sendKeys(VALID_EMAIL);}

    public void inputEmailPassword(){emailPasswordField.sendKeys(VALID_PASSWORD);}

    public void clickSignInButton(){ signInButton.click(); }

    public void inputEmailAddressRegistration(){emailAddressFieldRegistration.sendKeys(NEW_INVALID_EMAIL);}

    public void clickContinueButton(){continueButton.click();}

    public boolean isErrorMassageDisplayed(){return emailErrorMassage.isDisplayed();}

    public void inputEmailAddressCuc(String adr){emailAddressField.sendKeys(adr);}

    public void inputEmailPasswordCuc(String pass){emailPasswordField.sendKeys(pass);}

    public void inputInvalidEmailRegAddressCuc(String adds){emailAddressFieldRegistration.sendKeys(adds);}

    public void inputValidEmailRegAddressCuc(String adds){emailAddressFieldRegistration.sendKeys(adds);}
}
