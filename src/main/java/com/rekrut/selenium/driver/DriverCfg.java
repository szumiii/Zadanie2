package com.rekrut.selenium.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverCfg {
    public static WebDriver driver;
    public static DriverCfg cfg;

    public static void setDriver(WebDriver driver){
        DriverCfg.driver = driver;
    }

    private DriverCfg(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
    }

    public static void init(){
        if(cfg==null){
            cfg=new DriverCfg();
        }
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
