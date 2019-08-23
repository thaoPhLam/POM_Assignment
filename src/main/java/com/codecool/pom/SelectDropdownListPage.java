package com.codecool.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

class SelectDropdownListPage {

    private WebDriver driver;
    private By select = By.id("select-demo");
    private By selectedDay = By.cssSelector(".selected-value");

    SelectDropdownListPage(WebDriver driver) {
        this.driver = driver;
    }

    void selectADay(String day) {
        WebElement element = driver.findElement(select);
        element.click();
        Select se = new Select(element);
        se.selectByVisibleText(day);
    }

    boolean validateDay(String dayValidator) {
        return driver.findElement(selectedDay).getText().equals(dayValidator);
    }

}
