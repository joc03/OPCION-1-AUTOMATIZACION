package com.serenity.base.steps.DemoBlaze;


import com.serenity.base.pageobject.DemoBlaze.AgregarCarrito.HomePage;
import com.serenity.base.pageobject.DemoBlaze.AgregarCarrito.ProductPage;
import com.serenity.base.pageobject.DemoBlaze.AgregarCarrito.ShoppingCartPage;
import net.thucydides.core.annotations.Step;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;


public class HomePageSteps {
    private static final Logger logger = LoggerFactory.getLogger(HomePageSteps.class);
    public HomePage homePage;
    public ShoppingCartPage shoppingCartPage;

    public ProductPage productPage;


    public void pause(Integer seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step
    public void openBrowser() {
        homePage.open();
        logger.info("Inicializando la pagina de DemoBlaze");
    }

    public void seleccionarProducto(String producto) {
        pause(3);

        switch (producto.toUpperCase()){
            case "SANSUMG S6": homePage.linkSansumgS6.click(); break;
            case "NEXUS 6": homePage.linkNexus6.click(); break;

        }

        logger.info("Seleccionando el "+producto+" para añadir al carrito");

    }

    public void agregarProducto(String producto){
        try {
            seleccionarProducto(producto);
            pause(3);
            productPage.btnAddCart.click();
            logger.info("HACIENDO CLIC A ADDD CART");
            pause(3);
            Robot robot = new Robot();
            //Press key ENTER
            robot.keyPress(KeyEvent.VK_ENTER);
            logger.info("PRESIONANDO ENTER");

            logger.info("Agregando el "+producto+" para añadir al carrito");
        }catch (Exception e){}


    }




    }

