package org.example.locators;

import org.openqa.selenium.By;

public interface InvalidLoginLocator {
    By INVALID_INPUT_USERNAME = By.id("user-name");
    By INVALID_INPUT_PASSWORD = By.id("password");
    By INVALID_BUTTON_LOGIN = By.id("login-button");
}
