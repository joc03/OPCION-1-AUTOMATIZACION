package com.serenity.base.stepDefinitions;

import com.serenity.base.pageobject.DemoBlaze.AgregarCarrito.ProductPage;

import com.serenity.base.steps.DemoBlaze.ProductPageSteps;
import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;

public class ProductPageStepDefinition {
    @Steps
    public ProductPageSteps productPageSteps;

    @And("vuelvo a la pagina de inicio")
    public void vuelvoALaPaginaDeInicio() { productPageSteps.volverAlHome();}

    @And("ingreso a la pagina del carrito")
    public void ingresoALaPaginaDelCarrito() {  productPageSteps.irAlCarrito();}
}
