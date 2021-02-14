package com.lodgify.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","json:target/cucumber.json",
                "html:target/default-html-reports"},
        features="src/test/resources/features",
        glue= "com/lodgify/stepDefs",
        dryRun =false,
        tags = "@smoke"

)
public class CukesRunner {
}
