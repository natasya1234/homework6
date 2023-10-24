package org.example.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
    public static WebDriver driver;

    public static void setDriver() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    public static void navigateToHome(){
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        threadSleep();
    }
    public static void closeDriver(){
        threadSleep();
        driver.close();
        driver.quit();
    }
    public static void threadSleep(){
        try{
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
