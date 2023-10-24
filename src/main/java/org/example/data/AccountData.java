package org.example.data;

public interface AccountData {
    //Registered Account Login
    String username = "standard_user";
    String password = "secret_sauce";
    String homepage ="Products";

    //Item Data
    String item_name = "Sauce Labs Backpack";
    String item_price_currency_expect = "$29.99";
    String item_qty_expect = "1";

    //My Information
    String first_name = "admin1";
    String last_name = "adminn";
    String postal_code = "12405";

    //Checkout Overview
    String checkout_overview_page_name = "Checkout: Overview";

    //Complete page
    String complete_page_name = "Thank you for your order!";

    //Not Registered Account Login
    String invalid_username = "Marino";
    String invalid_password = "Marino";
//    String error_alert = "Epic sadface: Username and password do not match any user in this service";
}
