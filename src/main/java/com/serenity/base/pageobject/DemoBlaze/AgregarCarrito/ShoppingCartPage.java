package com.serenity.base.pageobject.DemoBlaze.AgregarCarrito;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends PageObject {


    @FindBy(xpath = "//button[contains(text(),'Place Order')]")
    public WebElement btnPlaceOrder;

    @FindBy(id = "name")
    public WebElement txtName;

    @FindBy(id = "country")
    public WebElement txtCountry;

    @FindBy(id = "city")
    public WebElement txtCity;

    @FindBy(id = "card")
    public WebElement txtCreditCard;

    @FindBy(id = "month")
    public WebElement txtMonth;

    @FindBy(id = "year")
    public WebElement txtYear;

    @FindBy(xpath = "//button[contains(text(),'Purchase')]")
    public WebElement btnPurchase;

    @FindBy(xpath = "//button[contains(text(),'OK')]")
    public WebElement btnOk;

    @FindBy(xpath = "//h2[contains(text(),'Thank you for your purchase!')]")
    public WebElement txtFinCompra;



}
