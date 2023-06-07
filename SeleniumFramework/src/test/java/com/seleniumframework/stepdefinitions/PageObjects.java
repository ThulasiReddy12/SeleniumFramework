package com.seleniumframework.stepdefinitions;

import com.seleniumframework.base.BaseClass;
import com.seleniumframework.pages.CartList;
import com.seleniumframework.pages.HomePage;
import com.seleniumframework.pages.LoginPage;
import com.seleniumframework.pages.SearchProduct;

public class PageObjects extends BaseClass {
    public static LoginPage loginPage = new LoginPage();
    public static HomePage homepage = new HomePage();

    public static SearchProduct searchProduct = new SearchProduct();

    public static CartList cartlist = new CartList() ;

}
