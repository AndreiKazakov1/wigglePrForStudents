package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends FactoryPage{
    @FindBy(css = "#wishlistLink")
    private WebElement wishListLink;

    public void setWishListLink(){ wishListLink.click();}





}
