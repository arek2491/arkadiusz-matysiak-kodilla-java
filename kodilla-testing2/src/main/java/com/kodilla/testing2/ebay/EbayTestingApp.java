package com.kodilla.testing2.ebay;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.kodilla.testing2.config.WebDriverConfig.CHROME;

public class EbayTestingApp {
    public static final String SEARCHFIELD = "gh-tb";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(CHROME);
        driver.get("https://www.ebay.com");

        WebElement searchField = driver.findElement(By.className(SEARCHFIELD));
        searchField.sendKeys("Laptop");
        searchField.submit();
    }
}
