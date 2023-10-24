package org.example.page;

import org.example.data.AccountData;
import org.testng.Assert;

import static org.example.base.BaseClass.driver;
import static org.example.locators.CheckoutLocator.*;
import static org.example.locators.CompleteLocator.*;
import static org.example.locators.CheckoutOverviewLocator.*;

public class CheckoutPages {
    public static void btnCheckout(){
        driver.findElement(BUTTON_CHECKOUT).click();
    }
    public static void inputFirstName(){
        driver.findElement(FIRST_NAME).sendKeys(AccountData.first_name);
    }
    public static void inputLastName(){
        driver.findElement(LAST_NAME).sendKeys(AccountData.last_name);
    }
    public static void inputPostalCode(){
        driver.findElement(POSTAL_CODE).sendKeys(AccountData.postal_code);
    }
    public static void btnContinue(){
        driver.findElement(BUTTON_CONTINUE).click();
    }
    public static void  btnFinish(){
        driver.findElement(BUTTON_FINISH).click();
    }
    //Assertion
    public static String checkoutPages(){
        return driver.findElement(CHECKOUT_OVERVIEW_PAGE).getText();
    }
    public static String completePage(){
        return driver.findElement(COMPLETE_PAGE).getText();
    }
}
