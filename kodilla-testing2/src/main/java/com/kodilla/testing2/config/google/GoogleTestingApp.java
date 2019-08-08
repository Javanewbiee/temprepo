package com.kodilla.testing2.config.google;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleTestingApp {

    public static final String SEARCHFIELD = "q";
    public static final String EBAYSEARCH = "gh-ac";

    public static void main(String[] args) {
       WebDriver webDriver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
       webDriver.get("https://www.google.com");

       //WebElement searchField = webDriver.findElement(By.name(SEARCHFIELD));
       //searchField.sendKeys("Kodilla");
       //searchField.submit();

       WebElement searchEbay = webDriver.findElement(By.id(EBAYSEARCH));
       searchEbay.sendKeys("Laptop");
       searchEbay.submit();
    }
}
