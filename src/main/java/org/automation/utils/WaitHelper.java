package org.automation.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import java.time.Duration;

public class WaitHelper {

    private final WebDriverWait wait;

    public WaitHelper(AppiumDriver<MobileElement> driver, long timeoutInSeconds) {
        this.wait = new WebDriverWait(driver, timeoutInSeconds);
    }

    public MobileElement waitForElementVisibility(MobileElement element){
        return (MobileElement) wait.until(ExpectedConditions.visibilityOf(element));
    }

    // Boshqa wait methodlarini ham qo'shish mumkin:
    // public boolean waitForInvisibility(...)
    // public MobileElement waitForClickable(...)
}
