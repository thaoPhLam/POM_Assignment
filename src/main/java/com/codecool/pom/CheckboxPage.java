package com.codecool.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

class CheckboxPage {

    private WebDriver driver;
    private By checkbox = By.id("isAgeSelected");
    private By successMessage = By.id("txtAge");

    CheckboxPage(WebDriver driver) {
        this.driver = driver;
    }


    void clickOnCheckbox() {
        driver.findElement(checkbox).click();
    }

    boolean validateCheckbox(String message) {
        return driver.findElement(successMessage).getText().equals(message);
    }

}
