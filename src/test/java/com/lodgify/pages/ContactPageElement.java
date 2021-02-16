package com.lodgify.pages;

import com.lodgify.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ContactPageElement {
    public ContactPageElement() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//label[@class='hs-error-msg']")
    public List<WebElement> errorMessage;

    @FindBy(xpath = "//a[contains(text(),'Contact Us')]")
    public WebElement contactPageLink;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement sendMessageButton;


    @FindBy(xpath = "//div[@class='hbspt-form'and contains(@id,'hbsp')]/iframe")
    public WebElement iframe;


    public WebElement inputBoxes(String inputLabel) {

        String path = "//*[@class='hs-input' and contains(@id,'" + inputLabel + "')]";

        return Driver.get().findElement(By.xpath(path));


    }

}
