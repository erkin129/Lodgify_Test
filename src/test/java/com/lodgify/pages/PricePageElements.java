package com.lodgify.pages;

import com.lodgify.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PricePageElements {

    public PricePageElements(){
        PageFactory.initElements(Driver.get(),this);
    }


    @FindBy (xpath = "//div[@class='slider-handle min-slider-handle round']")
    public WebElement slideBarButton;
    @FindBy (xpath = "//input[@id='scroll-prop-plan']")
    public WebElement slideBarResult;
    @FindBy(xpath = "(//span[@class='total-sum'])[3]")
    public WebElement ultimatePrice;
    @FindBy(xpath = "(//span[@class='total-sum'])[2]")
    public WebElement professionalPrice;
    @FindBy(xpath = "(//span[@class='total-sum'])[1]")
    public WebElement starterPrice;
    @FindBy (tagName = "select")
    public WebElement dropdownCurrency;



    public static WebElement selectCurrency(String currencyName){
        String path="//option[contains(text(),'"+currencyName+"')]";

        return Driver.get().findElement(By.xpath(path));
    }


}
