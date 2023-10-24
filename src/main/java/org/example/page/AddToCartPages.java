package org.example.page;

import org.example.locators.FirstItemLocator;

import static org.example.base.BaseClass.driver;
import static org.example.locators.AddToCart.*;
import static org.example.locators.FirstItemLocator.*;


public class AddToCartPages {
    //functional
    public static void ItemProduct(){
        driver.findElement(FIRST_ITEM_PRODUCT).click();
    }
    public static void btnAddToCart(){
        driver.findElement(BUTTON_ADD_TO_CART).click();
    }
    public static void shoppingCart(){
        driver.findElement(MY_SHOPPING_CART).click();
    }
    //Assertion
    public static String itemName(){
        return driver.findElement(ITEM_NAME).getText();
    }
    public static String itemQty() {
        return driver.findElement(ITEM_QTY).getText();
    }
    public static String itemPriceCurrency() {
        return driver.findElement(ITEM_PRICE_CURRENCY).getText();
    }
}
