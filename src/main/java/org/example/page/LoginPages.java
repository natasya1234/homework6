package org.example.page;

import org.example.data.AccountData;

import static org.example.base.BaseClass.driver;
import static org.example.locators.LoginLocator.*;

public class LoginPages {
    public static void inputUsername(){
        driver.findElement(INPUT_USERNAME).sendKeys(AccountData.username);
    }
    public static void inputPassword(){
        driver.findElement(INPUT_PASSWORD).sendKeys(AccountData.password);
    }
    public static void btnLogin(){
        driver.findElement(BTN_LOGIN).click();
    }
    public static String homePage(){
       return driver.findElement(HOME_PAGE).getText();
    }
    }

