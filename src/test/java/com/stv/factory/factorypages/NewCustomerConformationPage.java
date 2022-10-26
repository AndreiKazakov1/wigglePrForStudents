package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static com.stv.framework.core.lib.Const.*;

public class NewCustomerConformationPage extends FactoryPage{
    @FindBy(xpath = "//*[@id=\"RegisterModel_Email\"]")
    private WebElement registerModelEmail;

    public String getEmailValue(){
       return registerModelEmail.getAttribute("value");
    }
}


