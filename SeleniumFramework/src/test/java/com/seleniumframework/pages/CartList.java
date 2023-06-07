package com.seleniumframework.pages;

import com.seleniumframework.base.BaseClass;
import org.openqa.selenium.By;
import org.testng.Assert;

public class CartList extends BaseClass {
    private By cartButton = By.xpath("/html/body/div[2]/header/div[2]/div[1]/a");
    private By SelectedProductText = By.xpath("//*[@id='minicart-content-wrapper']/div[2]/div[4]");
private By proccedToCheckOutButton = By.id("top-cart-btn-checkout");

String ActualUrl = "https://magento.softwaretestingboard.com/checkout/";
String ExpectedUrl = driver.getCurrentUrl();



public void CartShouldShouldDisplaySelectedProducts(){
    driver.findElement(cartButton).click();
    driver.findElement(SelectedProductText).click();
}
public void ProceedToCheckOut(){
    driver.findElement(proccedToCheckOutButton).click();
}
public void VerifyUserOnChechoutPage(){
    Assert.assertEquals(ActualUrl,ExpectedUrl);
}

}
