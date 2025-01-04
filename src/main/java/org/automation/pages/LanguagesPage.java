package org.automation.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LanguagesPage {
    private AppiumDriver<MobileElement> driver;

    @AndroidFindBy(id = "com.oson:id/ru_linear_layout")
    private MobileElement russianLanguageRBtn;

    @AndroidFindBy(id = "com.oson:id/action_button")
    private MobileElement nextBtn;

    public LanguagesPage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }
    public void selectRussianLanguage(){
        russianLanguageRBtn.click();
    }

    public void tapNextBtn(){
        nextBtn.click();
    }
}
