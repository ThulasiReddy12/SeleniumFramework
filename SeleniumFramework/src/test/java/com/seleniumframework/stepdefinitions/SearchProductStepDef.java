package com.seleniumframework.stepdefinitions;

import com.seleniumframework.pages.SearchProduct;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProductStepDef extends PageObjects {
    @Then("verify searched product list should display")
    public void verifySearchedProductListShouldDisplay() {
        homepage.verifysearchedProductsIsDisplayed();
    }

    @When("User selected Product")
    public void userSelectedProduct() {
        searchProduct.selectProductspecifications();
    }


    @Then("Click on the add to Cart")
    public void clickOnTheAddToCart() {
        searchProduct.addToCort();
    }
}



