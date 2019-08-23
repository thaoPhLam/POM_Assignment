package com.codecool.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class SimpleFormPage {

    private WebDriver driver;
    private By messageTextBox = By.id("user-message");
    private By showMessageButton = By.cssSelector(".btn:nth-child(2)");
    private By yourMessage = By.id("display");
    private By valueA = By.id("sum1");
    private By valueB = By.id("sum2");
    private By getTotalButton = By.cssSelector(".btn:nth-child(3)");
    private By totalValue = By.id("displayvalue");

    SimpleFormPage(WebDriver driver) {
        this.driver = driver;
    }

    boolean validateNavigation() {
        return driver.findElement(messageTextBox).isDisplayed();
    }

    void enterMessage(String message) {
        WebElement messageBox = driver.findElement(messageTextBox);
        messageBox.sendKeys(message);
        driver.findElement(showMessageButton).click();
    }

    boolean validateMessage(String message) {
        return driver.findElement(yourMessage).getText().equals(message);
    }

    void enterValues(String num1, String num2) {
        WebElement fieldA = driver.findElement(valueA);
        fieldA.sendKeys(num1);
        WebElement fieldB = driver.findElement(valueB);
        fieldB.sendKeys(num2);
        driver.findElement(getTotalButton).click();
    }

    boolean validateTotalValue(String total) {
        return driver.findElement(totalValue).getText().equals(total);
    }
}
