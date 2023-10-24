package org.example.locators;
import org.openqa.selenium.By;
public interface LoginLocator {
    By INPUT_USERNAME = By.id("user-name");
    By INPUT_PASSWORD = By.id("password");
    By BTN_LOGIN = By.id("login-button");
    By HOME_PAGE = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
}
