package com.codecool.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

class HomePage {

    private WebDriver driver;
    private By inputFormsBtn = By.linkText("Input Forms");
    private By selectSimpleFormDemo = By.linkText("Simple Form Demo");
    private By selectCheckboxDemo = By.linkText("Checkbox Demo");
    private By selectDropdownList = By.linkText("Select Dropdown List");
    private By selectRadioButtons = By.linkText("Radio Buttons Demo");

    HomePage(WebDriver driver) {
        this.driver = driver;
    }

    void openTheBaseUrl(String url) {
        driver.navigate().to(url);
        driver.findElement(inputFormsBtn).click();
    }

    void navigateToSimpleFormDemo() {
        driver.findElement(selectSimpleFormDemo).click();
    }

    void navigateToCheckboxDemo() {
        driver.findElement(selectCheckboxDemo).click();
    }

    void navigateToSelectDropdownList() {
        driver.findElement(selectDropdownList).click();
    }

    void navigateToRadioButtons() {
        driver.findElement(selectRadioButtons).click();
    }

    void closeDriver() {
        driver.close();
    }

}
