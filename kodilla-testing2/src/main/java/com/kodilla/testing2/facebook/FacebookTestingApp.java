package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_SELECT_DAY = "//div[@class=\"_5k_5\"]/span/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "//div[@class=\"_5k_5\"]/span/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//div[@class=\"_5k_5\"]/span/span/select[3]";
    public static final String XPATH_SELECT_NAME = "//div[@class=\"_1ixn\"]/div/div/div/div/input";
    public static final String XPATH_SELECT_SURNAME = "//div[@class=\"_1ixn\"]/div/div[2]/div/div/input";
    public static final String XPATH_SELECT_PHONE = "//div[@class=\"mbm _a4y\"]/div/div/input";
    public static final String XPATH_SELECT_PASSWORD = "//div[@class=\"mbm _br- _a4y\"]/div/div/input";
    public static final String XPATH_SELECT_LABELMALE = "//div[@class=\"mtm _5wa2 _5dbb\"]/span/span[2]/input";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com");

        WebElement selectComboDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectBoardDay = new Select(selectComboDay);
        selectBoardDay.selectByValue("24");

        WebElement selectComboMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectBoardMonth = new Select(selectComboMonth);
        selectBoardMonth.selectByIndex(1);

        WebElement selectComboYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectBoardYear = new Select(selectComboYear);
        selectBoardYear.selectByValue("1991");

        WebElement searchFieldName = driver.findElement(By.xpath(XPATH_SELECT_NAME));
        searchFieldName.sendKeys("Arkadiusz");

        WebElement searchFieldSurname = driver.findElement(By.xpath(XPATH_SELECT_SURNAME));
        searchFieldSurname.sendKeys("Matysiak");

        WebElement searchFieldPhone = driver.findElement(By.xpath(XPATH_SELECT_PHONE));
        searchFieldPhone.sendKeys("725 187 619");

        WebElement searchFieldPassword = driver.findElement(By.xpath(XPATH_SELECT_PASSWORD));
        searchFieldPassword.sendKeys("password");

        WebElement searchFieldLabelMale = driver.findElement(By.xpath(XPATH_SELECT_LABELMALE));
        searchFieldLabelMale.click();
    }
}
