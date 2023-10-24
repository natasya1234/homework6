package org.example.page;
import org.example.data.AccountData;

import static org.example.base.BaseClass.driver;
import static org.example.locators.InvalidLoginLocator.*;

public class InvalidLoginPages {
    //functional
    public static void invalidInputUsername(){
        driver.findElement(INVALID_INPUT_USERNAME).sendKeys(AccountData.invalid_username);
    }
    public static void invalidInputPassword(){
        driver.findElement(INVALID_INPUT_PASSWORD).sendKeys(AccountData.invalid_password);
    }
    public static void invalidButtonLogin(){
        driver.findElement(INVALID_BUTTON_LOGIN).click();
    }
}
