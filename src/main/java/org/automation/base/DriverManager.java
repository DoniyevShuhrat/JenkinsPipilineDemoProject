package org.automation.base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class DriverManager {
private static AppiumDriver<MobileElement> driver;
private static Properties props;

    /**
     * Driver yaratish metodi.
     * application.properties ichidan sozlamalarni o'qiydi.
     */
    public static void createDriver() {
        // platform, capabilities, server URL, etc. ni sozlash
        // driver = new AppiumDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        loadConfig(); // Configni faqat 1 marta yuklash

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", props.getProperty("platformName"));
        caps.setCapability("deviceName", props.getProperty("deviceName"));
        caps.setCapability("appPackage", props.getProperty("appPackage"));
        caps.setCapability("appActivity", props.getProperty("appActivity"));
        caps.setCapability("automationName", props.getProperty("automationName"));
        caps.setCapability("app", props.getProperty("app"));

        try {
            // AndroidDriver yoki iOSDriver - platformga qarab
            driver = new AndroidDriver<>(
                    new URL(props.getProperty("serverUrl")),
                    caps
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *  Config faylini (application.properties) yuklash, props ga joylaydi.
     */
    private static void loadConfig(){
        if(props == null){
            props = new Properties();
            try (FileInputStream input = new FileInputStream("src/main/resources/config/application.properties")){
                props.load(input);
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    /**
     *  Testlarda Driver'ni olish uchun getter
     */
    public static AppiumDriver<MobileElement> getDriver(){
        return driver;
    }

    /**
     *  Test tugagach, driver'ni yopish
     */
    public static void quitDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }
}
