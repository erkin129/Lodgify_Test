package com.lodgify.stepDefs;

import com.lodgify.pages.PricePageElements;
import com.lodgify.utilities.BrowserUtilities;
import com.lodgify.utilities.ConfigurationReader;
import com.lodgify.utilities.Driver;
import io.cucumber.java.en.*;
import static org.junit.Assert.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PriceSearch {
    PricePageElements elements=new PricePageElements();


    @Given("User is on the Lodgify pricing page")
    public void user_is_on_the_lodgify_pricing_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("User move Number of Results slider from {int} to {int}")
    public void user_move_number_of_results_slide_bar_from_to(int start, int end) {
       // JavascriptExecutor jse=(JavascriptExecutor) Driver.get();
       BrowserUtilities.waitFor(5);
        Actions action=new Actions(Driver.get());
        action.dragAndDropBy(elements.slideBarButton,start,end).perform();
        BrowserUtilities.waitFor(5);

    }

    @Then("User should see {string} result on Number of Result slider")
    public void user_should_see_result_on_number_of_result_bar(String result) {
        assertEquals(elements.slideBarResult.getAttribute("value"),result);
        System.out.println("hmmm");
    }

    @Then("User should be able to see following prices depending on {string} {string} {string} {string}")
    public void user_should_be_able_to_see_following_prices_depending_on(String currency, String ultimate, String professional, String starter) {
        Select select=new Select(elements.dropdownCurrency);


        select.selectByValue(currency);


        BrowserUtilities.waitFor(2);


        assertEquals("Verify ultimate price",ultimate,elements.ultimatePrice.getText());
        assertEquals("Verify professional price",professional,elements.professionalPrice.getText());
        assertEquals("Verify starter price",starter,elements.starterPrice.getText());


    }



}
