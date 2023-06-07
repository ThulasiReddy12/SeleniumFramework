package com.seleniumframework.pages;

import com.seleniumframework.base.BaseClass;
import org.openqa.selenium.By;

public class SearchProduct extends BaseClass {
    private By selectProductxpath = By.xpath("//*[@id=\'maincontent\']/div[3]/div[1]/div[2]/div[2]/ol/li[1]/div/a/span/span/img");
    private By sizeOfProduct = By.id("option-label-size-143-item-170");
    private By colorOfProduct = By.xpath("//*[@id='option-label-color-93-item-50']");
    private By quantity = By.id("qty");
private By addToCartButtton = By.id("product-addtocart-button");
private By priceOfProdyct = By.xpath("//*[@id='product-price-542']/span");



    public void selectProductspecifications(){
        driver.findElement(selectProductxpath).click();
        driver.findElement(sizeOfProduct).click();
        driver.findElement(colorOfProduct).click();
        driver.findElement(quantity).sendKeys("2");

    }
public void addToCort(){
    driver.findElement(addToCartButtton).click();

}





}