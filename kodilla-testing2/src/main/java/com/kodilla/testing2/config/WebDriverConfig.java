package com.kodilla.testing2.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverConfig {

    public final static String CHROME = "CHROME_DRIVER";
    public final static String FIREFOX = "FIREFOX_DRIVER";

    public static WebDriver getDriver(final String driver) {
        System.setProperty("webdriver.chrome.driver","d:\\Java\\Selenium-drivers\\Chrome\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","d:\\Java\\Selenium-drivers\\FireFox\\geckodriver.exe");

        if (driver.equals(CHROME)) {
            return new ChromeDriver();
        }else {
            return null;
        }
    }
}
