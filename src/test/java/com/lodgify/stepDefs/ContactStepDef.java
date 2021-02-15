package com.lodgify.stepDefs;

import com.lodgify.pages.ContactPageElement;
import com.lodgify.utilities.BrowserUtilities;
import com.lodgify.utilities.ConfigurationReader;
import com.lodgify.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Map;

public class ContactStepDef {

    ContactPageElement contactPageElement=new ContactPageElement();
    @When("User navigate to Contact Page")
    public void user_navigate_to_contact_page() {

        Driver.get().get(ConfigurationReader.get("url_Contact"));
    }

    @When("User click on {string} button")
    public void user_click_on_button(String sendMessage) {

        Driver.get().switchTo().frame(0);
        //Driver.get().switchTo().frame("hs-form-iframe-0");

        System.out.println( contactPageElement.sendMessageButton.getText()+"=================================");
        contactPageElement.sendMessageButton.click();


    }




    @Then("User should see Error message")
    public void user_should_see_error_message() {
        for (WebElement errorMessage :contactPageElement.errorMessage ) {

            errorMessage.isDisplayed();

        }
    }



    @When("User fill out the form with following information")
    public void user_fill_out_the_form_with_following_information(Map<String ,String> info) {

        info.get("First Name");

    }
    @When("User should type message in message field")
    public void user_should_type_message_in_message_field() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User should check the I have read and agree to the Privacy Policy check box")
    public void user_should_check_the_i_have_read_and_agree_to_the_privacy_policy_check_box() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
