package org.example.locators;

import org.openqa.selenium.By;

public interface AddToCart {
    By FIRST_ITEM_PRODUCT = By.cssSelector("a[id=\"item_4_img_link\"]");
    By BUTTON_ADD_TO_CART = By.cssSelector("button[id=\"add-to-cart-sauce-labs-backpack\"]");
    By MY_SHOPPING_CART = By.cssSelector("a[class=\"shopping_cart_link\"]");
}
