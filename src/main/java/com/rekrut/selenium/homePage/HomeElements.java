package com.rekrut.selenium.homePage;

import com.rekrut.selenium.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeElements extends BasePage {

    public HomeElements(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = HomeData.buttonAddCart)
    private WebElement buttonAddProduct;

    public WebElement getButtonAddProduct(){
        return buttonAddProduct;
    }

    @FindBy(xpath = HomeData.productXp)
    private WebElement product;

    public WebElement getProduct(){
        return product;
    }

    @FindBy(xpath = HomeData.removeProductXp)
    private WebElement buttonRemoveProduct;

    public WebElement getButtonRemoveProduct(){
        return buttonRemoveProduct;
    }


}
