package com.juaracoding;


import com.juaracoding.driver.DriverSingleton;
import com.juaracoding.pages.LoginPage;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;

public class Hooks {
    static WebDriver driver;

    @BeforeAll
    public static void setUp(){
        DriverSingleton.getInstance("chrome");
        driver = DriverSingleton.getDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterAll
    public static void closeBrowser(){
        delay(3);
        DriverSingleton.closeObjectInstance();
    }

    public static void delay(long detik){
        try {
            Thread.sleep(detik*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
