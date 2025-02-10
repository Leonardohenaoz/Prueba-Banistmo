package com.bancolombia.run;

import org.junit.runner.RunWith;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "com.bancolombia.stepdefinitions"
)
public class RunTest {
}
