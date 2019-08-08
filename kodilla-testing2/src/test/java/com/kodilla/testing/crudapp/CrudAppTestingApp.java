package com.kodilla.testing.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CrudAppTestingApp {

    public static final String XPATH_INPUT = "//html/body/main/section/form/fieldset/input";
    public static final String XPATH_FIELD = "//html/body/main/section/form/fieldset[2]/textarea";
    public static final String XPATH_SELECT = "//select[1]";
    public static final String XPATH_RELATIVESELECT = "//div[contains(@class, \"tasks-container\")]/form/div/fieldset/select[1]";

    public static void main(String[] args) {
        WebDriver webDriver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        webDriver.get("https://javanewbiee.github.io/");

        WebElement searchField = webDriver.findElement(By.xpath(XPATH_INPUT));
        searchField.sendKeys("New robotic task");

        WebElement textField = webDriver.findElement(By.xpath(XPATH_FIELD));
        textField.sendKeys("The robotic content");

        while (!webDriver.findElement(By.xpath(XPATH_SELECT)).isDisplayed());

        WebElement selectCombo = webDriver.findElement(By.xpath(XPATH_RELATIVESELECT));
        Select selectBoard = new Select(selectCombo);
        selectBoard.selectByIndex(1);
    }
}
