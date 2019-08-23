package com.codecool.pom;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

abstract class Utilities {

    HomePage homePage;
    SimpleFormPage simpleFormPage;
    CheckboxPage checkboxPage;
    SelectDropdownListPage selectDropdownListPage;
    RadioButtonsPage radioButtonsPage;

    @BeforeEach
    void setup() {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        homePage = new HomePage(driver);
        homePage.openTheBaseUrl("https://www.seleniumeasy.com/test/");
        simpleFormPage = new SimpleFormPage(driver);
        checkboxPage = new CheckboxPage(driver);
        selectDropdownListPage = new SelectDropdownListPage(driver);
        radioButtonsPage = new RadioButtonsPage(driver);
    }

    @AfterEach
    void closeThePage() {
        homePage.closeDriver();
    }

}
