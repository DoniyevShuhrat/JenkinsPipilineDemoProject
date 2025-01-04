package org.automation.base;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    @BeforeClass
    public void setUp(){
        DriverManager.createDriver();
    }

    @AfterClass
    public void tearDown(){
        DriverManager.quitDriver();
    }
}
