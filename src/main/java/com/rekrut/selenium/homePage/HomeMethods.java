package com.rekrut.selenium.homePage;


public class HomeMethods {
    private HomeElements homeElements;

    public HomeMethods(HomeElements homeElements) {
        this.homeElements = homeElements;
    }

    public void clickButton(){
        homeElements.getButtonAddProduct().click();
    }

    public String returnProductAttribute(){
        return homeElements.getProduct().getAttribute("href");
    }
}
