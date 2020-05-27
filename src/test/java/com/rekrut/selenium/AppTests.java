package com.rekrut.selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTests {

    WebDriver webDriver;

    String productXp = ".//ul[@id='homefeatured']/li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 first-in-line first-item-of-tablet-line first-item-of-mobile-line']//a[@class='quick-view']";
    String button = "//*[@id='product']//button[@class='exclusive']";
    String removeProductXp = ".//a[@class='cart_quantity_delete']";
    String homePageUrl = "http://automationpractice.com";
    String CartUrl = "http://automationpractice.com/index.php?controller=order";


    @BeforeEach
    public void testSetUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get(homePageUrl);
        webDriver.navigate().to(webDriver.findElement(By.xpath(productXp)).getAttribute("href"));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement addCart = webDriver.findElement(By.xpath(button));
        addCart.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void addToCartTest() {
        webDriver.navigate().to(CartUrl);
        assertTrue(webDriver.findElements(By.xpath(removeProductXp)).size() == 1, "Remove button was not found");
        //assertTrue(webDriver.findElement(By.xpath(removeProductXp)).isDisplayed(),"Remove button was not found");
    }

    @AfterEach
    public void closeDriver() {
        webDriver.quit();
    }
}
