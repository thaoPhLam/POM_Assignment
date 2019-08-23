package com.codecool.pom;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CheckboxPageTest extends Utilities {

    @Test
    void singleCheckbox() {
        homePage.navigateToCheckboxDemo();
        checkboxPage.clickOnCheckbox();
        Assert.assertTrue(checkboxPage.validateCheckbox("Success - Check box is checked"));
    }

}