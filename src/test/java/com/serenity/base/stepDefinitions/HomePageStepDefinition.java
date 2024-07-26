package com.serenity.base.stepDefinitions;

import com.serenity.base.steps.DemoBlaze.HomePageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class HomePageStepDefinition {
    @Steps
    public HomePageSteps homePageSteps;

    @Given("el usuario debe de encontrarse en la pagina de DemoBlaze")
    public void elUsuarioDebeDeEncontrarseEnLaPaginaDeDemoBlaze() {
        homePageSteps.openBrowser();
    }

    @When("agrego el primer producto al carrito {string}")
    public void agregoElPrimerProductoAlCarrito(String producto1) {
        homePageSteps.agregarProducto(producto1);
    }

    @And("agrego el segundo producto al carrito {string}")
    public void agregoElSegundoProductoAlCarrito(String producto2){
        homePageSteps.agregarProducto(producto2);
    }



}
