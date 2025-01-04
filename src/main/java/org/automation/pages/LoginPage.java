package org.automation.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage {
    private AppiumDriver<MobileElement> driver;

    @AndroidFindBy(id = "com.example:id/username")
    private MobileElement usernameField;

    @AndroidFindBy(id = "com.example:id/password")
    private MobileElement passwordField;

    @AndroidFindBy(id = "com.example:id/loginBtn")
    private MobileElement loginButton;

    public LoginPage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        // PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void enterUsername(String username){
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password){
        passwordField.sendKeys(password);
    }

    public void tapLoginButton(){
        loginButton.click();
    }


}
