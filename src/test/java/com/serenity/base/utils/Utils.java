package com.serenity.base.utils;

import com.serenity.base.pageobject.DemoBlaze.AgregarCarrito.ShoppingCartPage;
import com.serenity.base.steps.DemoBlaze.HomePageSteps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class Utils {
    public Utils utils;
    private static final Logger logger = LoggerFactory.getLogger(HomePageSteps.class);
  public static ShoppingCartPage shoppingCartPage;

    public void clic(String boton){
        switch (boton.toUpperCase()){
            case "PLACE_ORDER" : shoppingCartPage.btnPlaceOrder.click(); break;
            case "PURCHASE" : shoppingCartPage.btnPurchase.click(); break;
            case "OK" : shoppingCartPage.btnOk.click(); break;
        }

    }
    public void hacerClic(String boton){

        try {
            clic(boton);
            pause(3);
            logger.info("haciendo clic al boton "+boton);
        }catch (Exception e){}

    }



    public void pause(Integer seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
