package com.codecool.pom;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

class RadioButtonsPageTest extends Utilities {

    @Test
    void radioButtons() {
        homePage.navigateToRadioButtons();
        radioButtonsPage.selectCombination();
        Assert.assertTrue(radioButtonsPage.validateResult("Sex : Female\nAge group: 15 - 50"));
    }

}