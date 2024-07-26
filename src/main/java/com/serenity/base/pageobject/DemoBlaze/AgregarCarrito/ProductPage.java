package com.serenity.base.pageobject.DemoBlaze.AgregarCarrito;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends PageObject {

    @FindBy(xpath = "//a[contains(text(),'Add to cart')]")
    public WebElement btnAddCart;

    @FindBy(partialLinkText = "Home")
    public WebElement lnkHome;


    @FindBy(partialLinkText = "Cart")
    public WebElement lnkCart;
}
