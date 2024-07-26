package com.serenity.base.steps.DemoBlaze;

import com.serenity.base.pageobject.DemoBlaze.AgregarCarrito.ShoppingCartPage;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShoppingCartSteps {
    private static final Logger logger = LoggerFactory.getLogger(ProductPageSteps.class);
    public ShoppingCartPage shoppingCartPage;
    public WebDriver webDriver;


    public void llenarDato(String name,String country,String city,String creditCard,String year,String month){
        shoppingCartPage.txtName.sendKeys(name);
        shoppingCartPage.txtCountry.sendKeys(country);
        shoppingCartPage.txtCity.sendKeys(city);
        shoppingCartPage.txtCreditCard.sendKeys(creditCard);
        shoppingCartPage.txtYear.sendKeys(year);
        shoppingCartPage.txtMonth.sendKeys(month);
        logger.info("Llenando los datos");

    }

    public void clic(String boton){
        switch (boton.toUpperCase()){
            case "PLACE ORDER" : shoppingCartPage.btnPlaceOrder.click(); break;
            case "PURCHASE"    : shoppingCartPage.btnPurchase.click(); break;
            case "OK"          : shoppingCartPage.btnOk.click(); break;
            default: break;
        }

        logger.info("Haciendo clic en el boton "+boton);
    }




}
