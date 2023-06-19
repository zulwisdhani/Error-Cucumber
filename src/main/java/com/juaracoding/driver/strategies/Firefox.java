package com.juaracoding.driver.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements DriverStrategy {
    @Override
    public WebDriver setStrategy() {
        System.setProperty("webdriver.chrome.driver", "F:\\Pelatihan Juara Coding SQA\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new FirefoxDriver();
        return driver;
    }
}
