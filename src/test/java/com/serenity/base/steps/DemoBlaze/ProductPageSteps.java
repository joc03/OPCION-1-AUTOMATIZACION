package com.serenity.base.steps.DemoBlaze;

import com.serenity.base.pageobject.DemoBlaze.AgregarCarrito.HomePage;
import com.serenity.base.pageobject.DemoBlaze.AgregarCarrito.ProductPage;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ProductPageSteps {

    private static final Logger logger = LoggerFactory.getLogger(ProductPageSteps.class);
    public int TIME =5;
    public ProductPage productPage;
    public HomePage homePage;
    public WebDriver webDriver;
   // public WebDriverWait w = new WebDriverWait(webDriver,TIME);


    public void volverAlHome() {

        productPage.lnkHome.click();
      //  w.until(ExpectedConditions.presenceOfElementLocated ((By) homePage.linkSansumgS6));
        logger.info("Regresando a la HomePage");

    }

    public void irAlCarrito() {
        productPage.lnkCart.click();
        logger.info("Ingresando al Carrito de Compras");

    }



}
