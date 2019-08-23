package com.codecool.pom;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SelectDropdownListPageTest extends Utilities {

    @Test
    void selectList() {
        homePage.navigateToSelectDropdownList();
        selectDropdownListPage.selectADay("Monday");
        Assert.assertTrue(selectDropdownListPage.validateDay("Day selected :- Monday"));
    }

}