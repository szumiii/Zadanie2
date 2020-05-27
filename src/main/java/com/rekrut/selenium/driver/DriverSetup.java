package com.rekrut.selenium.driver;

public class DriverSetup {

    public void openSite(String url){
        DriverCfg.getDriver().get(url);
    }

    public void tearDown(){
        DriverCfg.getDriver().quit();
        DriverCfg.setDriver(null);
    }
    public void setup(){
        DriverCfg.init();
    }


}
