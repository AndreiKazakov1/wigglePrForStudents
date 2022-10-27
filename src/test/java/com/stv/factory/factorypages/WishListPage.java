package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends FactoryPage {
    @FindBy(id = "wishlistLink")
    private WebElement wishListLink;

    @FindBy(css = "#wiggle > div.bem-wishlist.container > div:nth-child(2) > div > div")
    private WebElement wishListEmpty;

    @FindBy(css = "#wiggle > div.bem-wishlist.container > div:nth-child(2) > div > div > a")
    private WebElement startShippingButton;

    public void setWishListLink() {
        wishListLink.click();
    }

    public boolean wishListIsEmpty() {
        return wishListEmpty.isDisplayed();
    }

    public void startShippingButtonClick() {
        startShippingButton.click();
    }
}

