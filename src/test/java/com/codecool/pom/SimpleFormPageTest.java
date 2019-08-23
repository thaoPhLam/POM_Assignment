package com.codecool.pom;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class SimpleFormPageTest extends Utilities {


    @Test
    void testNavigation() {
        homePage.navigateToSimpleFormDemo();
        Assert.assertTrue(simpleFormPage.validateNavigation());
    }

    @Test
    void singleFieldAndButton() {
        homePage.navigateToSimpleFormDemo();
        simpleFormPage.enterMessage("test message");
        Assert.assertTrue(simpleFormPage.validateMessage("test message"));
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/twoFieldsAndOutput.csv", numLinesToSkip = 1)
    void twoFieldsAndOutput(String input1, String input2, String expected) {
        homePage.navigateToSimpleFormDemo();
        simpleFormPage.enterValues(input1, input2);
        Assert.assertTrue(simpleFormPage.validateTotalValue(expected));
    }

}


