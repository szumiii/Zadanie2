package com.rekrut.selenium.homePage;

import com.rekrut.selenium.driver.DriverSetup;
import com.rekrut.selenium.driver.DriverCfg;
import com.rekrut.selenium.driver.DriverSetup;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

class HomeMethodsTest {
    WebDriver driver;
    DriverSetup driverSetup ;
    HomeMethods homeMethods;
    HomeElements homeElements;

    @BeforeEach
    void setUp() {
        driver= new ChromeDriver();
        driverSetup = new DriverSetup();
        homeElements = new HomeElements(DriverCfg.getDriver());
        homeMethods = new HomeMethods(homeElements);
    }

    @Test
    public void addToCartTest(){
      //  driver.navigate().to("http://automationpractice.com");
     //   driver.navigate().to(homeMethods.returnProductAttribute());

        driver.navigate().to("http://automationpractice.com/index.php?id_product=1&controller=product");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        homeMethods.clickButton();
        //DriverCfg.getDriver().navigate().to("http://automationpractice.com/index.php?controller=order");
       // assertTrue(webDriver.findElements(By.xpath(removeProductXp)).size()==1," Nie znalazło");
        assertTrue(homeElements.getButtonRemoveProduct().isDisplayed(),"Remove button was not found");

    }

    @AfterEach
    void tearDown() {

        driverSetup.tearDown();
    }
}