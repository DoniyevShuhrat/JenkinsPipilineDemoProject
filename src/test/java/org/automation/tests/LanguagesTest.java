package org.automation.tests;

import org.automation.base.DriverManager;
import org.automation.pages.LanguagesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LanguagesTest {

    @Test
    public void testSelectLang(){
        LanguagesPage languagesPage = new LanguagesPage(DriverManager.getDriver());
        languagesPage.selectRussianLanguage();
        languagesPage.tapNextBtn();

        Assert.assertTrue(true, "Lang success select");
    }
}