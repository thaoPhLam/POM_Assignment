package com.codecool.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

class RadioButtonsPage {

    private WebDriver driver;
    private By female = By.cssSelector(".panel-body > div:nth-child(2) > .radio-inline:nth-child(3) > input");
    private By overFifteen = By.cssSelector(".radio-inline:nth-child(4) > input");
    private By getValuesBtn = By.cssSelector(".btn:nth-child(5)");
    private By result = By.cssSelector(".groupradiobutton");

    RadioButtonsPage(WebDriver driver) {
        this.driver = driver;
    }

    void selectCombination() {
        driver.findElement(female).click();
        driver.findElement(overFifteen).click();
        driver.findElement(getValuesBtn).click();
    }

    boolean validateResult(String expectedResult) {
        return driver.findElement(result).getText().equals(expectedResult);
    }


}
