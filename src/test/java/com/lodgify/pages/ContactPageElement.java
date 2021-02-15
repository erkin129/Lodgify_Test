package com.lodgify.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ContactPageElement {


    @FindBy(css = ".hs-error-msg")
    public List<WebElement> errorMessage;

    @FindBy(xpath = "//a[contains(text(),'Contact Us')]")
    public WebElement contactPageLink;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement sendMessageButton;

    @FindBy(css = ".hs_submit.hs-submit")
    public WebElement sendMessageButton1;
}
