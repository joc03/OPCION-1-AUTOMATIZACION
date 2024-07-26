package com.serenity.base.stepDefinitions;

import com.serenity.base.pageobject.DemoBlaze.AgregarCarrito.ShoppingCartPage;
import com.serenity.base.steps.DemoBlaze.ShoppingCartSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;



public class ShoppingCartStepDefinition {
    @Steps
    public ShoppingCartSteps shoppingCartSteps;

    public ShoppingCartPage shoppingCartPage;

    @And("relleno con los datos que me solicitan {string}, {string}, {string}, {string}, {string}, {string}")
    public void rellenoConLosDatosQueMeSolicitan(String name,String country,String city,String creditCard,String year,String month) {
        shoppingCartSteps.llenarDato(name,country,city,creditCard,year,month);

    }


    @And("hago clic en el boton {string}")
    public void hagoClicEnElBoton(String boton) throws InterruptedException {
        shoppingCartSteps.clic(boton);

    }

    @Then("aparecera un cuadro con los datos de la compra, validando que diga {string}")
    public void apareceraUnCuadroConLosDatosDeLaCompraValidandoQueDiga(String FinCompra) {
        Assert.assertEquals(FinCompra, shoppingCartPage.txtFinCompra.getText());
    }



}
