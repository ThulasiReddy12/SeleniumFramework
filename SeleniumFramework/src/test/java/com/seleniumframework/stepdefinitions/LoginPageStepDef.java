package com.seleniumframework.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDef extends PageObjects {


    @Given("When user open login page")
    public void whenUserOpenLoginPage() {

    }

    @When("User login to application with {string} and {string} credentials")
    public void userLoginToApplicationWithAndCredentials(String username, String password) {
        loginPage.login(username,password);
    }

    @Then("Navigate to Home Page title as {string}")
    public void navigateToHomePageTitleAs(String arg0) {
        loginPage.VerifyHomepageTitle();
    }

}
