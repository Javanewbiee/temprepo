package com.kodilla.testing.crudapp.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_DAY = "//div[@class=\"_5k_5\"]span/span/select[1]";
    public static final String XPATH_MONTH = "//div[@class=\"_5k_5\"]span/span/select[2]";
    public static final String XPATH_YEAR = "//div[@class=\"_5k_5\"]span/span/select[3]";

    public static void main(String[] args) {

        WebDriver webDriver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        webDriver.get("https://www.facebook.com");

        WebElement dayInput = webDriver.findElement(By.xpath(XPATH_DAY));
        Select daySelect = new Select(dayInput);
        daySelect.selectByIndex(10);

        WebElement monthInput = webDriver.findElement(By.xpath(XPATH_MONTH));
        Select monthSelect = new Select(monthInput);
        monthSelect.selectByIndex(7);

        WebElement yearInput = webDriver.findElement(By.xpath(XPATH_YEAR));
        Select yearSelect = new Select(yearInput);
        yearSelect.selectByIndex(34);



    }
}
