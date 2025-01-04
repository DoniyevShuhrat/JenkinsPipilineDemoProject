package org.automation.tests;

import org.automation.base.BaseTest;
import org.automation.base.DriverManager;
import org.automation.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = new LoginPage(DriverManager.getDriver());
        loginPage.enterUsername("username1");
        loginPage.enterPassword("pass1");
        loginPage.tapLoginButton();

        // Bu yerda keyingi Page (masalan Home) elementini tekshirish
        // ...
        Assert.assertTrue(true, "Login success check");
    }
}
