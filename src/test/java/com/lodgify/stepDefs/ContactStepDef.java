package com.lodgify.stepDefs;

import com.lodgify.pages.ContactPageElement;
import com.lodgify.utilities.BrowserUtilities;
import com.lodgify.utilities.ConfigurationReader;
import com.lodgify.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.util.List;
import java.util.Map;

public class ContactStepDef {

    ContactPageElement contactPageElement = new ContactPageElement();

    @When("User navigate to Contact Page")
    public void user_navigate_to_contact_page() {

        Driver.get().get(ConfigurationReader.get("url_Contact"));
    }

    @When("User click on {string} button")
    public void user_click_on_button(String sendMessage) {

//
//        WebElement iframe = Driver.get().findElement(By.xpath("//div[@class='hbspt-form'and contains(@id,'hbsp')]/iframe"));
//
//        Driver.get().switchTo().frame(iframe);

        BrowserUtilities.switchToIframe(contactPageElement.iframe);
//        Driver.get().findElement(By.xpath("//input[@value='Send message']")).sendKeys(Keys.ENTER);
        contactPageElement.sendMessageButton.sendKeys(Keys.ENTER);


    }


    @Then("User should see Error message")
    public void user_should_see_error_message() {


        for (WebElement errorMessage : contactPageElement.errorMessage) {

            System.out.println(errorMessage.getText());

            Assert.assertTrue(errorMessage.isDisplayed());

        }

        BrowserUtilities.waitFor(5);
    }


    @When("User fill out the form with following information")
    public void user_fill_out_the_form_with_following_information(Map<String, String> info) {


        //Driver.get().navigate().refresh();

        BrowserUtilities.switchToIframe(contactPageElement.iframe);


        for (String key : info.keySet()) {

            System.out.println(key);


            for (String value : info.values()) {

                System.out.println(info.get(key));
                contactPageElement.inputBoxes(key).sendKeys(info.get(key));
                BrowserUtilities.waitFor(1);

                break;


            }


        }


    }

    @When("User should type message in message field")
    public void user_should_type_message_in_message_field() {


    }

    @When("User should check the I have read and agree to the Privacy Policy check box")
    public void user_should_check_the_i_have_read_and_agree_to_the_privacy_policy_check_box() {


    }

}
