package org.example.locators;

import org.openqa.selenium.By;

public interface CheckoutLocator {
    By BUTTON_CHECKOUT = By.cssSelector("button[id=\"checkout\"]");
    By FIRST_NAME = By.cssSelector("input[id=\"first-name\"]");
    By LAST_NAME = By.cssSelector("input[id=\"last-name\"]");
    By POSTAL_CODE = By.cssSelector("input[id=\"postal-code\"]");
    By BUTTON_CONTINUE = By.cssSelector("input[id=\"continue\"]");
    By BUTTON_FINISH = By.cssSelector("button[id=\"finish\"]");
}
