package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;




public class PersonalAccountPage extends FactoryPage {

    @FindBy(id = "wiggle")
    private WebElement accountPage;

    public boolean isAccountPageDisplayed() {
        return accountPage.isDisplayed();
    }


}
