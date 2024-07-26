package com.serenity.base.pageobject.DemoBlaze.AgregarCarrito;



import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.demoblaze.com/")


public class HomePage extends PageObject {

    @FindBy(linkText = "Samsung galaxy s6")
    public WebElement linkSansumgS6;

    @FindBy(linkText = "Nexus 6")
    public WebElement linkNexus6;

    @FindBy(id = "signin2")
    public WebElement btnSignIn;








}
