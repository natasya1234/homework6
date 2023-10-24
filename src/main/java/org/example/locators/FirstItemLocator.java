package org.example.locators;

import org.openqa.selenium.By;

public interface FirstItemLocator {
    By ITEM_NAME = By.xpath("//*[@id=\"item_4_title_link\"]/div");
    By ITEM_QTY = By.xpath("//div[text()=\"1\"]");
    By ITEM_PRICE_CURRENCY = By.xpath("//div[text()=\"$\"][text()=\"29.99\"]");
}
