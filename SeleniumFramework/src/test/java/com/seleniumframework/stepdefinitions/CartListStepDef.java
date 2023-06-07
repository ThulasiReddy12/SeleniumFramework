package com.seleniumframework.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartListStepDef extends  PageObjects{
    @When("User open cartList")
    public void userOpenCartList() {

    }

    @Then("SelectedProductShouldDisplay")
    public void selectedproductshoulddisplay() {
        cartlist.CartShouldShouldDisplaySelectedProducts();

    }

    @And("ProceedToCheckOutTheSelectedProduct")
    public void proceedtocheckouttheselectedproduct() {
       cartlist.ProceedToCheckOut();

    }

    @And("verify user on CheckoutPage")
    public void verifyUserOnCheckoutPage() {
        cartlist.VerifyUserOnChechoutPage();
    }
}
