package com.seleniumframework.pages;

import com.seleniumframework.base.BaseClass;
import com.seleniumframework.logs.Log;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginPage extends BaseClass {
private By loginLinkXpath = By.linkText("Sign In");
    private By emailIdXpath = By.id( "email");
   private  By passwordXpath = By.id("pass");
   private By loginBtXpath = By.xpath("//*[@id='send2']/span");



public void login(String username,String password) {

driver.findElement(loginLinkXpath).click();
driver.findElement(emailIdXpath).sendKeys(username);
Log.info("enter text as "+username);
driver.findElement(passwordXpath).sendKeys(password);
    Log.info("enter text as "+password);
driver.findElement(loginBtXpath).click();
}
    public void VerifyHomepageTitle() {
        String actualTitle = driver.getTitle();
        String expectedTitle = "Customer Login Magento Commerce - website to practice selenium | demo website for automation testing | selenium practice sites";
       Assert.assertEquals(actualTitle,expectedTitle);
        Log.info(actualTitle);
    }

}
